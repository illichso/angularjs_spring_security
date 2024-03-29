package tutorial.core.repositories;

import tutorial.core.models.entities.BlogEntry;

import java.util.List;

public interface BlogEntryRepo {
    BlogEntry findBlogEntry(Long id); // Returns the BlogEntry or null if it can't be found
    BlogEntry deleteBlogEntry(Long id); // Deletes the found BlogEntry or returns null if it can't be found

    /**
     * @param id the id of the BlogEntry to updateBlogEntry
     * @param data the BlogEntry containing the data to be used for the updateBlogEntry
     * @return the updated BlogEntry or null if the BlogEntry with the id cannot be found
     */
    BlogEntry updateBlogEntry(Long id, BlogEntry data);

    BlogEntry createBlogEntry(BlogEntry data);

    List<BlogEntry> findByBlogId(Long blogId);
}
