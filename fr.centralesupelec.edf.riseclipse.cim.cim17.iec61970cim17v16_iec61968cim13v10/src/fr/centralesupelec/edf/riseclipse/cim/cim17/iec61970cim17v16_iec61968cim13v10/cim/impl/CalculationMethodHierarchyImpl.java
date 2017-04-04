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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodOrder;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MeasurementValue;

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
 * An implementation of the model object '<em><b>Calculation Method Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodHierarchyImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodHierarchyImpl#getCalculationMethodOrder <em>Calculation Method Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CalculationMethodHierarchyImpl#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationMethodHierarchyImpl extends IdentifiedObjectImpl implements CalculationMethodHierarchy {
    /**
     * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementValue()
     * @generated
     * @ordered
     */
    protected MeasurementValue measurementValue;

    /**
     * This is true if the Measurement Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementValueESet;

    /**
     * The cached value of the '{@link #getCalculationMethodOrder() <em>Calculation Method Order</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMethodOrder()
     * @generated
     * @ordered
     */
    protected EList< CalculationMethodOrder > calculationMethodOrder;

    /**
     * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurement()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CalculationMethodHierarchyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCalculationMethodHierarchy();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasurementValue getMeasurementValue() {
        if( measurementValue != null && measurementValue.eIsProxy() ) {
            InternalEObject oldMeasurementValue = ( InternalEObject ) measurementValue;
            measurementValue = ( MeasurementValue ) eResolveProxy( oldMeasurementValue );
            if( measurementValue != oldMeasurementValue ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, oldMeasurementValue,
                        measurementValue ) );
            }
        }
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementValue basicGetMeasurementValue() {
        return measurementValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMeasurementValue( MeasurementValue newMeasurementValue, NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = newMeasurementValue;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, oldMeasurementValue,
                    newMeasurementValue, !oldMeasurementValueESet );
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
    public void setMeasurementValue( MeasurementValue newMeasurementValue ) {
        if( newMeasurementValue != measurementValue ) {
            NotificationChain msgs = null;
            if( measurementValue != null ) msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, MeasurementValue.class, msgs );
            if( newMeasurementValue != null ) msgs = ( ( InternalEObject ) newMeasurementValue ).eInverseAdd( this,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, MeasurementValue.class, msgs );
            msgs = basicSetMeasurementValue( newMeasurementValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, newMeasurementValue,
                    newMeasurementValue, !oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMeasurementValue( NotificationChain msgs ) {
        MeasurementValue oldMeasurementValue = measurementValue;
        measurementValue = null;
        boolean oldMeasurementValueESet = measurementValueESet;
        measurementValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, oldMeasurementValue, null,
                    oldMeasurementValueESet );
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
    public void unsetMeasurementValue() {
        if( measurementValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, MeasurementValue.class, msgs );
            msgs = basicUnsetMeasurementValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMeasurementValueESet = measurementValueESet;
            measurementValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE, null, null, oldMeasurementValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementValue() {
        return measurementValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CalculationMethodOrder > getCalculationMethodOrder() {
        if( calculationMethodOrder == null ) {
            calculationMethodOrder = new EObjectWithInverseResolvingEList.Unsettable< CalculationMethodOrder >(
                    CalculationMethodOrder.class, this,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER,
                    CimPackage.CALCULATION_METHOD_ORDER__CALCULATION_METHOD_HIERARCHY );
        }
        return calculationMethodOrder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationMethodOrder() {
        if( calculationMethodOrder != null ) ( ( InternalEList.Unsettable< ? > ) calculationMethodOrder ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMethodOrder() {
        return calculationMethodOrder != null && ( ( InternalEList.Unsettable< ? > ) calculationMethodOrder ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurement() {
        if( measurement == null ) {
            measurement = new EObjectWithInverseResolvingEList.Unsettable< Measurement >( Measurement.class, this,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT,
                    CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY );
        }
        return measurement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurement() {
        if( measurement != null ) ( ( InternalEList.Unsettable< ? > ) measurement ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurement() {
        return measurement != null && ( ( InternalEList.Unsettable< ? > ) measurement ).isSet();
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            if( measurementValue != null ) msgs = ( ( InternalEObject ) measurementValue ).eInverseRemove( this,
                    CimPackage.MEASUREMENT_VALUE__CALCULATION_METHOD_HIERARCHY, MeasurementValue.class, msgs );
            return basicSetMeasurementValue( ( MeasurementValue ) otherEnd, msgs );
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCalculationMethodOrder() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurement() ).basicAdd( otherEnd,
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            return basicUnsetMeasurementValue( msgs );
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            return ( ( InternalEList< ? > ) getCalculationMethodOrder() ).basicRemove( otherEnd, msgs );
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            return ( ( InternalEList< ? > ) getMeasurement() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            if( resolve ) return getMeasurementValue();
            return basicGetMeasurementValue();
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            return getCalculationMethodOrder();
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            return getMeasurement();
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            setMeasurementValue( ( MeasurementValue ) newValue );
            return;
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            getCalculationMethodOrder().clear();
            getCalculationMethodOrder().addAll( ( Collection< ? extends CalculationMethodOrder > ) newValue );
            return;
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            getMeasurement().clear();
            getMeasurement().addAll( ( Collection< ? extends Measurement > ) newValue );
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            unsetMeasurementValue();
            return;
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            unsetCalculationMethodOrder();
            return;
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            unsetMeasurement();
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
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT_VALUE:
            return isSetMeasurementValue();
        case CimPackage.CALCULATION_METHOD_HIERARCHY__CALCULATION_METHOD_ORDER:
            return isSetCalculationMethodOrder();
        case CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT:
            return isSetMeasurement();
        }
        return super.eIsSet( featureID );
    }

} //CalculationMethodHierarchyImpl
