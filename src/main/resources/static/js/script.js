const CLIENT_ID = 14002582;
const RETURN_URL = "http://localhost:8080/payment";
const CLIENT_REF = "CREF-12345";
const AMOUNT = 1000; // the amount should be specified in the base unit of the currency. For LKR, this is cents
const CURRENCY = "LKR";

// hosted checkout
function buildPayment() {
    return {
        clientId: CLIENT_ID,
        paymentAmount: AMOUNT,
        currency: CURRENCY,
        returnUrl: RETURN_URL,
        clientRef: CLIENT_REF,
        comment: 'This is a demo payment'
    };
}

// iframe checkout
document.addEventListener("DOMContentLoaded", (event) => {
    loadPaycorpPayment(buildPayment(), 'paycorp-payment');
});
function buildIframePayment() {
    return {
        clientId: CLIENT_ID,
        paymentAmount: AMOUNT,
        currency: CURRENCY,
        returnUrl: RETURN_URL,
        clientRef: CLIENT_REF,
        comment: 'This is a demo payment'
    };
}