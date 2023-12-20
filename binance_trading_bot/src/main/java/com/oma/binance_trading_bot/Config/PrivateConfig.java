package com.oma.binance_trading_bot.Config;

public class PrivateConfig {
    private PrivateConfig() {
    }
    public static final String BASE_URL = "https://testnet.binance.vision";

    public static final String API_KEY = "2yf5YNCPAlcE7AfeBJVAl27BwYjc1lTje9RIFqkpU8M9XGGVaN148wwkMbw3Y6AR";
    public static final String SECRET_KEY = "reIgkDtTAVPRDtrmzWoZzbs5IVYpLVVSCoSSWz6CdZUpClR528mR1WBwZuSuY87Y"; // Unnecessary if PRIVATE_KEY_PATH is used
    public static final String PRIVATE_KEY_PATH = ""; // Key must be PKCS#8 standard

    public static final String TESTNET_API_KEY = "2yf5YNCPAlcE7AfeBJVAl27BwYjc1lTje9RIFqkpU8M9XGGVaN148wwkMbw3Y6AR";
    public static final String TESTNET_SECRET_KEY = "reIgkDtTAVPRDtrmzWoZzbs5IVYpLVVSCoSSWz6CdZUpClR528mR1WBwZuSuY87Y"; // Unnecessary if TESTNET_PRIVATE_KEY_PATH is used
    public static final String TESTNET_PRIVATE_KEY_PATH = ""; //Key must be PKCS#8 standard
}
