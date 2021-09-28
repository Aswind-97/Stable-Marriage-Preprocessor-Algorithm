# Stable-Marriage-Preprocessor-Algorithm
### Preprocessor for Stable Marriage(ProposeDispose) Algorithm

### Overview: 
The StableMarriage problem receives its input as ranked lists. Every man ranks the women from most to least desired and every woman ranks the men from most to least desirable. Recall that running the ProposeDispose algorithm in the most obvious way using these ranked lists results in an O(N3) algorithm where N is the number of men (or women). The reason this occurs is that when an engaged woman receives a proposal, she must linearly scan her list to determine which of the men she prefers. In class we showed a preprocessing step that could be done to reduce the time to O(N2). In this project you’ll be given the matrix (2-d array) containing the women’s rankings and need to perform this preprocessing step.
