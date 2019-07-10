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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroOneDimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindGenType3IEC <em>Wind Gen Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3IECImpl#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType3IECImpl extends WindTurbineType3or4IECImpl implements WindTurbineType3IEC {
    /**
     * The cached value of the '{@link #getWindAeroOneDimIEC() <em>Wind Aero One Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindAeroOneDimIEC()
     * @generated
     * @ordered
     */
    protected WindAeroOneDimIEC windAeroOneDimIEC;

    /**
     * This is true if the Wind Aero One Dim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windAeroOneDimIECESet;

    /**
     * The cached value of the '{@link #getWindAeroTwoDimIEC() <em>Wind Aero Two Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindAeroTwoDimIEC()
     * @generated
     * @ordered
     */
    protected WindAeroTwoDimIEC windAeroTwoDimIEC;

    /**
     * This is true if the Wind Aero Two Dim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windAeroTwoDimIECESet;

    /**
     * The cached value of the '{@link #getWindMechIEC() <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindMechIEC()
     * @generated
     * @ordered
     */
    protected WindMechIEC windMechIEC;

    /**
     * This is true if the Wind Mech IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windMechIECESet;

    /**
     * The cached value of the '{@link #getWindGenType3IEC() <em>Wind Gen Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenType3IEC()
     * @generated
     * @ordered
     */
    protected WindGenType3IEC windGenType3IEC;

    /**
     * This is true if the Wind Gen Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenType3IECESet;

    /**
     * The cached value of the '{@link #getWindContPitchAngleIEC() <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPitchAngleIEC()
     * @generated
     * @ordered
     */
    protected WindContPitchAngleIEC windContPitchAngleIEC;

    /**
     * This is true if the Wind Cont Pitch Angle IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPitchAngleIECESet;

    /**
     * The cached value of the '{@link #getWindContPType3IEC() <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContPType3IEC()
     * @generated
     * @ordered
     */
    protected WindContPType3IEC windContPType3IEC;

    /**
     * This is true if the Wind Cont PType3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContPType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType3IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroOneDimIEC getWindAeroOneDimIEC() {
        if( windAeroOneDimIEC != null && windAeroOneDimIEC.eIsProxy() ) {
            InternalEObject oldWindAeroOneDimIEC = ( InternalEObject ) windAeroOneDimIEC;
            windAeroOneDimIEC = ( WindAeroOneDimIEC ) eResolveProxy( oldWindAeroOneDimIEC );
            if( windAeroOneDimIEC != oldWindAeroOneDimIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, oldWindAeroOneDimIEC,
                        windAeroOneDimIEC ) );
            }
        }
        return windAeroOneDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindAeroOneDimIEC basicGetWindAeroOneDimIEC() {
        return windAeroOneDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindAeroOneDimIEC( WindAeroOneDimIEC newWindAeroOneDimIEC,
            NotificationChain msgs ) {
        WindAeroOneDimIEC oldWindAeroOneDimIEC = windAeroOneDimIEC;
        windAeroOneDimIEC = newWindAeroOneDimIEC;
        boolean oldWindAeroOneDimIECESet = windAeroOneDimIECESet;
        windAeroOneDimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, oldWindAeroOneDimIEC,
                    newWindAeroOneDimIEC, !oldWindAeroOneDimIECESet );
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
    public void setWindAeroOneDimIEC( WindAeroOneDimIEC newWindAeroOneDimIEC ) {
        if( newWindAeroOneDimIEC != windAeroOneDimIEC ) {
            NotificationChain msgs = null;
            if( windAeroOneDimIEC != null ) msgs = ( ( InternalEObject ) windAeroOneDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroOneDimIEC.class, msgs );
            if( newWindAeroOneDimIEC != null ) msgs = ( ( InternalEObject ) newWindAeroOneDimIEC ).eInverseAdd( this,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroOneDimIEC.class, msgs );
            msgs = basicSetWindAeroOneDimIEC( newWindAeroOneDimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroOneDimIECESet = windAeroOneDimIECESet;
            windAeroOneDimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, newWindAeroOneDimIEC,
                    newWindAeroOneDimIEC, !oldWindAeroOneDimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindAeroOneDimIEC( NotificationChain msgs ) {
        WindAeroOneDimIEC oldWindAeroOneDimIEC = windAeroOneDimIEC;
        windAeroOneDimIEC = null;
        boolean oldWindAeroOneDimIECESet = windAeroOneDimIECESet;
        windAeroOneDimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, oldWindAeroOneDimIEC, null,
                    oldWindAeroOneDimIECESet );
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
    public void unsetWindAeroOneDimIEC() {
        if( windAeroOneDimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windAeroOneDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroOneDimIEC.class, msgs );
            msgs = basicUnsetWindAeroOneDimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroOneDimIECESet = windAeroOneDimIECESet;
            windAeroOneDimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC, null, null, oldWindAeroOneDimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindAeroOneDimIEC() {
        return windAeroOneDimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindAeroTwoDimIEC getWindAeroTwoDimIEC() {
        if( windAeroTwoDimIEC != null && windAeroTwoDimIEC.eIsProxy() ) {
            InternalEObject oldWindAeroTwoDimIEC = ( InternalEObject ) windAeroTwoDimIEC;
            windAeroTwoDimIEC = ( WindAeroTwoDimIEC ) eResolveProxy( oldWindAeroTwoDimIEC );
            if( windAeroTwoDimIEC != oldWindAeroTwoDimIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, oldWindAeroTwoDimIEC,
                        windAeroTwoDimIEC ) );
            }
        }
        return windAeroTwoDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindAeroTwoDimIEC basicGetWindAeroTwoDimIEC() {
        return windAeroTwoDimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindAeroTwoDimIEC( WindAeroTwoDimIEC newWindAeroTwoDimIEC,
            NotificationChain msgs ) {
        WindAeroTwoDimIEC oldWindAeroTwoDimIEC = windAeroTwoDimIEC;
        windAeroTwoDimIEC = newWindAeroTwoDimIEC;
        boolean oldWindAeroTwoDimIECESet = windAeroTwoDimIECESet;
        windAeroTwoDimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, oldWindAeroTwoDimIEC,
                    newWindAeroTwoDimIEC, !oldWindAeroTwoDimIECESet );
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
    public void setWindAeroTwoDimIEC( WindAeroTwoDimIEC newWindAeroTwoDimIEC ) {
        if( newWindAeroTwoDimIEC != windAeroTwoDimIEC ) {
            NotificationChain msgs = null;
            if( windAeroTwoDimIEC != null ) msgs = ( ( InternalEObject ) windAeroTwoDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroTwoDimIEC.class, msgs );
            if( newWindAeroTwoDimIEC != null ) msgs = ( ( InternalEObject ) newWindAeroTwoDimIEC ).eInverseAdd( this,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroTwoDimIEC.class, msgs );
            msgs = basicSetWindAeroTwoDimIEC( newWindAeroTwoDimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroTwoDimIECESet = windAeroTwoDimIECESet;
            windAeroTwoDimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, newWindAeroTwoDimIEC,
                    newWindAeroTwoDimIEC, !oldWindAeroTwoDimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindAeroTwoDimIEC( NotificationChain msgs ) {
        WindAeroTwoDimIEC oldWindAeroTwoDimIEC = windAeroTwoDimIEC;
        windAeroTwoDimIEC = null;
        boolean oldWindAeroTwoDimIECESet = windAeroTwoDimIECESet;
        windAeroTwoDimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, oldWindAeroTwoDimIEC, null,
                    oldWindAeroTwoDimIECESet );
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
    public void unsetWindAeroTwoDimIEC() {
        if( windAeroTwoDimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windAeroTwoDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroTwoDimIEC.class, msgs );
            msgs = basicUnsetWindAeroTwoDimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindAeroTwoDimIECESet = windAeroTwoDimIECESet;
            windAeroTwoDimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, null, null, oldWindAeroTwoDimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindAeroTwoDimIEC() {
        return windAeroTwoDimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindMechIEC getWindMechIEC() {
        if( windMechIEC != null && windMechIEC.eIsProxy() ) {
            InternalEObject oldWindMechIEC = ( InternalEObject ) windMechIEC;
            windMechIEC = ( WindMechIEC ) eResolveProxy( oldWindMechIEC );
            if( windMechIEC != oldWindMechIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, windMechIEC ) );
            }
        }
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindMechIEC basicGetWindMechIEC() {
        return windMechIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindMechIEC( WindMechIEC newWindMechIEC, NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = newWindMechIEC;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, newWindMechIEC,
                    !oldWindMechIECESet );
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
    public void setWindMechIEC( WindMechIEC newWindMechIEC ) {
        if( newWindMechIEC != windMechIEC ) {
            NotificationChain msgs = null;
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            if( newWindMechIEC != null ) msgs = ( ( InternalEObject ) newWindMechIEC ).eInverseAdd( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            msgs = basicSetWindMechIEC( newWindMechIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC,
                            newWindMechIEC, newWindMechIEC, !oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindMechIEC( NotificationChain msgs ) {
        WindMechIEC oldWindMechIEC = windMechIEC;
        windMechIEC = null;
        boolean oldWindMechIECESet = windMechIECESet;
        windMechIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, oldWindMechIEC, null, oldWindMechIECESet );
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
    public void unsetWindMechIEC() {
        if( windMechIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            msgs = basicUnsetWindMechIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindMechIECESet = windMechIECESet;
            windMechIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC, null, null, oldWindMechIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindMechIEC() {
        return windMechIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenType3IEC getWindGenType3IEC() {
        if( windGenType3IEC != null && windGenType3IEC.eIsProxy() ) {
            InternalEObject oldWindGenType3IEC = ( InternalEObject ) windGenType3IEC;
            windGenType3IEC = ( WindGenType3IEC ) eResolveProxy( oldWindGenType3IEC );
            if( windGenType3IEC != oldWindGenType3IEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, oldWindGenType3IEC, windGenType3IEC ) );
            }
        }
        return windGenType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindGenType3IEC basicGetWindGenType3IEC() {
        return windGenType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindGenType3IEC( WindGenType3IEC newWindGenType3IEC, NotificationChain msgs ) {
        WindGenType3IEC oldWindGenType3IEC = windGenType3IEC;
        windGenType3IEC = newWindGenType3IEC;
        boolean oldWindGenType3IECESet = windGenType3IECESet;
        windGenType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, oldWindGenType3IEC, newWindGenType3IEC,
                    !oldWindGenType3IECESet );
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
    public void setWindGenType3IEC( WindGenType3IEC newWindGenType3IEC ) {
        if( newWindGenType3IEC != windGenType3IEC ) {
            NotificationChain msgs = null;
            if( windGenType3IEC != null ) msgs = ( ( InternalEObject ) windGenType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindGenType3IEC.class, msgs );
            if( newWindGenType3IEC != null ) msgs = ( ( InternalEObject ) newWindGenType3IEC ).eInverseAdd( this,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindGenType3IEC.class, msgs );
            msgs = basicSetWindGenType3IEC( newWindGenType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3IECESet = windGenType3IECESet;
            windGenType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, newWindGenType3IEC, newWindGenType3IEC,
                    !oldWindGenType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindGenType3IEC( NotificationChain msgs ) {
        WindGenType3IEC oldWindGenType3IEC = windGenType3IEC;
        windGenType3IEC = null;
        boolean oldWindGenType3IECESet = windGenType3IECESet;
        windGenType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, oldWindGenType3IEC, null,
                    oldWindGenType3IECESet );
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
    public void unsetWindGenType3IEC() {
        if( windGenType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windGenType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindGenType3IEC.class, msgs );
            msgs = basicUnsetWindGenType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindGenType3IECESet = windGenType3IECESet;
            windGenType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC, null, null, oldWindGenType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenType3IEC() {
        return windGenType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPitchAngleIEC getWindContPitchAngleIEC() {
        if( windContPitchAngleIEC != null && windContPitchAngleIEC.eIsProxy() ) {
            InternalEObject oldWindContPitchAngleIEC = ( InternalEObject ) windContPitchAngleIEC;
            windContPitchAngleIEC = ( WindContPitchAngleIEC ) eResolveProxy( oldWindContPitchAngleIEC );
            if( windContPitchAngleIEC != oldWindContPitchAngleIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, oldWindContPitchAngleIEC,
                        windContPitchAngleIEC ) );
            }
        }
        return windContPitchAngleIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPitchAngleIEC basicGetWindContPitchAngleIEC() {
        return windContPitchAngleIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPitchAngleIEC( WindContPitchAngleIEC newWindContPitchAngleIEC,
            NotificationChain msgs ) {
        WindContPitchAngleIEC oldWindContPitchAngleIEC = windContPitchAngleIEC;
        windContPitchAngleIEC = newWindContPitchAngleIEC;
        boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
        windContPitchAngleIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, oldWindContPitchAngleIEC,
                    newWindContPitchAngleIEC, !oldWindContPitchAngleIECESet );
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
    public void setWindContPitchAngleIEC( WindContPitchAngleIEC newWindContPitchAngleIEC ) {
        if( newWindContPitchAngleIEC != windContPitchAngleIEC ) {
            NotificationChain msgs = null;
            if( windContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            if( newWindContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) newWindContPitchAngleIEC ).eInverseAdd( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            msgs = basicSetWindContPitchAngleIEC( newWindContPitchAngleIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
            windContPitchAngleIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, newWindContPitchAngleIEC,
                    newWindContPitchAngleIEC, !oldWindContPitchAngleIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPitchAngleIEC( NotificationChain msgs ) {
        WindContPitchAngleIEC oldWindContPitchAngleIEC = windContPitchAngleIEC;
        windContPitchAngleIEC = null;
        boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
        windContPitchAngleIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, oldWindContPitchAngleIEC, null,
                    oldWindContPitchAngleIECESet );
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
    public void unsetWindContPitchAngleIEC() {
        if( windContPitchAngleIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class, msgs );
            msgs = basicUnsetWindContPitchAngleIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPitchAngleIECESet = windContPitchAngleIECESet;
            windContPitchAngleIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, null, null,
                    oldWindContPitchAngleIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPitchAngleIEC() {
        return windContPitchAngleIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContPType3IEC getWindContPType3IEC() {
        if( windContPType3IEC != null && windContPType3IEC.eIsProxy() ) {
            InternalEObject oldWindContPType3IEC = ( InternalEObject ) windContPType3IEC;
            windContPType3IEC = ( WindContPType3IEC ) eResolveProxy( oldWindContPType3IEC );
            if( windContPType3IEC != oldWindContPType3IEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC,
                        windContPType3IEC ) );
            }
        }
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindContPType3IEC basicGetWindContPType3IEC() {
        return windContPType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContPType3IEC( WindContPType3IEC newWindContPType3IEC,
            NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = newWindContPType3IEC;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC, newWindContPType3IEC,
                    !oldWindContPType3IECESet );
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
    public void setWindContPType3IEC( WindContPType3IEC newWindContPType3IEC ) {
        if( newWindContPType3IEC != windContPType3IEC ) {
            NotificationChain msgs = null;
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            if( newWindContPType3IEC != null ) msgs = ( ( InternalEObject ) newWindContPType3IEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            msgs = basicSetWindContPType3IEC( newWindContPType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, newWindContPType3IEC, newWindContPType3IEC,
                    !oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContPType3IEC( NotificationChain msgs ) {
        WindContPType3IEC oldWindContPType3IEC = windContPType3IEC;
        windContPType3IEC = null;
        boolean oldWindContPType3IECESet = windContPType3IECESet;
        windContPType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, oldWindContPType3IEC, null,
                    oldWindContPType3IECESet );
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
    public void unsetWindContPType3IEC() {
        if( windContPType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            msgs = basicUnsetWindContPType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContPType3IECESet = windContPType3IECESet;
            windContPType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, null, null, oldWindContPType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContPType3IEC() {
        return windContPType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            if( windAeroOneDimIEC != null ) msgs = ( ( InternalEObject ) windAeroOneDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_ONE_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroOneDimIEC.class, msgs );
            return basicSetWindAeroOneDimIEC( ( WindAeroOneDimIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            if( windAeroTwoDimIEC != null ) msgs = ( ( InternalEObject ) windAeroTwoDimIEC ).eInverseRemove( this,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, WindAeroTwoDimIEC.class, msgs );
            return basicSetWindAeroTwoDimIEC( ( WindAeroTwoDimIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            if( windMechIEC != null ) msgs = ( ( InternalEObject ) windMechIEC ).eInverseRemove( this,
                    CimPackage.WIND_MECH_IEC__WIND_TURBINE_TYPE3_IEC, WindMechIEC.class, msgs );
            return basicSetWindMechIEC( ( WindMechIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            if( windGenType3IEC != null ) msgs = ( ( InternalEObject ) windGenType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_GEN_TYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindGenType3IEC.class, msgs );
            return basicSetWindGenType3IEC( ( WindGenType3IEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            if( windContPitchAngleIEC != null )
                msgs = ( ( InternalEObject ) windContPitchAngleIEC ).eInverseRemove( this,
                        CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, WindContPitchAngleIEC.class,
                        msgs );
            return basicSetWindContPitchAngleIEC( ( WindContPitchAngleIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            if( windContPType3IEC != null ) msgs = ( ( InternalEObject ) windContPType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, WindContPType3IEC.class, msgs );
            return basicSetWindContPType3IEC( ( WindContPType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            return basicUnsetWindAeroOneDimIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            return basicUnsetWindAeroTwoDimIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            return basicUnsetWindMechIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            return basicUnsetWindGenType3IEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            return basicUnsetWindContPitchAngleIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            return basicUnsetWindContPType3IEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            if( resolve ) return getWindAeroOneDimIEC();
            return basicGetWindAeroOneDimIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            if( resolve ) return getWindAeroTwoDimIEC();
            return basicGetWindAeroTwoDimIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            if( resolve ) return getWindMechIEC();
            return basicGetWindMechIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            if( resolve ) return getWindGenType3IEC();
            return basicGetWindGenType3IEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            if( resolve ) return getWindContPitchAngleIEC();
            return basicGetWindContPitchAngleIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            if( resolve ) return getWindContPType3IEC();
            return basicGetWindContPType3IEC();
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
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            setWindAeroOneDimIEC( ( WindAeroOneDimIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            setWindAeroTwoDimIEC( ( WindAeroTwoDimIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            setWindMechIEC( ( WindMechIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            setWindGenType3IEC( ( WindGenType3IEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            setWindContPitchAngleIEC( ( WindContPitchAngleIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            setWindContPType3IEC( ( WindContPType3IEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            unsetWindAeroOneDimIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            unsetWindAeroTwoDimIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            unsetWindMechIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            unsetWindGenType3IEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            unsetWindContPitchAngleIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            unsetWindContPType3IEC();
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
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_ONE_DIM_IEC:
            return isSetWindAeroOneDimIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC:
            return isSetWindAeroTwoDimIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_MECH_IEC:
            return isSetWindMechIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_GEN_TYPE3_IEC:
            return isSetWindGenType3IEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC:
            return isSetWindContPitchAngleIEC();
        case CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC:
            return isSetWindContPType3IEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType3IECImpl
