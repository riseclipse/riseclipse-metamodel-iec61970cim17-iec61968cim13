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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType4aIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType4IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4aIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type4a IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType4aIECImpl#getWindGenType4IEC <em>Wind Gen Type4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType4aIECImpl#getWindContPType4aIEC <em>Wind Cont PType4a IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType4aIECImpl extends WindTurbineType4IECImpl implements WindTurbineType4aIEC {
    /**
     * The cached value of the '{@link #getWindGenType4IEC() <em>Wind Gen Type4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenType4IEC()
     * @generated
     * @ordered
     */
    protected WindGenType4IEC windGenType4IEC;

    /**
     * This is true if the Wind Gen Type4 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenType4IECESet;

    /**
     * The cached value of the '{@link #getWindContPType4aIEC() <em>Wind Cont PType4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPType4aIEC()
     * @generated
     * @ordered
     */
    protected WindContPType4aIEC windContPType4aIEC;

    /**
     * This is true if the Wind Cont PType4a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPType4aIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType4aIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType4aIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType4IEC getWindGenType4IEC() {
        if( windGenType4IEC != null && windGenType4IEC.eIsProxy() ) {
            InternalEObject oldWindGenType4IEC = ( InternalEObject ) windGenType4IEC;
            windGenType4IEC = ( WindGenType4IEC ) eResolveProxy( oldWindGenType4IEC );
            if( windGenType4IEC != oldWindGenType4IEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, oldWindGenType4IEC, windGenType4IEC ) );
            }
        }
        return windGenType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenType4IEC basicGetWindGenType4IEC() {
        return windGenType4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenType4IEC( WindGenType4IEC newWindGenType4IEC, NotificationChain msgs ) {
        WindGenType4IEC oldWindGenType4IEC = windGenType4IEC;
        windGenType4IEC = newWindGenType4IEC;
        boolean oldWindGenType4IECESet = windGenType4IECESet;
        windGenType4IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, oldWindGenType4IEC, newWindGenType4IEC,
                    !oldWindGenType4IECESet );
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
    public void setWindGenType4IEC( WindGenType4IEC newWindGenType4IEC ) {
        if( newWindGenType4IEC != windGenType4IEC ) {
            NotificationChain msgs = null;
            if( windGenType4IEC != null ) msgs = ( ( InternalEObject ) windGenType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, WindGenType4IEC.class, msgs );
            if( newWindGenType4IEC != null ) msgs = ( ( InternalEObject ) newWindGenType4IEC ).eInverseAdd( this,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, WindGenType4IEC.class, msgs );
            msgs = basicSetWindGenType4IEC( newWindGenType4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType4IECESet = windGenType4IECESet;
            windGenType4IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, newWindGenType4IEC, newWindGenType4IEC,
                    !oldWindGenType4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenType4IEC( NotificationChain msgs ) {
        WindGenType4IEC oldWindGenType4IEC = windGenType4IEC;
        windGenType4IEC = null;
        boolean oldWindGenType4IECESet = windGenType4IECESet;
        windGenType4IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, oldWindGenType4IEC, null,
                    oldWindGenType4IECESet );
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
    public void unsetWindGenType4IEC() {
        if( windGenType4IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, WindGenType4IEC.class, msgs );
            msgs = basicUnsetWindGenType4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType4IECESet = windGenType4IECESet;
            windGenType4IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, null, null, oldWindGenType4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenType4IEC() {
        return windGenType4IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType4aIEC getWindContPType4aIEC() {
        if( windContPType4aIEC != null && windContPType4aIEC.eIsProxy() ) {
            InternalEObject oldWindContPType4aIEC = ( InternalEObject ) windContPType4aIEC;
            windContPType4aIEC = ( WindContPType4aIEC ) eResolveProxy( oldWindContPType4aIEC );
            if( windContPType4aIEC != oldWindContPType4aIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, oldWindContPType4aIEC,
                        windContPType4aIEC ) );
            }
        }
        return windContPType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPType4aIEC basicGetWindContPType4aIEC() {
        return windContPType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPType4aIEC( WindContPType4aIEC newWindContPType4aIEC,
            NotificationChain msgs ) {
        WindContPType4aIEC oldWindContPType4aIEC = windContPType4aIEC;
        windContPType4aIEC = newWindContPType4aIEC;
        boolean oldWindContPType4aIECESet = windContPType4aIECESet;
        windContPType4aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, oldWindContPType4aIEC,
                    newWindContPType4aIEC, !oldWindContPType4aIECESet );
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
    public void setWindContPType4aIEC( WindContPType4aIEC newWindContPType4aIEC ) {
        if( newWindContPType4aIEC != windContPType4aIEC ) {
            NotificationChain msgs = null;
            if( windContPType4aIEC != null ) msgs = ( ( InternalEObject ) windContPType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, WindContPType4aIEC.class, msgs );
            if( newWindContPType4aIEC != null ) msgs = ( ( InternalEObject ) newWindContPType4aIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, WindContPType4aIEC.class, msgs );
            msgs = basicSetWindContPType4aIEC( newWindContPType4aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType4aIECESet = windContPType4aIECESet;
            windContPType4aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, newWindContPType4aIEC,
                    newWindContPType4aIEC, !oldWindContPType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPType4aIEC( NotificationChain msgs ) {
        WindContPType4aIEC oldWindContPType4aIEC = windContPType4aIEC;
        windContPType4aIEC = null;
        boolean oldWindContPType4aIECESet = windContPType4aIECESet;
        windContPType4aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, oldWindContPType4aIEC, null,
                    oldWindContPType4aIECESet );
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
    public void unsetWindContPType4aIEC() {
        if( windContPType4aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, WindContPType4aIEC.class, msgs );
            msgs = basicUnsetWindContPType4aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType4aIECESet = windContPType4aIECESet;
            windContPType4aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC, null, null,
                    oldWindContPType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPType4aIEC() {
        return windContPType4aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            if( windGenType4IEC != null ) msgs = ( ( InternalEObject ) windGenType4IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, WindGenType4IEC.class, msgs );
            return basicSetWindGenType4IEC( ( WindGenType4IEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            if( windContPType4aIEC != null ) msgs = ( ( InternalEObject ) windContPType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE4A_IEC__WIND_TURBINE_TYPE4A_IEC, WindContPType4aIEC.class, msgs );
            return basicSetWindContPType4aIEC( ( WindContPType4aIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            return basicUnsetWindGenType4IEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            return basicUnsetWindContPType4aIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            if( resolve ) return getWindGenType4IEC();
            return basicGetWindGenType4IEC();
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            if( resolve ) return getWindContPType4aIEC();
            return basicGetWindContPType4aIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            setWindGenType4IEC( ( WindGenType4IEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            setWindContPType4aIEC( ( WindContPType4aIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            unsetWindGenType4IEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            unsetWindContPType4aIEC();
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
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC:
            return isSetWindGenType4IEC();
        case CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_CONT_PTYPE4A_IEC:
            return isSetWindContPType4aIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType4aIECImpl
