package org.infinispan;

import org.infinispan.config.Configuration;
import org.infinispan.lifecycle.ComponentStatus;
import org.infinispan.manager.CacheManager;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**                                                                 
 * This is a convenient base class for implementing a cache delegate. The only constructor takes a {@link Cache} argument, to
 * which each method call is delegated. One can extend this class and override the method sub-set it is interested in.
 * There is also an similar implmentation for {@link org.infinispan.AdvancedCache}:
 * {@link org.infinispan.AbstractDelegatingAdvancedCache}.
 *
 * @see org.infinispan.AbstractDelegatingAdvancedCache
 * @author Mircea.Markus@jboss.com
 */
public abstract class AbstractDelegatingCache<K, V> implements Cache<K, V> {

   private Cache<K, V> cache;

   public AbstractDelegatingCache(Cache<K, V> cache) {
      this.cache = cache;
   }

   public void putForExternalRead(K key, V value) {
      cache.putForExternalRead(key, value);
   }

   public void evict(K key) {
      cache.evict(key);
   }

   public Configuration getConfiguration() {
      return cache.getConfiguration();
   }

   public boolean startBatch() {
      return cache.startBatch();
   }

   public void endBatch(boolean successful) {
      cache.endBatch(successful);
   }

   public String getName() {
      return cache.getName();
   }

   public String getVersion() {
      return cache.getVersion();
   }

   public CacheManager getCacheManager() {
      return cache.getCacheManager();
   }

   public V put(K key, V value, long lifespan, TimeUnit unit) {
      return cache.put(key, value, lifespan, unit);
   }

   public V putIfAbsent(K key, V value, long lifespan, TimeUnit unit) {
      return cache.putIfAbsent(key, value, lifespan, unit);
   }

   public void putAll(Map<? extends K, ? extends V> map, long lifespan, TimeUnit unit) {
      cache.putAll(map, lifespan, unit);
   }

   public V replace(K key, V value, long lifespan, TimeUnit unit) {
      return cache.replace(key, value, lifespan, unit);
   }

   public boolean replace(K key, V oldValue, V value, long lifespan, TimeUnit unit) {
      return cache.replace(key, oldValue, value, lifespan, unit);
   }

   public V put(K key, V value, long lifespan, TimeUnit lifespanUnit, long maxIdleTime, TimeUnit maxIdleTimeUnit) {
      return cache.put(key, value, lifespan, lifespanUnit, maxIdleTime, maxIdleTimeUnit);
   }

   public V putIfAbsent(K key, V value, long lifespan, TimeUnit lifespanUnit, long maxIdleTime, TimeUnit maxIdleTimeUnit) {
      return cache.putIfAbsent(key, value, lifespan, lifespanUnit, maxIdleTime, maxIdleTimeUnit);
   }

   public void putAll(Map<? extends K, ? extends V> map, long lifespan, TimeUnit lifespanUnit, long maxIdleTime, TimeUnit maxIdleTimeUnit) {
      cache.putAll(map, lifespan, lifespanUnit, maxIdleTime, maxIdleTimeUnit);
   }

   public V replace(K key, V value, long lifespan, TimeUnit lifespanUnit, long maxIdleTime, TimeUnit maxIdleTimeUnit) {
      return cache.replace(key, value, lifespan, lifespanUnit, maxIdleTime, maxIdleTimeUnit);
   }

   public boolean replace(K key, V oldValue, V value, long lifespan, TimeUnit lifespanUnit, long maxIdleTime, TimeUnit maxIdleTimeUnit) {
      return cache.replace(key, oldValue, value, lifespan, lifespanUnit, maxIdleTime, maxIdleTimeUnit);
   }

   public AdvancedCache<K, V> getAdvancedCache() {
      return cache.getAdvancedCache();
   }

   public void compact() {
      cache.compact();
   }

   public ComponentStatus getStatus() {
      return cache.getStatus();
   }

   public V putIfAbsent(K key, V value) {
      return cache.putIfAbsent(key, value);
   }

   public boolean remove(Object key, Object value) {
      return cache.remove(key, value);
   }

   public boolean replace(K key, V oldValue, V newValue) {
      return cache.replace(key, oldValue, newValue);
   }

   public V replace(K key, V value) {
      return cache.replace(key, value);
   }

   public int size() {
      return cache.size();
   }

   public boolean isEmpty() {
      return cache.isEmpty();
   }

   public boolean containsKey(Object key) {
      return cache.containsKey(key);
   }

   public boolean containsValue(Object value) {
      return cache.containsValue(value);
   }

   public V get(Object key) {
      return cache.get(key);
   }

   public V put(K key, V value) {
      return cache.put(key, value);
   }

   public V remove(Object key) {
      return cache.remove(key);
   }

   public void putAll(Map<? extends K, ? extends V> t) {
      cache.putAll(t);
   }

   public void clear() {
      cache.clear();
   }

   public Set<K> keySet() {
      return cache.keySet();
   }

   public Set<Entry<K, V>> entrySet() {
      return cache.entrySet();
   }

   public Collection<V> values() {
      return cache.values();
   }

   public void start() {
      cache.start();
   }

   public void stop() {
      cache.stop();
   }

   public void addListener(Object listener) {
      cache.addListener(listener);
   }

   public void removeListener(Object listener) {
      cache.removeListener(listener);
   }

   public Set<Object> getListeners() {
      return cache.getListeners();
   }
}
