const form = document.getElementById("transaction-form");
const textInput = document.getElementById("text");
const amountInput = document.getElementById("amount");
const typeInput = document.getElementById("type");
const categoryInput = document.getElementById("category");
const dateInput = document.getElementById("date");

const balanceEl = document.getElementById("balance");
const incomeEl = document.getElementById("income");
const expenseEl = document.getElementById("expense");
const transactionList = document.getElementById("transaction-list");

const themeToggleBtn = document.getElementById("theme-toggle");
const clearAllBtn = document.getElementById("clear-all");

let transactions = JSON.parse(localStorage.getItem("transactions")) || [];
let currentTheme = localStorage.getItem("theme") || "light";
let chart;

// load theme
if (currentTheme === "dark") {
  document.body.classList.add("dark");
}

themeToggleBtn.addEventListener("click", function () {
  document.body.classList.toggle("dark");

  if (document.body.classList.contains("dark")) {
    localStorage.setItem("theme", "dark");
  } else {
    localStorage.setItem("theme", "light");
  }
});

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const text = textInput.value.trim();
  const amount = Number(amountInput.value);
  const type = typeInput.value;
  const category = categoryInput.value.trim();
  const date = dateInput.value;

  if (text === "" || amount <= 0 || type === "" || date === "") {
    alert("Please fill all fields correctly.");
    return;
  }

  const transaction = {
    id: Date.now(),
    text: text,
    amount: amount,
    type: type,
    category: category || "General",
    date: date
  };

  transactions.push(transaction);
  saveData();
  updateUI();
  form.reset();
});

clearAllBtn.addEventListener("click", function () {
  if (transactions.length === 0) {
    alert("No transactions to clear.");
    return;
  }

  const confirmClear = confirm("Are you sure you want to delete all transactions?");
  if (confirmClear) {
    transactions = [];
    saveData();
    updateUI();
  }
});

function updateUI() {
  transactionList.innerHTML = "";

  let income = 0;
  let expense = 0;

  if (transactions.length === 0) {
    transactionList.innerHTML = `<li class="empty-message">No transactions added yet.</li>`;
  } else {
    transactions
      .slice()
      .reverse()
      .forEach(function (transaction) {
        const li = document.createElement("li");

        const amountText =
          transaction.type === "income"
            ? `+ ₹${transaction.amount.toFixed(2)}`
            : `- ₹${transaction.amount.toFixed(2)}`;

        li.innerHTML = `
          <div class="transaction-item">
            <div class="transaction-info">
              <div class="transaction-title">${transaction.text}</div>
              <div class="transaction-meta">
                Category: ${transaction.category} | Date: ${transaction.date}
              </div>
              <div class="transaction-amount">${amountText} (${transaction.type})</div>
            </div>
            <button class="delete-btn" onclick="deleteTransaction(${transaction.id})">Delete</button>
          </div>
        `;

        transactionList.appendChild(li);
      });
  }

  transactions.forEach(function (transaction) {
    if (transaction.type === "income") {
      income += transaction.amount;
    } else {
      expense += transaction.amount;
    }
  });

  const balance = income - expense;

  incomeEl.textContent = `₹${income.toFixed(2)}`;
  expenseEl.textContent = `₹${expense.toFixed(2)}`;
  balanceEl.textContent = `₹${balance.toFixed(2)}`;

  updateChart(income, expense);
}

function deleteTransaction(id) {
  transactions = transactions.filter(function (transaction) {
    return transaction.id !== id;
  });

  saveData();
  updateUI();
}

function saveData() {
  localStorage.setItem("transactions", JSON.stringify(transactions));
}

function updateChart(income, expense) {
  const canvas = document.getElementById("myChart");

  if (!canvas) return;

  const ctx = canvas.getContext("2d");

  if (chart) {
    chart.destroy();
  }

  chart = new Chart(ctx, {
    type: "doughnut",
    data: {
      labels: ["Income", "Expense"],
      datasets: [
        {
          data: [income, expense],
          backgroundColor: ["#22c55e", "#ef4444"],
          borderWidth: 2
        }
      ]
    },
    options: {
      responsive: true,
      plugins: {
        legend: {
          labels: {
            color: document.body.classList.contains("dark") ? "#ffffff" : "#ffffff"
          }
        }
      }
    }
  });
}

updateUI();