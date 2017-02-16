package com.doctusoft.ddd.persistence;

import com.doctusoft.ddd.model.Task;
import org.jetbrains.annotations.NotNull;

public interface TaskHandler {
    
    void execute(@NotNull Task task);
    
}
