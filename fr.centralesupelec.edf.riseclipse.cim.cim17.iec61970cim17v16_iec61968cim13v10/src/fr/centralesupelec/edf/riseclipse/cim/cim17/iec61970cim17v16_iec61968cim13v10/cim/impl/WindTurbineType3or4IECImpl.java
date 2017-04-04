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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQLimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQPQULimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindRefFrameRotIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Turbine Type3or4 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWindContQLimIEC <em>Wind Cont QLim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWIndContQIEC <em>WInd Cont QIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindTurbineType3or4IECImpl#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindTurbineType3or4IECImpl extends WindTurbineType3or4DynamicsImpl implements WindTurbineType3or4IEC {
    /**
     * The cached value of the '{@link #getWindContCurrLimIEC() <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContCurrLimIEC()
     * @generated
     * @ordered
     */
    protected WindContCurrLimIEC windContCurrLimIEC;

    /**
     * This is true if the Wind Cont Curr Lim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContCurrLimIECESet;

    /**
     * The cached value of the '{@link #getWindRefFrameRotIEC() <em>Wind Ref Frame Rot IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindRefFrameRotIEC()
     * @generated
     * @ordered
     */
    protected WindRefFrameRotIEC windRefFrameRotIEC;

    /**
     * This is true if the Wind Ref Frame Rot IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windRefFrameRotIECESet;

    /**
     * The cached value of the '{@link #getWindProtectionIEC() <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindProtectionIEC()
     * @generated
     * @ordered
     */
    protected WindProtectionIEC windProtectionIEC;

    /**
     * This is true if the Wind Protection IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windProtectionIECESet;

    /**
     * The cached value of the '{@link #getWindContQLimIEC() <em>Wind Cont QLim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContQLimIEC()
     * @generated
     * @ordered
     */
    protected WindContQLimIEC windContQLimIEC;

    /**
     * This is true if the Wind Cont QLim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContQLimIECESet;

    /**
     * The cached value of the '{@link #getWIndContQIEC() <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWIndContQIEC()
     * @generated
     * @ordered
     */
    protected WindContQIEC wIndContQIEC;

    /**
     * This is true if the WInd Cont QIEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wIndContQIECESet;

    /**
     * The cached value of the '{@link #getWindContQPQULimIEC() <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindContQPQULimIEC()
     * @generated
     * @ordered
     */
    protected WindContQPQULimIEC windContQPQULimIEC;

    /**
     * This is true if the Wind Cont QPQU Lim IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windContQPQULimIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindTurbineType3or4IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindTurbineType3or4IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContCurrLimIEC getWindContCurrLimIEC() {
        return windContCurrLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC,
            NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = newWindContCurrLimIEC;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC,
                    newWindContCurrLimIEC, !oldWindContCurrLimIECESet );
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
    public void setWindContCurrLimIEC( WindContCurrLimIEC newWindContCurrLimIEC ) {
        if( newWindContCurrLimIEC != windContCurrLimIEC ) {
            NotificationChain msgs = null;
            if( windContCurrLimIEC != null ) msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            if( newWindContCurrLimIEC != null ) msgs = ( ( InternalEObject ) newWindContCurrLimIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            msgs = basicSetWindContCurrLimIEC( newWindContCurrLimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, newWindContCurrLimIEC,
                    newWindContCurrLimIEC, !oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContCurrLimIEC( NotificationChain msgs ) {
        WindContCurrLimIEC oldWindContCurrLimIEC = windContCurrLimIEC;
        windContCurrLimIEC = null;
        boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
        windContCurrLimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, oldWindContCurrLimIEC, null,
                    oldWindContCurrLimIECESet );
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
    public void unsetWindContCurrLimIEC() {
        if( windContCurrLimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            msgs = basicUnsetWindContCurrLimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContCurrLimIECESet = windContCurrLimIECESet;
            windContCurrLimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC, null, null,
                    oldWindContCurrLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContCurrLimIEC() {
        return windContCurrLimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindRefFrameRotIEC getWindRefFrameRotIEC() {
        return windRefFrameRotIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindRefFrameRotIEC( WindRefFrameRotIEC newWindRefFrameRotIEC,
            NotificationChain msgs ) {
        WindRefFrameRotIEC oldWindRefFrameRotIEC = windRefFrameRotIEC;
        windRefFrameRotIEC = newWindRefFrameRotIEC;
        boolean oldWindRefFrameRotIECESet = windRefFrameRotIECESet;
        windRefFrameRotIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC, oldWindRefFrameRotIEC,
                    newWindRefFrameRotIEC, !oldWindRefFrameRotIECESet );
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
    public void setWindRefFrameRotIEC( WindRefFrameRotIEC newWindRefFrameRotIEC ) {
        if( newWindRefFrameRotIEC != windRefFrameRotIEC ) {
            NotificationChain msgs = null;
            if( windRefFrameRotIEC != null ) msgs = ( ( InternalEObject ) windRefFrameRotIEC ).eInverseRemove( this,
                    CimPackage.WIND_REF_FRAME_ROT_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindRefFrameRotIEC.class, msgs );
            if( newWindRefFrameRotIEC != null ) msgs = ( ( InternalEObject ) newWindRefFrameRotIEC ).eInverseAdd( this,
                    CimPackage.WIND_REF_FRAME_ROT_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindRefFrameRotIEC.class, msgs );
            msgs = basicSetWindRefFrameRotIEC( newWindRefFrameRotIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindRefFrameRotIECESet = windRefFrameRotIECESet;
            windRefFrameRotIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC, newWindRefFrameRotIEC,
                    newWindRefFrameRotIEC, !oldWindRefFrameRotIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindRefFrameRotIEC( NotificationChain msgs ) {
        WindRefFrameRotIEC oldWindRefFrameRotIEC = windRefFrameRotIEC;
        windRefFrameRotIEC = null;
        boolean oldWindRefFrameRotIECESet = windRefFrameRotIECESet;
        windRefFrameRotIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC, oldWindRefFrameRotIEC, null,
                    oldWindRefFrameRotIECESet );
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
    public void unsetWindRefFrameRotIEC() {
        if( windRefFrameRotIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windRefFrameRotIEC ).eInverseRemove( this,
                    CimPackage.WIND_REF_FRAME_ROT_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindRefFrameRotIEC.class, msgs );
            msgs = basicUnsetWindRefFrameRotIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindRefFrameRotIECESet = windRefFrameRotIECESet;
            windRefFrameRotIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC, null, null,
                    oldWindRefFrameRotIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindRefFrameRotIEC() {
        return windRefFrameRotIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindProtectionIEC getWindProtectionIEC() {
        return windProtectionIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindProtectionIEC( WindProtectionIEC newWindProtectionIEC,
            NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = newWindProtectionIEC;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet );
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
    public void setWindProtectionIEC( WindProtectionIEC newWindProtectionIEC ) {
        if( newWindProtectionIEC != windProtectionIEC ) {
            NotificationChain msgs = null;
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            if( newWindProtectionIEC != null ) msgs = ( ( InternalEObject ) newWindProtectionIEC ).eInverseAdd( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            msgs = basicSetWindProtectionIEC( newWindProtectionIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, newWindProtectionIEC,
                    newWindProtectionIEC, !oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindProtectionIEC( NotificationChain msgs ) {
        WindProtectionIEC oldWindProtectionIEC = windProtectionIEC;
        windProtectionIEC = null;
        boolean oldWindProtectionIECESet = windProtectionIECESet;
        windProtectionIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, oldWindProtectionIEC, null,
                    oldWindProtectionIECESet );
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
    public void unsetWindProtectionIEC() {
        if( windProtectionIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            msgs = basicUnsetWindProtectionIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindProtectionIECESet = windProtectionIECESet;
            windProtectionIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, null, null, oldWindProtectionIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindProtectionIEC() {
        return windProtectionIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQLimIEC getWindContQLimIEC() {
        return windContQLimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContQLimIEC( WindContQLimIEC newWindContQLimIEC, NotificationChain msgs ) {
        WindContQLimIEC oldWindContQLimIEC = windContQLimIEC;
        windContQLimIEC = newWindContQLimIEC;
        boolean oldWindContQLimIECESet = windContQLimIECESet;
        windContQLimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC, oldWindContQLimIEC, newWindContQLimIEC,
                    !oldWindContQLimIECESet );
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
    public void setWindContQLimIEC( WindContQLimIEC newWindContQLimIEC ) {
        if( newWindContQLimIEC != windContQLimIEC ) {
            NotificationChain msgs = null;
            if( windContQLimIEC != null ) msgs = ( ( InternalEObject ) windContQLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QLIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQLimIEC.class, msgs );
            if( newWindContQLimIEC != null ) msgs = ( ( InternalEObject ) newWindContQLimIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_QLIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQLimIEC.class, msgs );
            msgs = basicSetWindContQLimIEC( newWindContQLimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQLimIECESet = windContQLimIECESet;
            windContQLimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC, newWindContQLimIEC, newWindContQLimIEC,
                    !oldWindContQLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContQLimIEC( NotificationChain msgs ) {
        WindContQLimIEC oldWindContQLimIEC = windContQLimIEC;
        windContQLimIEC = null;
        boolean oldWindContQLimIECESet = windContQLimIECESet;
        windContQLimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC, oldWindContQLimIEC, null,
                    oldWindContQLimIECESet );
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
    public void unsetWindContQLimIEC() {
        if( windContQLimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContQLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QLIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQLimIEC.class, msgs );
            msgs = basicUnsetWindContQLimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQLimIECESet = windContQLimIECESet;
            windContQLimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC, null, null, oldWindContQLimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContQLimIEC() {
        return windContQLimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQIEC getWIndContQIEC() {
        return wIndContQIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWIndContQIEC( WindContQIEC newWIndContQIEC, NotificationChain msgs ) {
        WindContQIEC oldWIndContQIEC = wIndContQIEC;
        wIndContQIEC = newWIndContQIEC;
        boolean oldWIndContQIECESet = wIndContQIECESet;
        wIndContQIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, oldWIndContQIEC, newWIndContQIEC,
                    !oldWIndContQIECESet );
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
    public void setWIndContQIEC( WindContQIEC newWIndContQIEC ) {
        if( newWIndContQIEC != wIndContQIEC ) {
            NotificationChain msgs = null;
            if( wIndContQIEC != null ) msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            if( newWIndContQIEC != null ) msgs = ( ( InternalEObject ) newWIndContQIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            msgs = basicSetWIndContQIEC( newWIndContQIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWIndContQIECESet = wIndContQIECESet;
            wIndContQIECESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC,
                            newWIndContQIEC, newWIndContQIEC, !oldWIndContQIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWIndContQIEC( NotificationChain msgs ) {
        WindContQIEC oldWIndContQIEC = wIndContQIEC;
        wIndContQIEC = null;
        boolean oldWIndContQIECESet = wIndContQIECESet;
        wIndContQIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, oldWIndContQIEC, null, oldWIndContQIECESet );
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
    public void unsetWIndContQIEC() {
        if( wIndContQIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            msgs = basicUnsetWIndContQIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWIndContQIECESet = wIndContQIECESet;
            wIndContQIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, null, null, oldWIndContQIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWIndContQIEC() {
        return wIndContQIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindContQPQULimIEC getWindContQPQULimIEC() {
        return windContQPQULimIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindContQPQULimIEC( WindContQPQULimIEC newWindContQPQULimIEC,
            NotificationChain msgs ) {
        WindContQPQULimIEC oldWindContQPQULimIEC = windContQPQULimIEC;
        windContQPQULimIEC = newWindContQPQULimIEC;
        boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
        windContQPQULimIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC, oldWindContQPQULimIEC,
                    newWindContQPQULimIEC, !oldWindContQPQULimIECESet );
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
    public void setWindContQPQULimIEC( WindContQPQULimIEC newWindContQPQULimIEC ) {
        if( newWindContQPQULimIEC != windContQPQULimIEC ) {
            NotificationChain msgs = null;
            if( windContQPQULimIEC != null ) msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQPQULimIEC.class, msgs );
            if( newWindContQPQULimIEC != null ) msgs = ( ( InternalEObject ) newWindContQPQULimIEC ).eInverseAdd( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQPQULimIEC.class, msgs );
            msgs = basicSetWindContQPQULimIEC( newWindContQPQULimIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
            windContQPQULimIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC, newWindContQPQULimIEC,
                    newWindContQPQULimIEC, !oldWindContQPQULimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindContQPQULimIEC( NotificationChain msgs ) {
        WindContQPQULimIEC oldWindContQPQULimIEC = windContQPQULimIEC;
        windContQPQULimIEC = null;
        boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
        windContQPQULimIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC, oldWindContQPQULimIEC, null,
                    oldWindContQPQULimIECESet );
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
    public void unsetWindContQPQULimIEC() {
        if( windContQPQULimIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQPQULimIEC.class, msgs );
            msgs = basicUnsetWindContQPQULimIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindContQPQULimIECESet = windContQPQULimIECESet;
            windContQPQULimIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC, null, null,
                    oldWindContQPQULimIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindContQPQULimIEC() {
        return windContQPQULimIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            if( windContCurrLimIEC != null ) msgs = ( ( InternalEObject ) windContCurrLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_CURR_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContCurrLimIEC.class, msgs );
            return basicSetWindContCurrLimIEC( ( WindContCurrLimIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            if( windRefFrameRotIEC != null ) msgs = ( ( InternalEObject ) windRefFrameRotIEC ).eInverseRemove( this,
                    CimPackage.WIND_REF_FRAME_ROT_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindRefFrameRotIEC.class, msgs );
            return basicSetWindRefFrameRotIEC( ( WindRefFrameRotIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            if( windProtectionIEC != null ) msgs = ( ( InternalEObject ) windProtectionIEC ).eInverseRemove( this,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindProtectionIEC.class, msgs );
            return basicSetWindProtectionIEC( ( WindProtectionIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            if( windContQLimIEC != null ) msgs = ( ( InternalEObject ) windContQLimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QLIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQLimIEC.class, msgs );
            return basicSetWindContQLimIEC( ( WindContQLimIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            if( wIndContQIEC != null ) msgs = ( ( InternalEObject ) wIndContQIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQIEC.class, msgs );
            return basicSetWIndContQIEC( ( WindContQIEC ) otherEnd, msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            if( windContQPQULimIEC != null ) msgs = ( ( InternalEObject ) windContQPQULimIEC ).eInverseRemove( this,
                    CimPackage.WIND_CONT_QPQU_LIM_IEC__WIND_TURBINE_TYPE3OR4_IEC, WindContQPQULimIEC.class, msgs );
            return basicSetWindContQPQULimIEC( ( WindContQPQULimIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            return basicUnsetWindContCurrLimIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            return basicUnsetWindRefFrameRotIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            return basicUnsetWindProtectionIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            return basicUnsetWindContQLimIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            return basicUnsetWIndContQIEC( msgs );
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            return basicUnsetWindContQPQULimIEC( msgs );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            return getWindContCurrLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            return getWindRefFrameRotIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            return getWindProtectionIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            return getWindContQLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            return getWIndContQIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            return getWindContQPQULimIEC();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            setWindContCurrLimIEC( ( WindContCurrLimIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            setWindRefFrameRotIEC( ( WindRefFrameRotIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            setWindProtectionIEC( ( WindProtectionIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            setWindContQLimIEC( ( WindContQLimIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            setWIndContQIEC( ( WindContQIEC ) newValue );
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            setWindContQPQULimIEC( ( WindContQPQULimIEC ) newValue );
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            unsetWindContCurrLimIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            unsetWindRefFrameRotIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            unsetWindProtectionIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            unsetWindContQLimIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            unsetWIndContQIEC();
            return;
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            unsetWindContQPQULimIEC();
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
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_CURR_LIM_IEC:
            return isSetWindContCurrLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_REF_FRAME_ROT_IEC:
            return isSetWindRefFrameRotIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC:
            return isSetWindProtectionIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QLIM_IEC:
            return isSetWindContQLimIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC:
            return isSetWIndContQIEC();
        case CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QPQU_LIM_IEC:
            return isSetWindContQPQULimIEC();
        }
        return super.eIsSet( featureID );
    }

} //WindTurbineType3or4IECImpl
