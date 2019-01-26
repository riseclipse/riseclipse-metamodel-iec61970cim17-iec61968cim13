/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IntervalBlock;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PendingCalculation;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pending Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getMultiplyBeforeAdd <em>Multiply Before Add</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getScalarDenominator <em>Scalar Denominator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getScalarFloat <em>Scalar Float</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getScalarNumerator <em>Scalar Numerator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getReadingType <em>Reading Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PendingCalculationImpl#getIntervalBlocks <em>Interval Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PendingCalculationImpl extends CimObjectWithIDImpl implements PendingCalculation {
    /**
     * The default value of the '{@link #getMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplyBeforeAdd()
     * @generated
     * @ordered
     */
    protected static final Boolean MULTIPLY_BEFORE_ADD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMultiplyBeforeAdd() <em>Multiply Before Add</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMultiplyBeforeAdd()
     * @generated
     * @ordered
     */
    protected Boolean multiplyBeforeAdd = MULTIPLY_BEFORE_ADD_EDEFAULT;

    /**
     * This is true if the Multiply Before Add attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean multiplyBeforeAddESet;

    /**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected static final Integer OFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
    protected Integer offset = OFFSET_EDEFAULT;

    /**
     * This is true if the Offset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean offsetESet;

    /**
     * The default value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarDenominator()
     * @generated
     * @ordered
     */
    protected static final Integer SCALAR_DENOMINATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScalarDenominator() <em>Scalar Denominator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarDenominator()
     * @generated
     * @ordered
     */
    protected Integer scalarDenominator = SCALAR_DENOMINATOR_EDEFAULT;

    /**
     * This is true if the Scalar Denominator attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scalarDenominatorESet;

    /**
     * The default value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarFloat()
     * @generated
     * @ordered
     */
    protected static final Float SCALAR_FLOAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScalarFloat() <em>Scalar Float</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarFloat()
     * @generated
     * @ordered
     */
    protected Float scalarFloat = SCALAR_FLOAT_EDEFAULT;

    /**
     * This is true if the Scalar Float attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scalarFloatESet;

    /**
     * The default value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarNumerator()
     * @generated
     * @ordered
     */
    protected static final Integer SCALAR_NUMERATOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getScalarNumerator() <em>Scalar Numerator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScalarNumerator()
     * @generated
     * @ordered
     */
    protected Integer scalarNumerator = SCALAR_NUMERATOR_EDEFAULT;

    /**
     * This is true if the Scalar Numerator attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scalarNumeratorESet;

    /**
     * The cached value of the '{@link #getReadingType() <em>Reading Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingType()
     * @generated
     * @ordered
     */
    protected ReadingType readingType;

    /**
     * This is true if the Reading Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readingTypeESet;

    /**
     * The cached value of the '{@link #getIntervalBlocks() <em>Interval Blocks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntervalBlocks()
     * @generated
     * @ordered
     */
    protected EList< IntervalBlock > intervalBlocks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PendingCalculationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPendingCalculation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMultiplyBeforeAdd() {
        return multiplyBeforeAdd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMultiplyBeforeAdd( Boolean newMultiplyBeforeAdd ) {
        Boolean oldMultiplyBeforeAdd = multiplyBeforeAdd;
        multiplyBeforeAdd = newMultiplyBeforeAdd;
        boolean oldMultiplyBeforeAddESet = multiplyBeforeAddESet;
        multiplyBeforeAddESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD,
                    oldMultiplyBeforeAdd, multiplyBeforeAdd, !oldMultiplyBeforeAddESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMultiplyBeforeAdd() {
        Boolean oldMultiplyBeforeAdd = multiplyBeforeAdd;
        boolean oldMultiplyBeforeAddESet = multiplyBeforeAddESet;
        multiplyBeforeAdd = MULTIPLY_BEFORE_ADD_EDEFAULT;
        multiplyBeforeAddESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD,
                        oldMultiplyBeforeAdd, MULTIPLY_BEFORE_ADD_EDEFAULT, oldMultiplyBeforeAddESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMultiplyBeforeAdd() {
        return multiplyBeforeAddESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getOffset() {
        return offset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOffset( Integer newOffset ) {
        Integer oldOffset = offset;
        offset = newOffset;
        boolean oldOffsetESet = offsetESet;
        offsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PENDING_CALCULATION__OFFSET, oldOffset, offset, !oldOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOffset() {
        Integer oldOffset = offset;
        boolean oldOffsetESet = offsetESet;
        offset = OFFSET_EDEFAULT;
        offsetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PENDING_CALCULATION__OFFSET, oldOffset, OFFSET_EDEFAULT, oldOffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOffset() {
        return offsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getScalarDenominator() {
        return scalarDenominator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScalarDenominator( Integer newScalarDenominator ) {
        Integer oldScalarDenominator = scalarDenominator;
        scalarDenominator = newScalarDenominator;
        boolean oldScalarDenominatorESet = scalarDenominatorESet;
        scalarDenominatorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR,
                    oldScalarDenominator, scalarDenominator, !oldScalarDenominatorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScalarDenominator() {
        Integer oldScalarDenominator = scalarDenominator;
        boolean oldScalarDenominatorESet = scalarDenominatorESet;
        scalarDenominator = SCALAR_DENOMINATOR_EDEFAULT;
        scalarDenominatorESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR,
                        oldScalarDenominator, SCALAR_DENOMINATOR_EDEFAULT, oldScalarDenominatorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScalarDenominator() {
        return scalarDenominatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getScalarFloat() {
        return scalarFloat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScalarFloat( Float newScalarFloat ) {
        Float oldScalarFloat = scalarFloat;
        scalarFloat = newScalarFloat;
        boolean oldScalarFloatESet = scalarFloatESet;
        scalarFloatESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PENDING_CALCULATION__SCALAR_FLOAT, oldScalarFloat, scalarFloat, !oldScalarFloatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScalarFloat() {
        Float oldScalarFloat = scalarFloat;
        boolean oldScalarFloatESet = scalarFloatESet;
        scalarFloat = SCALAR_FLOAT_EDEFAULT;
        scalarFloatESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PENDING_CALCULATION__SCALAR_FLOAT,
                    oldScalarFloat, SCALAR_FLOAT_EDEFAULT, oldScalarFloatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScalarFloat() {
        return scalarFloatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getScalarNumerator() {
        return scalarNumerator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setScalarNumerator( Integer newScalarNumerator ) {
        Integer oldScalarNumerator = scalarNumerator;
        scalarNumerator = newScalarNumerator;
        boolean oldScalarNumeratorESet = scalarNumeratorESet;
        scalarNumeratorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR,
                    oldScalarNumerator, scalarNumerator, !oldScalarNumeratorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetScalarNumerator() {
        Integer oldScalarNumerator = scalarNumerator;
        boolean oldScalarNumeratorESet = scalarNumeratorESet;
        scalarNumerator = SCALAR_NUMERATOR_EDEFAULT;
        scalarNumeratorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR,
                    oldScalarNumerator, SCALAR_NUMERATOR_EDEFAULT, oldScalarNumeratorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetScalarNumerator() {
        return scalarNumeratorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingType getReadingType() {
        if( readingType != null && readingType.eIsProxy() ) {
            InternalEObject oldReadingType = ( InternalEObject ) readingType;
            readingType = ( ReadingType ) eResolveProxy( oldReadingType );
            if( readingType != oldReadingType ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.PENDING_CALCULATION__READING_TYPE, oldReadingType, readingType ) );
            }
        }
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadingType basicGetReadingType() {
        return readingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReadingType( ReadingType newReadingType, NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = newReadingType;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, oldReadingType, newReadingType, !oldReadingTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReadingType( ReadingType newReadingType ) {
        if( newReadingType != readingType ) {
            NotificationChain msgs = null;
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs );
            if( newReadingType != null ) msgs = ( ( InternalEObject ) newReadingType ).eInverseAdd( this,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs );
            msgs = basicSetReadingType( newReadingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PENDING_CALCULATION__READING_TYPE,
                        newReadingType, newReadingType, !oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReadingType( NotificationChain msgs ) {
        ReadingType oldReadingType = readingType;
        readingType = null;
        boolean oldReadingTypeESet = readingTypeESet;
        readingTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, oldReadingType, null, oldReadingTypeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReadingType() {
        if( readingType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs );
            msgs = basicUnsetReadingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingTypeESet = readingTypeESet;
            readingTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PENDING_CALCULATION__READING_TYPE, null, null, oldReadingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingType() {
        return readingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< IntervalBlock > getIntervalBlocks() {
        if( intervalBlocks == null ) {
            intervalBlocks = new EObjectWithInverseResolvingEList.Unsettable< IntervalBlock >( IntervalBlock.class,
                    this, CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS,
                    CimPackage.INTERVAL_BLOCK__PENDING_CALCULATION );
        }
        return intervalBlocks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntervalBlocks() {
        if( intervalBlocks != null ) ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntervalBlocks() {
        return intervalBlocks != null && ( ( InternalEList.Unsettable< ? > ) intervalBlocks ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            if( readingType != null ) msgs = ( ( InternalEObject ) readingType ).eInverseRemove( this,
                    CimPackage.READING_TYPE__PENDING_CALCULATION, ReadingType.class, msgs );
            return basicSetReadingType( ( ReadingType ) otherEnd, msgs );
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getIntervalBlocks() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            return basicUnsetReadingType( msgs );
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            return ( ( InternalEList< ? > ) getIntervalBlocks() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
            return getMultiplyBeforeAdd();
        case CimPackage.PENDING_CALCULATION__OFFSET:
            return getOffset();
        case CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
            return getScalarDenominator();
        case CimPackage.PENDING_CALCULATION__SCALAR_FLOAT:
            return getScalarFloat();
        case CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
            return getScalarNumerator();
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            if( resolve ) return getReadingType();
            return basicGetReadingType();
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            return getIntervalBlocks();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
            setMultiplyBeforeAdd( ( Boolean ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__OFFSET:
            setOffset( ( Integer ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
            setScalarDenominator( ( Integer ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_FLOAT:
            setScalarFloat( ( Float ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
            setScalarNumerator( ( Integer ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            setReadingType( ( ReadingType ) newValue );
            return;
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            getIntervalBlocks().clear();
            getIntervalBlocks().addAll( ( Collection< ? extends IntervalBlock > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
            unsetMultiplyBeforeAdd();
            return;
        case CimPackage.PENDING_CALCULATION__OFFSET:
            unsetOffset();
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
            unsetScalarDenominator();
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_FLOAT:
            unsetScalarFloat();
            return;
        case CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
            unsetScalarNumerator();
            return;
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            unsetReadingType();
            return;
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            unsetIntervalBlocks();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.PENDING_CALCULATION__MULTIPLY_BEFORE_ADD:
            return isSetMultiplyBeforeAdd();
        case CimPackage.PENDING_CALCULATION__OFFSET:
            return isSetOffset();
        case CimPackage.PENDING_CALCULATION__SCALAR_DENOMINATOR:
            return isSetScalarDenominator();
        case CimPackage.PENDING_CALCULATION__SCALAR_FLOAT:
            return isSetScalarFloat();
        case CimPackage.PENDING_CALCULATION__SCALAR_NUMERATOR:
            return isSetScalarNumerator();
        case CimPackage.PENDING_CALCULATION__READING_TYPE:
            return isSetReadingType();
        case CimPackage.PENDING_CALCULATION__INTERVAL_BLOCKS:
            return isSetIntervalBlocks();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (multiplyBeforeAdd: " );
        if( multiplyBeforeAddESet )
            result.append( multiplyBeforeAdd );
        else
            result.append( "<unset>" );
        result.append( ", offset: " );
        if( offsetESet )
            result.append( offset );
        else
            result.append( "<unset>" );
        result.append( ", scalarDenominator: " );
        if( scalarDenominatorESet )
            result.append( scalarDenominator );
        else
            result.append( "<unset>" );
        result.append( ", scalarFloat: " );
        if( scalarFloatESet )
            result.append( scalarFloat );
        else
            result.append( "<unset>" );
        result.append( ", scalarNumerator: " );
        if( scalarNumeratorESet )
            result.append( scalarNumerator );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PendingCalculationImpl
