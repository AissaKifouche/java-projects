class CustomCheckedException extends Exception {

    CustomCheckedException() throws Exception {
        super();
    }

    CustomCheckedException(String message) throws Exception {
        super(message);
    }

}
