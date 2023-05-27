package org.example.Model.Logger;

import org.example.Model.Toys.Toy;

public interface ILog {
    void update(String message, Toy toy);
    void updateString(String text);
}
