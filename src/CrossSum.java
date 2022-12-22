public class CrossSum {
    public static void main(String[] args) {
        long _number = 46836468;

        System.out.println ( "Number: " + _number );
        System.out.print ( "iterative calculated cross sum: ");
        System.out.println ( _itCrossSum ( _number ));
        System.out.print ( "recursively calculated cross sum: ");
        System.out.println ( _recCrossSum( _number ));
        System.out.print ( "weighted cross sum: ");
        System.out.println ( _weightedCrossSum( _number ));
    }

    public static long _itCrossSum ( long _number )
    {
        String _stringNumber = String.valueOf( _number );

        char[] _charArray = _stringNumber.toCharArray();

        int _stringLength = _stringNumber.length();

        long result = 0;

        for ( char _character : _charArray )
        {
            result += Character.getNumericValue(_character);
        }

        return result;

    }

    public static long _recCrossSum ( long _number )
    {
        return _number == 0 ? 0 : _number % 10 + _recCrossSum(_number/10);
    }

    public static long _weightedCrossSum ( long _number )
    {
    int[] _sequence = {1,3,2,-1,-3,-2};
    String _stringNumber = Long.toString( _number );
    char[] _charArray = _stringNumber.toCharArray();
    int i2 = 0;
    long _sum = 0;

    for (int i = _charArray.length -1; i > -1; i-- ){

        double result = Character.getNumericValue(_charArray[i]) * _sequence[i2];
        _sum += (long) Character.getNumericValue(_charArray[i]) * _sequence[i2];

        i2++;
        if ( i2 > 5 )
        {
        i2 = 0;
        }
    }

    return _sum;

    }
}