package videos.telegramic.das9.neo;

import java.net.PortUnreachableException;

public enum Hashvich implements IAshxatavardzEnum{
    GUMARUM{
        @Override
        public long getResult(int a, int b) {
            return a + b;
        }

        public void aea(){
            System.out.println("??????????");
        }
    },
    HANUM {
        @Override
        public long getResult(int a, int b) {
            return a - b;
        }
    },
    BAZMAAPTKUM {
        @Override
        public long getResult(int a, int b) {
            return a * b;
        }
    },
    BAJANUM {
        @Override
        public long getResult(int a, int b) {
            return a / b;
        }
    };

}
