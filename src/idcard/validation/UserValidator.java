package idcard.validation;

import idcard.model.User;

public class UserValidator {
    public static boolean isValid(User user) {
        return user.getName() != null && !user.getName().isEmpty();
    }
}
