Caesar Cipher
The Caesar Cipher, used by Julius Caesar around 58 BC, is a substitution cipher that shifts letters in a message to make it unreadable if intercepted. To decrypt, the receiver reverses the shift.

A shift number indicates how many letters the receiver should move along the alphabet to decrypt the message. For example: encoded message of Khoor with a shift key of 3 would mean that the original message had been shifted along the alphabet by 3 characters so reversing would lead to K -3 letters = H etc leading to the decoded message of Hello

More reading on caesar cipher wikipedia link
https://en.wikipedia.org/wiki/Caesar_cipher

To Encode a string please choose 1, and to decode please choose 2 when prompted.
After this, you can enter your string and a shift key, and based on your choices the string will be translated.

When you encode "Hello" with a shift of 3 it will result in "Khoor"

Note:
Our application handled numbers and special characters, these will stay the same.
We have found that the char "£" can return a different character based on the encoding env var of the cmd line interface.
