# Adaptor-Design-Pattern

This is a simple demonstration of the **Adapter Design Pattern** in Java, showing how to integrate different third-party bank APIs (like ICICI and Yes Bank) into a unified interface that a payment platform (like PhonePe) can use.

## 🧠 Purpose

To decouple the `PhonePe` client from specific third-party bank implementations by using a common `BankAPIAdaptor` interface. This makes it easy to plug in new banks without changing the client code.

## 📦 Project Structure

BankAPIAdapterDemo/
│
├── PhonePe.java # Client class that uses BankAPIAdaptor
├── BankAPIAdaptor.java # Target interface (common contract)
│
├── ICICIBankAPI.java # Third-party ICICI bank API (stub)
├── ICICIBankAPIAdaptor.java # Adapter that wraps ICICIBankAPI
│
├── YesBankAPI.java # Third-party Yes Bank API (stub)
├── YesBankAPIAdaptor.java # Adapter that wraps YesBankAPI
│
└── Main.java # Demo runner to test the integration

## 🧩 Design Pattern Used

### Adapter Design Pattern

- **Target Interface:** `BankAPIAdaptor`
  
- **Adaptees:** `ICICIBankAPI`, `YesBankAPI`
  
- **Adapters:** `ICICIBankAPIAdaptor`, `YesBankAPIAdaptor`
  
- **Client:** `PhonePe`

## 🚀 How It Works

- `PhonePe` accepts any class that implements `BankAPIAdaptor`.
  
- Bank-specific adapters implement the common interface and internally delegate to their respective third-party APIs.
  
- This allows `PhonePe` to support multiple banks **without knowing their implementation details**.

## 🔧 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/BankAPIAdapterDemo.git
Open in your favorite IDE (e.g., IntelliJ or Eclipse).

Run the Main class to see how PhonePe interacts with different bank APIs via adapters.

📌 Example Output

Result with ICICI: 0.0
Result with Yes Bank: 0.0
(You’ll need to replace the stub methods with actual logic to get real outputs.)

✅ Benefits of This Approach

Easy to add new banks.

PhonePe code remains unchanged for any bank integration.

Encourages clean code and loose coupling.

🛠️ To Do

Implement real logic in ICICIBankAPI and YesBankAPI.

Add unit tests.

Improve logging and error handling.

📚 Learn More

Adapter Pattern - Refactoring Guru

Design Patterns in Java


