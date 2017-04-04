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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingEfficiencyCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroGeneratingUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Generating Efficiency Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroGeneratingEfficiencyCurveImpl#getHydroGeneratingUnit <em>Hydro Generating Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroGeneratingEfficiencyCurveImpl extends CurveImpl implements HydroGeneratingEfficiencyCurve {
    /**
     * The cached value of the '{@link #getHydroGeneratingUnit() <em>Hydro Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroGeneratingUnit()
     * @generated
     * @ordered
     */
    protected HydroGeneratingUnit hydroGeneratingUnit;

    /**
     * This is true if the Hydro Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroGeneratingUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroGeneratingEfficiencyCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroGeneratingEfficiencyCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroGeneratingUnit getHydroGeneratingUnit() {
        return hydroGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroGeneratingUnit( HydroGeneratingUnit newHydroGeneratingUnit,
            NotificationChain msgs ) {
        HydroGeneratingUnit oldHydroGeneratingUnit = hydroGeneratingUnit;
        hydroGeneratingUnit = newHydroGeneratingUnit;
        boolean oldHydroGeneratingUnitESet = hydroGeneratingUnitESet;
        hydroGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, oldHydroGeneratingUnit,
                    newHydroGeneratingUnit, !oldHydroGeneratingUnitESet );
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
    public void setHydroGeneratingUnit( HydroGeneratingUnit newHydroGeneratingUnit ) {
        if( newHydroGeneratingUnit != hydroGeneratingUnit ) {
            NotificationChain msgs = null;
            if( hydroGeneratingUnit != null ) msgs = ( ( InternalEObject ) hydroGeneratingUnit ).eInverseRemove( this,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class,
                    msgs );
            if( newHydroGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newHydroGeneratingUnit ).eInverseAdd( this,
                        CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class,
                        msgs );
            msgs = basicSetHydroGeneratingUnit( newHydroGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroGeneratingUnitESet = hydroGeneratingUnitESet;
            hydroGeneratingUnitESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, newHydroGeneratingUnit,
                    newHydroGeneratingUnit, !oldHydroGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroGeneratingUnit( NotificationChain msgs ) {
        HydroGeneratingUnit oldHydroGeneratingUnit = hydroGeneratingUnit;
        hydroGeneratingUnit = null;
        boolean oldHydroGeneratingUnitESet = hydroGeneratingUnitESet;
        hydroGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, oldHydroGeneratingUnit, null,
                    oldHydroGeneratingUnitESet );
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
    public void unsetHydroGeneratingUnit() {
        if( hydroGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroGeneratingUnit ).eInverseRemove( this,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class,
                    msgs );
            msgs = basicUnsetHydroGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroGeneratingUnitESet = hydroGeneratingUnitESet;
            hydroGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT, null, null,
                    oldHydroGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroGeneratingUnit() {
        return hydroGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            if( hydroGeneratingUnit != null ) msgs = ( ( InternalEObject ) hydroGeneratingUnit ).eInverseRemove( this,
                    CimPackage.HYDRO_GENERATING_UNIT__HYDRO_GENERATING_EFFICIENCY_CURVES, HydroGeneratingUnit.class,
                    msgs );
            return basicSetHydroGeneratingUnit( ( HydroGeneratingUnit ) otherEnd, msgs );
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
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            return basicUnsetHydroGeneratingUnit( msgs );
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
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            return getHydroGeneratingUnit();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            setHydroGeneratingUnit( ( HydroGeneratingUnit ) newValue );
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
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            unsetHydroGeneratingUnit();
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
        case CimPackage.HYDRO_GENERATING_EFFICIENCY_CURVE__HYDRO_GENERATING_UNIT:
            return isSetHydroGeneratingUnit();
        }
        return super.eIsSet( featureID );
    }

} //HydroGeneratingEfficiencyCurveImpl
