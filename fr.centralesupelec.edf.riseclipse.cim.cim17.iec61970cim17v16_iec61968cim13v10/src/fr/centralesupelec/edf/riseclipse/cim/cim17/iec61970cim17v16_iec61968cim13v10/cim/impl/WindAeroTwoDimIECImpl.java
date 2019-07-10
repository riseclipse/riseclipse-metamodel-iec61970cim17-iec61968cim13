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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Aero Two Dim IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getDpomega <em>Dpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getDptheta <em>Dptheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getDpv1 <em>Dpv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getOmegazero <em>Omegazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getPavail <em>Pavail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getThetav2 <em>Thetav2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getThetazero <em>Thetazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindAeroTwoDimIECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindAeroTwoDimIECImpl extends IdentifiedObjectImpl implements WindAeroTwoDimIEC {
    /**
     * The default value of the '{@link #getDpomega() <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpomega()
     * @generated
     * @ordered
     */
    protected static final Float DPOMEGA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpomega() <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpomega()
     * @generated
     * @ordered
     */
    protected Float dpomega = DPOMEGA_EDEFAULT;

    /**
     * This is true if the Dpomega attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpomegaESet;

    /**
     * The default value of the '{@link #getDptheta() <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDptheta()
     * @generated
     * @ordered
     */
    protected static final Float DPTHETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDptheta() <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDptheta()
     * @generated
     * @ordered
     */
    protected Float dptheta = DPTHETA_EDEFAULT;

    /**
     * This is true if the Dptheta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpthetaESet;

    /**
     * The default value of the '{@link #getDpv1() <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpv1()
     * @generated
     * @ordered
     */
    protected static final Float DPV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpv1() <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpv1()
     * @generated
     * @ordered
     */
    protected Float dpv1 = DPV1_EDEFAULT;

    /**
     * This is true if the Dpv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpv1ESet;

    /**
     * The default value of the '{@link #getOmegazero() <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegazero()
     * @generated
     * @ordered
     */
    protected static final Float OMEGAZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegazero() <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegazero()
     * @generated
     * @ordered
     */
    protected Float omegazero = OMEGAZERO_EDEFAULT;

    /**
     * This is true if the Omegazero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegazeroESet;

    /**
     * The default value of the '{@link #getPavail() <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPavail()
     * @generated
     * @ordered
     */
    protected static final Float PAVAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPavail() <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPavail()
     * @generated
     * @ordered
     */
    protected Float pavail = PAVAIL_EDEFAULT;

    /**
     * This is true if the Pavail attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pavailESet;

    /**
     * The default value of the '{@link #getThetav2() <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetav2()
     * @generated
     * @ordered
     */
    protected static final Float THETAV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetav2() <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetav2()
     * @generated
     * @ordered
     */
    protected Float thetav2 = THETAV2_EDEFAULT;

    /**
     * This is true if the Thetav2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetav2ESet;

    /**
     * The default value of the '{@link #getThetazero() <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetazero()
     * @generated
     * @ordered
     */
    protected static final Float THETAZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetazero() <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetazero()
     * @generated
     * @ordered
     */
    protected Float thetazero = THETAZERO_EDEFAULT;

    /**
     * This is true if the Thetazero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetazeroESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindAeroTwoDimIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindAeroTwoDimIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpomega() {
        return dpomega;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpomega( Float newDpomega ) {
        Float oldDpomega = dpomega;
        dpomega = newDpomega;
        boolean oldDpomegaESet = dpomegaESet;
        dpomegaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA, oldDpomega, dpomega, !oldDpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpomega() {
        Float oldDpomega = dpomega;
        boolean oldDpomegaESet = dpomegaESet;
        dpomega = DPOMEGA_EDEFAULT;
        dpomegaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA, oldDpomega, DPOMEGA_EDEFAULT, oldDpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpomega() {
        return dpomegaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDptheta() {
        return dptheta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDptheta( Float newDptheta ) {
        Float oldDptheta = dptheta;
        dptheta = newDptheta;
        boolean oldDpthetaESet = dpthetaESet;
        dpthetaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA, oldDptheta, dptheta, !oldDpthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDptheta() {
        Float oldDptheta = dptheta;
        boolean oldDpthetaESet = dpthetaESet;
        dptheta = DPTHETA_EDEFAULT;
        dpthetaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA, oldDptheta, DPTHETA_EDEFAULT, oldDpthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDptheta() {
        return dpthetaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpv1() {
        return dpv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpv1( Float newDpv1 ) {
        Float oldDpv1 = dpv1;
        dpv1 = newDpv1;
        boolean oldDpv1ESet = dpv1ESet;
        dpv1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1, oldDpv1, dpv1, !oldDpv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpv1() {
        Float oldDpv1 = dpv1;
        boolean oldDpv1ESet = dpv1ESet;
        dpv1 = DPV1_EDEFAULT;
        dpv1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1, oldDpv1, DPV1_EDEFAULT, oldDpv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpv1() {
        return dpv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmegazero() {
        return omegazero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegazero( Float newOmegazero ) {
        Float oldOmegazero = omegazero;
        omegazero = newOmegazero;
        boolean oldOmegazeroESet = omegazeroESet;
        omegazeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO, oldOmegazero, omegazero, !oldOmegazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegazero() {
        Float oldOmegazero = omegazero;
        boolean oldOmegazeroESet = omegazeroESet;
        omegazero = OMEGAZERO_EDEFAULT;
        omegazeroESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO, oldOmegazero, OMEGAZERO_EDEFAULT, oldOmegazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegazero() {
        return omegazeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPavail() {
        return pavail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPavail( Float newPavail ) {
        Float oldPavail = pavail;
        pavail = newPavail;
        boolean oldPavailESet = pavailESet;
        pavailESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL, oldPavail, pavail, !oldPavailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPavail() {
        Float oldPavail = pavail;
        boolean oldPavailESet = pavailESet;
        pavail = PAVAIL_EDEFAULT;
        pavailESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL, oldPavail, PAVAIL_EDEFAULT, oldPavailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPavail() {
        return pavailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetav2() {
        return thetav2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetav2( Float newThetav2 ) {
        Float oldThetav2 = thetav2;
        thetav2 = newThetav2;
        boolean oldThetav2ESet = thetav2ESet;
        thetav2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2, oldThetav2, thetav2, !oldThetav2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetav2() {
        Float oldThetav2 = thetav2;
        boolean oldThetav2ESet = thetav2ESet;
        thetav2 = THETAV2_EDEFAULT;
        thetav2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2, oldThetav2, THETAV2_EDEFAULT, oldThetav2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetav2() {
        return thetav2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetazero() {
        return thetazero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetazero( Float newThetazero ) {
        Float oldThetazero = thetazero;
        thetazero = newThetazero;
        boolean oldThetazeroESet = thetazeroESet;
        thetazeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO, oldThetazero, thetazero, !oldThetazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetazero() {
        Float oldThetazero = thetazero;
        boolean oldThetazeroESet = thetazeroESet;
        thetazero = THETAZERO_EDEFAULT;
        thetazeroESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO, oldThetazero, THETAZERO_EDEFAULT, oldThetazeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetazero() {
        return thetazeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet );
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
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
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
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC, null, null,
                    oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_AERO_TWO_DIM_IEC, WindTurbineType3IEC.class, msgs );
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
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
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA:
            return getDpomega();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA:
            return getDptheta();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1:
            return getDpv1();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO:
            return getOmegazero();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL:
            return getPavail();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2:
            return getThetav2();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO:
            return getThetazero();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return getWindTurbineType3IEC();
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
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA:
            setDpomega( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA:
            setDptheta( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1:
            setDpv1( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO:
            setOmegazero( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL:
            setPavail( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2:
            setThetav2( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO:
            setThetazero( ( Float ) newValue );
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
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
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA:
            unsetDpomega();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA:
            unsetDptheta();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1:
            unsetDpv1();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO:
            unsetOmegazero();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL:
            unsetPavail();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2:
            unsetThetav2();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO:
            unsetThetazero();
            return;
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
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
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPOMEGA:
            return isSetDpomega();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPTHETA:
            return isSetDptheta();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__DPV1:
            return isSetDpv1();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__OMEGAZERO:
            return isSetOmegazero();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__PAVAIL:
            return isSetPavail();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAV2:
            return isSetThetav2();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__THETAZERO:
            return isSetThetazero();
        case CimPackage.WIND_AERO_TWO_DIM_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
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
        result.append( " (dpomega: " );
        if( dpomegaESet )
            result.append( dpomega );
        else
            result.append( "<unset>" );
        result.append( ", dptheta: " );
        if( dpthetaESet )
            result.append( dptheta );
        else
            result.append( "<unset>" );
        result.append( ", dpv1: " );
        if( dpv1ESet )
            result.append( dpv1 );
        else
            result.append( "<unset>" );
        result.append( ", omegazero: " );
        if( omegazeroESet )
            result.append( omegazero );
        else
            result.append( "<unset>" );
        result.append( ", pavail: " );
        if( pavailESet )
            result.append( pavail );
        else
            result.append( "<unset>" );
        result.append( ", thetav2: " );
        if( thetav2ESet )
            result.append( thetav2 );
        else
            result.append( "<unset>" );
        result.append( ", thetazero: " );
        if( thetazeroESet )
            result.append( thetazero );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindAeroTwoDimIECImpl
