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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartMainFuelCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.StartupModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Main Fuel Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartMainFuelCurveImpl#getMainFuelType <em>Main Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.StartMainFuelCurveImpl#getStartupModel <em>Startup Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StartMainFuelCurveImpl extends CurveImpl implements StartMainFuelCurve {
    /**
     * The default value of the '{@link #getMainFuelType() <em>Main Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainFuelType()
     * @generated
     * @ordered
     */
    protected static final FuelType MAIN_FUEL_TYPE_EDEFAULT = FuelType.COAL;

    /**
     * The cached value of the '{@link #getMainFuelType() <em>Main Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainFuelType()
     * @generated
     * @ordered
     */
    protected FuelType mainFuelType = MAIN_FUEL_TYPE_EDEFAULT;

    /**
     * This is true if the Main Fuel Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mainFuelTypeESet;

    /**
     * The cached value of the '{@link #getStartupModel() <em>Startup Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupModel()
     * @generated
     * @ordered
     */
    protected StartupModel startupModel;

    /**
     * This is true if the Startup Model reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupModelESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StartMainFuelCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStartMainFuelCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FuelType getMainFuelType() {
        return mainFuelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMainFuelType( FuelType newMainFuelType ) {
        FuelType oldMainFuelType = mainFuelType;
        mainFuelType = newMainFuelType == null ? MAIN_FUEL_TYPE_EDEFAULT : newMainFuelType;
        boolean oldMainFuelTypeESet = mainFuelTypeESet;
        mainFuelTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE,
                    oldMainFuelType, mainFuelType, !oldMainFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMainFuelType() {
        FuelType oldMainFuelType = mainFuelType;
        boolean oldMainFuelTypeESet = mainFuelTypeESet;
        mainFuelType = MAIN_FUEL_TYPE_EDEFAULT;
        mainFuelTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE,
                    oldMainFuelType, MAIN_FUEL_TYPE_EDEFAULT, oldMainFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMainFuelType() {
        return mainFuelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StartupModel getStartupModel() {
        if( startupModel != null && startupModel.eIsProxy() ) {
            InternalEObject oldStartupModel = ( InternalEObject ) startupModel;
            startupModel = ( StartupModel ) eResolveProxy( oldStartupModel );
            if( startupModel != oldStartupModel ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, oldStartupModel, startupModel ) );
            }
        }
        return startupModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartupModel basicGetStartupModel() {
        return startupModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStartupModel( StartupModel newStartupModel, NotificationChain msgs ) {
        StartupModel oldStartupModel = startupModel;
        startupModel = newStartupModel;
        boolean oldStartupModelESet = startupModelESet;
        startupModelESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, oldStartupModel, newStartupModel,
                    !oldStartupModelESet );
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
    public void setStartupModel( StartupModel newStartupModel ) {
        if( newStartupModel != startupModel ) {
            NotificationChain msgs = null;
            if( startupModel != null ) msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs );
            if( newStartupModel != null ) msgs = ( ( InternalEObject ) newStartupModel ).eInverseAdd( this,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs );
            msgs = basicSetStartupModel( newStartupModel, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartupModelESet = startupModelESet;
            startupModelESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL,
                        newStartupModel, newStartupModel, !oldStartupModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStartupModel( NotificationChain msgs ) {
        StartupModel oldStartupModel = startupModel;
        startupModel = null;
        boolean oldStartupModelESet = startupModelESet;
        startupModelESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, oldStartupModel, null, oldStartupModelESet );
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
    public void unsetStartupModel() {
        if( startupModel != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs );
            msgs = basicUnsetStartupModel( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStartupModelESet = startupModelESet;
            startupModelESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL, null, null, oldStartupModelESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupModel() {
        return startupModelESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            if( startupModel != null ) msgs = ( ( InternalEObject ) startupModel ).eInverseRemove( this,
                    CimPackage.STARTUP_MODEL__START_MAIN_FUEL_CURVE, StartupModel.class, msgs );
            return basicSetStartupModel( ( StartupModel ) otherEnd, msgs );
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
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            return basicUnsetStartupModel( msgs );
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
        case CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
            return getMainFuelType();
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            if( resolve ) return getStartupModel();
            return basicGetStartupModel();
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
        case CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
            setMainFuelType( ( FuelType ) newValue );
            return;
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            setStartupModel( ( StartupModel ) newValue );
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
        case CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
            unsetMainFuelType();
            return;
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            unsetStartupModel();
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
        case CimPackage.START_MAIN_FUEL_CURVE__MAIN_FUEL_TYPE:
            return isSetMainFuelType();
        case CimPackage.START_MAIN_FUEL_CURVE__STARTUP_MODEL:
            return isSetStartupModel();
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
        result.append( " (mainFuelType: " );
        if( mainFuelTypeESet )
            result.append( mainFuelType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StartMainFuelCurveImpl
