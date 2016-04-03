package com.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TaskScheduler extends PriorityBlockingQueue<Task> implements Stream<Task> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean addAll(Collection<? extends Task> c) {
		return super.addAll(c);
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public boolean contains(Object o) {
		return super.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return super.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public Iterator<Task> iterator() {
		return super.iterator();
	}

	@Override
	public boolean remove(Object o) {
		return super.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return super.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return super.retainAll(c);
	}

	@Override
	public int size() {
		return super.size();
	}

	@Override
	public Object[] toArray() {
		return super.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return super.toArray(a);
	}

	@Override
	public boolean add(Task e) {
		return super.add(e);
	}

	@Override
	public Task element() {
		return super.element();
	}

	@Override
	public boolean offer(Task e) {
		return super.offer(e);
	}

	@Override
	public Task peek() {
		return super.peek();
	}

	@Override
	public Task poll() {
		return super.poll();
	}

	@Override
	public Task remove() {
		return super.remove();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stream<Task> onClose(Runnable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> parallel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> sequential() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> unordered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean allMatch(Predicate<? super Task> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean anyMatch(Predicate<? super Task> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <R, A> R collect(Collector<? super Task, A, R> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> R collect(Supplier<R> arg0, BiConsumer<R, ? super Task> arg1, BiConsumer<R, R> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Stream<Task> distinct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> filter(Predicate<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> findAny() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> findFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> flatMap(Function<? super Task, ? extends Stream<? extends R>> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream flatMapToDouble(Function<? super Task, ? extends DoubleStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream flatMapToInt(Function<? super Task, ? extends IntStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream flatMapToLong(Function<? super Task, ? extends LongStream> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(Consumer<? super Task> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void forEachOrdered(Consumer<? super Task> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Stream<Task> limit(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Stream<R> map(Function<? super Task, ? extends R> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntStream mapToInt(ToIntFunction<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LongStream mapToLong(ToLongFunction<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> max(Comparator<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> min(Comparator<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean noneMatch(Predicate<? super Task> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Stream<Task> peek(Consumer<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Task> reduce(BinaryOperator<Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Task reduce(Task arg0, BinaryOperator<Task> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <U> U reduce(U arg0, BiFunction<U, ? super Task, U> arg1, BinaryOperator<U> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> skip(long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> sorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Task> sorted(Comparator<? super Task> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <A> A[] toArray(IntFunction<A[]> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
