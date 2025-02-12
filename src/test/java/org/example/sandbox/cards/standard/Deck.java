package org.example.sandbox.cards.standard;

import javax.naming.OperationNotSupportedException;

public interface Deck
{
    void shuffle();
    void cut(int index);
    Card deal();
    Card turnOver();
    void newOrder(Deck cards);
    int search(Card card);
    Card draw();

    default int newSize() throws OperationNotSupportedException
    {
        throw new OperationNotSupportedException();
    }
}
