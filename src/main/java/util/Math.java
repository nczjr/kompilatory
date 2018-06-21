package util;

public class Math {

    public static Object add(Object a, Object b) {
        if (a.getClass() == String.class || b.getClass() == String.class) {
            return a.toString() + b.toString();
        }
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) a + (int) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) a + (double) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) a + (double) (Integer) b;
        } else {
            return (double) b + (double) (Integer) a;
        }
    }

    public static Object subtract(Object a, Object b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) b - (int) a;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) b - (double) a;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return  (double) (Integer) b - (double) a ;
        } else {
            return (double) b - (double) (Integer) a;
        }
    }

    public static Object divide(Object a, Object b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) b / (int) a;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) b / (double) a;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) (Integer) b / (double) a;
        } else {
            return (double) b / (double) (Integer) a;
        }
    }

    public static Object multiply(Object a, Object b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) a * (int) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) a * (double) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) a * (double) (Integer) b;
        } else {
            return (double) b * (double) (Integer) a;
        }
    }

    public static boolean lower(Object a, Object b) {
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) a < (int) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) a < (double) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) a < (double) (Integer) b;
        } else {
            return (double) (Integer) a < (double) b;
        }
    }

    public static boolean notEqual(Object a, Object b) {
        if (a.getClass() == String.class || b.getClass() == String.class) {
            return !a.toString().equals(b.toString());
        }
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) a != (int) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) a != (double) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) a != (double) (Integer) b;
        } else {
            return (double) b != (double) (Integer) a;
        }
    }


    public static boolean equal(Object a, Object b) {
        if (a.getClass() == String.class || b.getClass() == String.class) {
            return a.toString().equals(b.toString());
        }
        if (a.getClass() == Integer.class && b.getClass() == Integer.class) {
            return (int) a == (int) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Double.class) {
            return (double) a == (double) b;
        }
        if (a.getClass() == Double.class && b.getClass() == Integer.class) {
            return (double) a == (double) (Integer) b;
        } else {
            return (double) b == (double) (Integer) a;
        }
    }

    public static boolean lowerEqual(Object a, Object b) {
        return lower(a, b) || equal(a, b);
    }

    public static boolean greater(Object a, Object b) {
        return !lower(a, b) && !equal(a, b);
    }

    public static boolean greaterEqual(Object a, Object b) {
        return !lower(a, b);
    }
}
