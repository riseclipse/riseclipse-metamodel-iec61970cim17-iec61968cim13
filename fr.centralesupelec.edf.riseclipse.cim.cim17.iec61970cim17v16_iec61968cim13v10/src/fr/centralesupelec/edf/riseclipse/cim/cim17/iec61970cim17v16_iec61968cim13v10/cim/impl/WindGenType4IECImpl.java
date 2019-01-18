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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType4IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4aIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType4bIEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Gen Type4 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getDipmax <em>Dipmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getDiqmax <em>Diqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getDiqmin <em>Diqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getWindTurbineType4aIEC <em>Wind Turbine Type4a IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindGenType4IECImpl#getWindTurbineType4bIEC <em>Wind Turbine Type4b IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGenType4IECImpl extends IdentifiedObjectImpl implements WindGenType4IEC {
    /**
     * The default value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected static final Float DIPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDipmax() <em>Dipmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDipmax()
     * @generated
     * @ordered
     */
    protected Float dipmax = DIPMAX_EDEFAULT;

    /**
     * This is true if the Dipmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dipmaxESet;

    /**
     * The default value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected static final Float DIQMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiqmax() <em>Diqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmax()
     * @generated
     * @ordered
     */
    protected Float diqmax = DIQMAX_EDEFAULT;

    /**
     * This is true if the Diqmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diqmaxESet;

    /**
     * The default value of the '{@link #getDiqmin() <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmin()
     * @generated
     * @ordered
     */
    protected static final Float DIQMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiqmin() <em>Diqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiqmin()
     * @generated
     * @ordered
     */
    protected Float diqmin = DIQMIN_EDEFAULT;

    /**
     * This is true if the Diqmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diqminESet;

    /**
     * The default value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected static final Float TG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected Float tg = TG_EDEFAULT;

    /**
     * This is true if the Tg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tgESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4aIEC() <em>Wind Turbine Type4a IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4aIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4aIEC windTurbineType4aIEC;

    /**
     * This is true if the Wind Turbine Type4a IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4aIECESet;

    /**
     * The cached value of the '{@link #getWindTurbineType4bIEC() <em>Wind Turbine Type4b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType4bIEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType4bIEC windTurbineType4bIEC;

    /**
     * This is true if the Wind Turbine Type4b IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType4bIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGenType4IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGenType4IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDipmax() {
        return dipmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDipmax( Float newDipmax ) {
        Float oldDipmax = dipmax;
        dipmax = newDipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX, oldDipmax, dipmax, !oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDipmax() {
        Float oldDipmax = dipmax;
        boolean oldDipmaxESet = dipmaxESet;
        dipmax = DIPMAX_EDEFAULT;
        dipmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX, oldDipmax, DIPMAX_EDEFAULT, oldDipmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDipmax() {
        return dipmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiqmax() {
        return diqmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiqmax( Float newDiqmax ) {
        Float oldDiqmax = diqmax;
        diqmax = newDiqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX, oldDiqmax, diqmax, !oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiqmax() {
        Float oldDiqmax = diqmax;
        boolean oldDiqmaxESet = diqmaxESet;
        diqmax = DIQMAX_EDEFAULT;
        diqmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX, oldDiqmax, DIQMAX_EDEFAULT, oldDiqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiqmax() {
        return diqmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiqmin() {
        return diqmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiqmin( Float newDiqmin ) {
        Float oldDiqmin = diqmin;
        diqmin = newDiqmin;
        boolean oldDiqminESet = diqminESet;
        diqminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN, oldDiqmin, diqmin, !oldDiqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiqmin() {
        Float oldDiqmin = diqmin;
        boolean oldDiqminESet = diqminESet;
        diqmin = DIQMIN_EDEFAULT;
        diqminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN, oldDiqmin, DIQMIN_EDEFAULT, oldDiqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiqmin() {
        return diqminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTg() {
        return tg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTg( Float newTg ) {
        Float oldTg = tg;
        tg = newTg;
        boolean oldTgESet = tgESet;
        tgESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_GEN_TYPE4_IEC__TG, oldTg, tg, !oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTg() {
        Float oldTg = tg;
        boolean oldTgESet = tgESet;
        tg = TG_EDEFAULT;
        tgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_GEN_TYPE4_IEC__TG, oldTg, TG_EDEFAULT, oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTg() {
        return tgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4aIEC getWindTurbineType4aIEC() {
        return windTurbineType4aIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC,
            NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = newWindTurbineType4aIEC;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet );
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
    public void setWindTurbineType4aIEC( WindTurbineType4aIEC newWindTurbineType4aIEC ) {
        if( newWindTurbineType4aIEC != windTurbineType4aIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4aIEC.class, msgs );
            if( newWindTurbineType4aIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4aIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicSetWindTurbineType4aIEC( newWindTurbineType4aIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, newWindTurbineType4aIEC,
                    newWindTurbineType4aIEC, !oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4aIEC( NotificationChain msgs ) {
        WindTurbineType4aIEC oldWindTurbineType4aIEC = windTurbineType4aIEC;
        windTurbineType4aIEC = null;
        boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
        windTurbineType4aIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, oldWindTurbineType4aIEC, null,
                    oldWindTurbineType4aIECESet );
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
    public void unsetWindTurbineType4aIEC() {
        if( windTurbineType4aIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4aIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4aIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4aIECESet = windTurbineType4aIECESet;
            windTurbineType4aIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC, null, null, oldWindTurbineType4aIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4aIEC() {
        return windTurbineType4aIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType4bIEC getWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null && windTurbineType4bIEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType4bIEC = ( InternalEObject ) windTurbineType4bIEC;
            windTurbineType4bIEC = ( WindTurbineType4bIEC ) eResolveProxy( oldWindTurbineType4bIEC );
            if( windTurbineType4bIEC != oldWindTurbineType4bIEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                        windTurbineType4bIEC ) );
            }
        }
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType4bIEC basicGetWindTurbineType4bIEC() {
        return windTurbineType4bIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC,
            NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = newWindTurbineType4bIEC;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC,
                    newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet );
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
    public void setWindTurbineType4bIEC( WindTurbineType4bIEC newWindTurbineType4bIEC ) {
        if( newWindTurbineType4bIEC != windTurbineType4bIEC ) {
            NotificationChain msgs = null;
            if( windTurbineType4bIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4bIEC.class, msgs );
            if( newWindTurbineType4bIEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType4bIEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicSetWindTurbineType4bIEC( newWindTurbineType4bIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC, newWindTurbineType4bIEC,
                    newWindTurbineType4bIEC, !oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType4bIEC( NotificationChain msgs ) {
        WindTurbineType4bIEC oldWindTurbineType4bIEC = windTurbineType4bIEC;
        windTurbineType4bIEC = null;
        boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
        windTurbineType4bIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC, oldWindTurbineType4bIEC, null,
                    oldWindTurbineType4bIECESet );
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
    public void unsetWindTurbineType4bIEC() {
        if( windTurbineType4bIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4bIEC.class, msgs );
            msgs = basicUnsetWindTurbineType4bIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType4bIECESet = windTurbineType4bIECESet;
            windTurbineType4bIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC, null, null, oldWindTurbineType4bIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType4bIEC() {
        return windTurbineType4bIECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            if( windTurbineType4aIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4aIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4A_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4aIEC.class, msgs );
            return basicSetWindTurbineType4aIEC( ( WindTurbineType4aIEC ) otherEnd, msgs );
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( windTurbineType4bIEC != null ) msgs = ( ( InternalEObject ) windTurbineType4bIEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE4B_IEC__WIND_GEN_TYPE4_IEC, WindTurbineType4bIEC.class, msgs );
            return basicSetWindTurbineType4bIEC( ( WindTurbineType4bIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            return basicUnsetWindTurbineType4aIEC( msgs );
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            return basicUnsetWindTurbineType4bIEC( msgs );
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            return getDipmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            return getDiqmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            return getDiqmin();
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            return getTg();
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            return getWindTurbineType4aIEC();
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            if( resolve ) return getWindTurbineType4bIEC();
            return basicGetWindTurbineType4bIEC();
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            setDipmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            setDiqmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            setDiqmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            setWindTurbineType4aIEC( ( WindTurbineType4aIEC ) newValue );
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            setWindTurbineType4bIEC( ( WindTurbineType4bIEC ) newValue );
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            unsetDipmax();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            unsetDiqmax();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            unsetDiqmin();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            unsetTg();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            unsetWindTurbineType4aIEC();
            return;
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            unsetWindTurbineType4bIEC();
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
        case CimPackage.WIND_GEN_TYPE4_IEC__DIPMAX:
            return isSetDipmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMAX:
            return isSetDiqmax();
        case CimPackage.WIND_GEN_TYPE4_IEC__DIQMIN:
            return isSetDiqmin();
        case CimPackage.WIND_GEN_TYPE4_IEC__TG:
            return isSetTg();
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4A_IEC:
            return isSetWindTurbineType4aIEC();
        case CimPackage.WIND_GEN_TYPE4_IEC__WIND_TURBINE_TYPE4B_IEC:
            return isSetWindTurbineType4bIEC();
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
        result.append( " (dipmax: " );
        if( dipmaxESet )
            result.append( dipmax );
        else
            result.append( "<unset>" );
        result.append( ", diqmax: " );
        if( diqmaxESet )
            result.append( diqmax );
        else
            result.append( "<unset>" );
        result.append( ", diqmin: " );
        if( diqminESet )
            result.append( diqmin );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGenType4IECImpl
