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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Limit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorLimitSetImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorLimitSetImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorLimitSetImpl extends LimitSetImpl implements AccumulatorLimitSet {
    /**
     * The cached value of the '{@link #getLimits() <em>Limits</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimits()
     * @generated
     * @ordered
     */
    protected EList< AccumulatorLimit > limits;

    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Accumulator > measurements;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorLimitSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulatorLimitSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccumulatorLimit > getLimits() {
        if( limits == null ) {
            limits = new EObjectWithInverseResolvingEList.Unsettable< AccumulatorLimit >( AccumulatorLimit.class, this,
                    CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS, CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET );
        }
        return limits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLimits() {
        if( limits != null ) ( ( InternalEList.Unsettable< ? > ) limits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimits() {
        return limits != null && ( ( InternalEList.Unsettable< ? > ) limits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Accumulator > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Accumulator >(
                    Accumulator.class, this, CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS,
                    CimPackage.ACCUMULATOR__LIMIT_SETS );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLimits() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            return ( ( InternalEList< ? > ) getLimits() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            return getLimits();
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            return getMeasurements();
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            getLimits().clear();
            getLimits().addAll( ( Collection< ? extends AccumulatorLimit > ) newValue );
            return;
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Accumulator > ) newValue );
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            unsetLimits();
            return;
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            unsetMeasurements();
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
        case CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS:
            return isSetLimits();
        case CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS:
            return isSetMeasurements();
        }
        return super.eIsSet( featureID );
    }

} //AccumulatorLimitSetImpl
