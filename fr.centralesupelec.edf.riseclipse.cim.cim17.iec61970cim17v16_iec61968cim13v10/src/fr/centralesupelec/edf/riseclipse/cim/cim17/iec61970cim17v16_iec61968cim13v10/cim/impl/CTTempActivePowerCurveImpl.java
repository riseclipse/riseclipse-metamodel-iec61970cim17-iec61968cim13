/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CTTempActivePowerCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CombustionTurbine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CT Temp Active Power Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CTTempActivePowerCurveImpl#getCombustionTurbine <em>Combustion Turbine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTTempActivePowerCurveImpl extends CurveImpl implements CTTempActivePowerCurve {
    /**
     * The cached value of the '{@link #getCombustionTurbine() <em>Combustion Turbine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombustionTurbine()
     * @generated
     * @ordered
     */
    protected CombustionTurbine combustionTurbine;

    /**
     * This is true if the Combustion Turbine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean combustionTurbineESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CTTempActivePowerCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCTTempActivePowerCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CombustionTurbine getCombustionTurbine() {
        if( combustionTurbine != null && combustionTurbine.eIsProxy() ) {
            InternalEObject oldCombustionTurbine = ( InternalEObject ) combustionTurbine;
            combustionTurbine = ( CombustionTurbine ) eResolveProxy( oldCombustionTurbine );
            if( combustionTurbine != oldCombustionTurbine ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, oldCombustionTurbine,
                        combustionTurbine ) );
            }
        }
        return combustionTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombustionTurbine basicGetCombustionTurbine() {
        return combustionTurbine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCombustionTurbine( CombustionTurbine newCombustionTurbine,
            NotificationChain msgs ) {
        CombustionTurbine oldCombustionTurbine = combustionTurbine;
        combustionTurbine = newCombustionTurbine;
        boolean oldCombustionTurbineESet = combustionTurbineESet;
        combustionTurbineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, oldCombustionTurbine,
                    newCombustionTurbine, !oldCombustionTurbineESet );
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
    public void setCombustionTurbine( CombustionTurbine newCombustionTurbine ) {
        if( newCombustionTurbine != combustionTurbine ) {
            NotificationChain msgs = null;
            if( combustionTurbine != null ) msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs );
            if( newCombustionTurbine != null ) msgs = ( ( InternalEObject ) newCombustionTurbine ).eInverseAdd( this,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs );
            msgs = basicSetCombustionTurbine( newCombustionTurbine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombustionTurbineESet = combustionTurbineESet;
            combustionTurbineESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, newCombustionTurbine,
                    newCombustionTurbine, !oldCombustionTurbineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCombustionTurbine( NotificationChain msgs ) {
        CombustionTurbine oldCombustionTurbine = combustionTurbine;
        combustionTurbine = null;
        boolean oldCombustionTurbineESet = combustionTurbineESet;
        combustionTurbineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, oldCombustionTurbine, null,
                    oldCombustionTurbineESet );
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
    public void unsetCombustionTurbine() {
        if( combustionTurbine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs );
            msgs = basicUnsetCombustionTurbine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCombustionTurbineESet = combustionTurbineESet;
            combustionTurbineESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE, null, null, oldCombustionTurbineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCombustionTurbine() {
        return combustionTurbineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            if( combustionTurbine != null ) msgs = ( ( InternalEObject ) combustionTurbine ).eInverseRemove( this,
                    CimPackage.COMBUSTION_TURBINE__CT_TEMP_ACTIVE_POWER_CURVE, CombustionTurbine.class, msgs );
            return basicSetCombustionTurbine( ( CombustionTurbine ) otherEnd, msgs );
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
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            return basicUnsetCombustionTurbine( msgs );
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
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            if( resolve ) return getCombustionTurbine();
            return basicGetCombustionTurbine();
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
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            setCombustionTurbine( ( CombustionTurbine ) newValue );
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
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            unsetCombustionTurbine();
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
        case CimPackage.CT_TEMP_ACTIVE_POWER_CURVE__COMBUSTION_TURBINE:
            return isSetCombustionTurbine();
        }
        return super.eIsSet( featureID );
    }

} //CTTempActivePowerCurveImpl
