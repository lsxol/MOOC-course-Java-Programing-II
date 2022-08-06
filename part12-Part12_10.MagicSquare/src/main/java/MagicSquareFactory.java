
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int row = size-1;
        int col = size/2;
        square.placeValue(row, col, 1);

        for (int i = 2; i <= size*size; i++) {
            if (square.readValue((row + 1) % size, (col + 1) % size) == 0) {
                row = (row + 1) % size;
                col = (col + 1) % size;
            }
            else {
                row = (row - 1 + size) % size;
                // don't change col
            }
            square.placeValue(row, col, i);
        }

        return square;
    }

}
