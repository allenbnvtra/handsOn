#include <iostream>

using namespace std;

int main() {

    int hour;  // Declare an integer variable named 'hour' to store the input hours.
    int hourToMinute;  // Declare an integer variable named 'hourToMinute' to store the hours converted to minutes.
    int minute;  // Declare an integer variable named 'minute' to store the input minutes.
    int totalMinute;  // Declare an integer variable named 'totalMinute' to store the total minutes.

    cout << "Enter hours: ";  // Display a prompt to the user to enter hours.
    cin >> hour;  // Read the user's input for hours and store it in the 'hour' variable.

    hourToMinute = hour * 60;  // Convert the entered hours to minutes and store the result in 'hourToMinute'.

    cout << "Enter minute: ";  // Display a prompt to the user to enter minutes.
    cin >> minute;  // Read the user's input for minutes and store it in the 'minute' variable.

    totalMinute = hourToMinute + minute;  // Calculate the total minutes by adding 'hourToMinute' and 'minute'.

    cout << totalMinute << " minutes";  // Display the total minutes and a message indicating it's in minutes.

}
