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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Accumulator;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorImpl#getAccumulatorValues <em>Accumulator Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorImpl#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorImpl extends MeasurementImpl implements Accumulator {
    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected Integer maxValue = MAX_VALUE_EDEFAULT;

    /**
     * This is true if the Max Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxValueESet;

    /**
     * The cached value of the '{@link #getAccumulatorValues() <em>Accumulator Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulatorValues()
     * @generated
     * @ordered
     */
    protected EList< AccumulatorValue > accumulatorValues;

    /**
     * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitSets()
     * @generated
     * @ordered
     */
    protected EList< AccumulatorLimitSet > limitSets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxValue( Integer newMaxValue ) {
        Integer oldMaxValue = maxValue;
        maxValue = newMaxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACCUMULATOR__MAX_VALUE, oldMaxValue, maxValue, !oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxValue() {
        Integer oldMaxValue = maxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValue = MAX_VALUE_EDEFAULT;
        maxValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACCUMULATOR__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT, oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxValue() {
        return maxValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccumulatorValue > getAccumulatorValues() {
        if( accumulatorValues == null ) {
            accumulatorValues = new EObjectWithInverseResolvingEList.Unsettable< AccumulatorValue >(
                    AccumulatorValue.class, this, CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR );
        }
        return accumulatorValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccumulatorValues() {
        if( accumulatorValues != null ) ( ( InternalEList.Unsettable< ? > ) accumulatorValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulatorValues() {
        return accumulatorValues != null && ( ( InternalEList.Unsettable< ? > ) accumulatorValues ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccumulatorLimitSet > getLimitSets() {
        if( limitSets == null ) {
            limitSets = new EObjectWithInverseEList.Unsettable.ManyInverse< AccumulatorLimitSet >(
                    AccumulatorLimitSet.class, this, CimPackage.ACCUMULATOR__LIMIT_SETS,
                    CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS );
        }
        return limitSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLimitSets() {
        if( limitSets != null ) ( ( InternalEList.Unsettable< ? > ) limitSets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimitSets() {
        return limitSets != null && ( ( InternalEList.Unsettable< ? > ) limitSets ).isSet();
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAccumulatorValues() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLimitSets() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return ( ( InternalEList< ? > ) getAccumulatorValues() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return ( ( InternalEList< ? > ) getLimitSets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR__MAX_VALUE:
            return getMaxValue();
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return getAccumulatorValues();
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return getLimitSets();
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
        case CimPackage.ACCUMULATOR__MAX_VALUE:
            setMaxValue( ( Integer ) newValue );
            return;
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            getAccumulatorValues().clear();
            getAccumulatorValues().addAll( ( Collection< ? extends AccumulatorValue > ) newValue );
            return;
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            getLimitSets().clear();
            getLimitSets().addAll( ( Collection< ? extends AccumulatorLimitSet > ) newValue );
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
        case CimPackage.ACCUMULATOR__MAX_VALUE:
            unsetMaxValue();
            return;
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            unsetAccumulatorValues();
            return;
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            unsetLimitSets();
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
        case CimPackage.ACCUMULATOR__MAX_VALUE:
            return isSetMaxValue();
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return isSetAccumulatorValues();
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return isSetLimitSets();
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
        result.append( " (maxValue: " );
        if( maxValueESet )
            result.append( maxValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AccumulatorImpl
