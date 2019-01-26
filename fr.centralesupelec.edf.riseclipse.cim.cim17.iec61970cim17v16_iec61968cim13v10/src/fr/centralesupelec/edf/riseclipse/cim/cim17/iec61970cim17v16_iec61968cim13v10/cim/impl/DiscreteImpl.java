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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Discrete;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscreteValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ValueAliasSet;

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
 * An implementation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscreteImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscreteImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscreteImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscreteImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscreteImpl#getDiscreteValues <em>Discrete Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteImpl extends MeasurementImpl implements Discrete {
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
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected static final Integer MIN_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected Integer minValue = MIN_VALUE_EDEFAULT;

    /**
     * This is true if the Min Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minValueESet;

    /**
     * The default value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalValue()
     * @generated
     * @ordered
     */
    protected static final Integer NORMAL_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalValue()
     * @generated
     * @ordered
     */
    protected Integer normalValue = NORMAL_VALUE_EDEFAULT;

    /**
     * This is true if the Normal Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalValueESet;

    /**
     * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueAliasSet()
     * @generated
     * @ordered
     */
    protected ValueAliasSet valueAliasSet;

    /**
     * This is true if the Value Alias Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueAliasSetESet;

    /**
     * The cached value of the '{@link #getDiscreteValues() <em>Discrete Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscreteValues()
     * @generated
     * @ordered
     */
    protected EList< DiscreteValue > discreteValues;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscreteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscrete();
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
                CimPackage.DISCRETE__MAX_VALUE, oldMaxValue, maxValue, !oldMaxValueESet ) );
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
                CimPackage.DISCRETE__MAX_VALUE, oldMaxValue, MAX_VALUE_EDEFAULT, oldMaxValueESet ) );
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
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinValue( Integer newMinValue ) {
        Integer oldMinValue = minValue;
        minValue = newMinValue;
        boolean oldMinValueESet = minValueESet;
        minValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISCRETE__MIN_VALUE, oldMinValue, minValue, !oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinValue() {
        Integer oldMinValue = minValue;
        boolean oldMinValueESet = minValueESet;
        minValue = MIN_VALUE_EDEFAULT;
        minValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISCRETE__MIN_VALUE, oldMinValue, MIN_VALUE_EDEFAULT, oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinValue() {
        return minValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNormalValue() {
        return normalValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalValue( Integer newNormalValue ) {
        Integer oldNormalValue = normalValue;
        normalValue = newNormalValue;
        boolean oldNormalValueESet = normalValueESet;
        normalValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISCRETE__NORMAL_VALUE, oldNormalValue, normalValue, !oldNormalValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalValue() {
        Integer oldNormalValue = normalValue;
        boolean oldNormalValueESet = normalValueESet;
        normalValue = NORMAL_VALUE_EDEFAULT;
        normalValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISCRETE__NORMAL_VALUE, oldNormalValue, NORMAL_VALUE_EDEFAULT, oldNormalValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalValue() {
        return normalValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueAliasSet getValueAliasSet() {
        return valueAliasSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueAliasSet( ValueAliasSet newValueAliasSet, NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = newValueAliasSet;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet, !oldValueAliasSetESet );
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
    public void setValueAliasSet( ValueAliasSet newValueAliasSet ) {
        if( newValueAliasSet != valueAliasSet ) {
            NotificationChain msgs = null;
            if( valueAliasSet != null ) msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                    CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            if( newValueAliasSet != null ) msgs = ( ( InternalEObject ) newValueAliasSet ).eInverseAdd( this,
                    CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            msgs = basicSetValueAliasSet( newValueAliasSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, newValueAliasSet, newValueAliasSet, !oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValueAliasSet( NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = null;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, null, oldValueAliasSetESet );
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
    public void unsetValueAliasSet() {
        if( valueAliasSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this, CimPackage.VALUE_ALIAS_SET__DISCRETES,
                    ValueAliasSet.class, msgs );
            msgs = basicUnsetValueAliasSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, null, null, oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValueAliasSet() {
        return valueAliasSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiscreteValue > getDiscreteValues() {
        if( discreteValues == null ) {
            discreteValues = new EObjectWithInverseResolvingEList.Unsettable< DiscreteValue >( DiscreteValue.class,
                    this, CimPackage.DISCRETE__DISCRETE_VALUES, CimPackage.DISCRETE_VALUE__DISCRETE );
        }
        return discreteValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiscreteValues() {
        if( discreteValues != null ) ( ( InternalEList.Unsettable< ? > ) discreteValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscreteValues() {
        return discreteValues != null && ( ( InternalEList.Unsettable< ? > ) discreteValues ).isSet();
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
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            if( valueAliasSet != null ) msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                    CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            return basicSetValueAliasSet( ( ValueAliasSet ) otherEnd, msgs );
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiscreteValues() )
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
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return basicUnsetValueAliasSet( msgs );
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return ( ( InternalEList< ? > ) getDiscreteValues() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DISCRETE__MAX_VALUE:
            return getMaxValue();
        case CimPackage.DISCRETE__MIN_VALUE:
            return getMinValue();
        case CimPackage.DISCRETE__NORMAL_VALUE:
            return getNormalValue();
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return getValueAliasSet();
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return getDiscreteValues();
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
        case CimPackage.DISCRETE__MAX_VALUE:
            setMaxValue( ( Integer ) newValue );
            return;
        case CimPackage.DISCRETE__MIN_VALUE:
            setMinValue( ( Integer ) newValue );
            return;
        case CimPackage.DISCRETE__NORMAL_VALUE:
            setNormalValue( ( Integer ) newValue );
            return;
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            setValueAliasSet( ( ValueAliasSet ) newValue );
            return;
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            getDiscreteValues().clear();
            getDiscreteValues().addAll( ( Collection< ? extends DiscreteValue > ) newValue );
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
        case CimPackage.DISCRETE__MAX_VALUE:
            unsetMaxValue();
            return;
        case CimPackage.DISCRETE__MIN_VALUE:
            unsetMinValue();
            return;
        case CimPackage.DISCRETE__NORMAL_VALUE:
            unsetNormalValue();
            return;
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            unsetValueAliasSet();
            return;
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            unsetDiscreteValues();
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
        case CimPackage.DISCRETE__MAX_VALUE:
            return isSetMaxValue();
        case CimPackage.DISCRETE__MIN_VALUE:
            return isSetMinValue();
        case CimPackage.DISCRETE__NORMAL_VALUE:
            return isSetNormalValue();
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return isSetValueAliasSet();
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return isSetDiscreteValues();
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
        result.append( ", minValue: " );
        if( minValueESet )
            result.append( minValue );
        else
            result.append( "<unset>" );
        result.append( ", normalValue: " );
        if( normalValueESet )
            result.append( normalValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiscreteImpl
