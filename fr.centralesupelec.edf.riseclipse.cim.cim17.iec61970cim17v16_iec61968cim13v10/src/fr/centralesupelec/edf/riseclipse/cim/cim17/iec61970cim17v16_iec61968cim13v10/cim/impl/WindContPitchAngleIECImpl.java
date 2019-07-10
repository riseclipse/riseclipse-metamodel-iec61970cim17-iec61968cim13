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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont Pitch Angle IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getDthetamin <em>Dthetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getKic <em>Kic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getKiomega <em>Kiomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getKpc <em>Kpc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getKpomega <em>Kpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getKpx <em>Kpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getThetamax <em>Thetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getThetamin <em>Thetamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getTtheta <em>Ttheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPitchAngleIECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPitchAngleIECImpl extends IdentifiedObjectImpl implements WindContPitchAngleIEC {
    /**
     * The default value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected static final Float DTHETAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected Float dthetamax = DTHETAMAX_EDEFAULT;

    /**
     * This is true if the Dthetamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetamaxESet;

    /**
     * The default value of the '{@link #getDthetamin() <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamin()
     * @generated
     * @ordered
     */
    protected static final Float DTHETAMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamin() <em>Dthetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamin()
     * @generated
     * @ordered
     */
    protected Float dthetamin = DTHETAMIN_EDEFAULT;

    /**
     * This is true if the Dthetamin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetaminESet;

    /**
     * The default value of the '{@link #getKic() <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKic()
     * @generated
     * @ordered
     */
    protected static final Float KIC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKic() <em>Kic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKic()
     * @generated
     * @ordered
     */
    protected Float kic = KIC_EDEFAULT;

    /**
     * This is true if the Kic attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kicESet;

    /**
     * The default value of the '{@link #getKiomega() <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiomega()
     * @generated
     * @ordered
     */
    protected static final Float KIOMEGA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiomega() <em>Kiomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiomega()
     * @generated
     * @ordered
     */
    protected Float kiomega = KIOMEGA_EDEFAULT;

    /**
     * This is true if the Kiomega attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiomegaESet;

    /**
     * The default value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected static final Float KPC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpc() <em>Kpc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpc()
     * @generated
     * @ordered
     */
    protected Float kpc = KPC_EDEFAULT;

    /**
     * This is true if the Kpc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpcESet;

    /**
     * The default value of the '{@link #getKpomega() <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpomega()
     * @generated
     * @ordered
     */
    protected static final Float KPOMEGA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpomega() <em>Kpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpomega()
     * @generated
     * @ordered
     */
    protected Float kpomega = KPOMEGA_EDEFAULT;

    /**
     * This is true if the Kpomega attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpomegaESet;

    /**
     * The default value of the '{@link #getKpx() <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpx()
     * @generated
     * @ordered
     */
    protected static final Float KPX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpx() <em>Kpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpx()
     * @generated
     * @ordered
     */
    protected Float kpx = KPX_EDEFAULT;

    /**
     * This is true if the Kpx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpxESet;

    /**
     * The default value of the '{@link #getThetamax() <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetamax()
     * @generated
     * @ordered
     */
    protected static final Float THETAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetamax() <em>Thetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetamax()
     * @generated
     * @ordered
     */
    protected Float thetamax = THETAMAX_EDEFAULT;

    /**
     * This is true if the Thetamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetamaxESet;

    /**
     * The default value of the '{@link #getThetamin() <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetamin()
     * @generated
     * @ordered
     */
    protected static final Float THETAMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetamin() <em>Thetamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetamin()
     * @generated
     * @ordered
     */
    protected Float thetamin = THETAMIN_EDEFAULT;

    /**
     * This is true if the Thetamin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetaminESet;

    /**
     * The default value of the '{@link #getTtheta() <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTtheta()
     * @generated
     * @ordered
     */
    protected static final Float TTHETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTtheta() <em>Ttheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTtheta()
     * @generated
     * @ordered
     */
    protected Float ttheta = TTHETA_EDEFAULT;

    /**
     * This is true if the Ttheta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tthetaESet;

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
    protected WindContPitchAngleIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPitchAngleIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDthetamax() {
        return dthetamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamax( Float newDthetamax ) {
        Float oldDthetamax = dthetamax;
        dthetamax = newDthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX, oldDthetamax, dthetamax, !oldDthetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamax() {
        Float oldDthetamax = dthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamax = DTHETAMAX_EDEFAULT;
        dthetamaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX, oldDthetamax, DTHETAMAX_EDEFAULT, oldDthetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamax() {
        return dthetamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDthetamin() {
        return dthetamin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamin( Float newDthetamin ) {
        Float oldDthetamin = dthetamin;
        dthetamin = newDthetamin;
        boolean oldDthetaminESet = dthetaminESet;
        dthetaminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN, oldDthetamin, dthetamin, !oldDthetaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamin() {
        Float oldDthetamin = dthetamin;
        boolean oldDthetaminESet = dthetaminESet;
        dthetamin = DTHETAMIN_EDEFAULT;
        dthetaminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN, oldDthetamin, DTHETAMIN_EDEFAULT, oldDthetaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamin() {
        return dthetaminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKic() {
        return kic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKic( Float newKic ) {
        Float oldKic = kic;
        kic = newKic;
        boolean oldKicESet = kicESet;
        kicESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC, oldKic, kic, !oldKicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKic() {
        Float oldKic = kic;
        boolean oldKicESet = kicESet;
        kic = KIC_EDEFAULT;
        kicESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC, oldKic, KIC_EDEFAULT, oldKicESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKic() {
        return kicESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiomega() {
        return kiomega;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiomega( Float newKiomega ) {
        Float oldKiomega = kiomega;
        kiomega = newKiomega;
        boolean oldKiomegaESet = kiomegaESet;
        kiomegaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA, oldKiomega, kiomega, !oldKiomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiomega() {
        Float oldKiomega = kiomega;
        boolean oldKiomegaESet = kiomegaESet;
        kiomega = KIOMEGA_EDEFAULT;
        kiomegaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA, oldKiomega, KIOMEGA_EDEFAULT, oldKiomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiomega() {
        return kiomegaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpc() {
        return kpc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpc( Float newKpc ) {
        Float oldKpc = kpc;
        kpc = newKpc;
        boolean oldKpcESet = kpcESet;
        kpcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC, oldKpc, kpc, !oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpc() {
        Float oldKpc = kpc;
        boolean oldKpcESet = kpcESet;
        kpc = KPC_EDEFAULT;
        kpcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC, oldKpc, KPC_EDEFAULT, oldKpcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpc() {
        return kpcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpomega() {
        return kpomega;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpomega( Float newKpomega ) {
        Float oldKpomega = kpomega;
        kpomega = newKpomega;
        boolean oldKpomegaESet = kpomegaESet;
        kpomegaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA, oldKpomega, kpomega, !oldKpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpomega() {
        Float oldKpomega = kpomega;
        boolean oldKpomegaESet = kpomegaESet;
        kpomega = KPOMEGA_EDEFAULT;
        kpomegaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA, oldKpomega, KPOMEGA_EDEFAULT, oldKpomegaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpomega() {
        return kpomegaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpx() {
        return kpx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpx( Float newKpx ) {
        Float oldKpx = kpx;
        kpx = newKpx;
        boolean oldKpxESet = kpxESet;
        kpxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX, oldKpx, kpx, !oldKpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpx() {
        Float oldKpx = kpx;
        boolean oldKpxESet = kpxESet;
        kpx = KPX_EDEFAULT;
        kpxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX, oldKpx, KPX_EDEFAULT, oldKpxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpx() {
        return kpxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetamax() {
        return thetamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetamax( Float newThetamax ) {
        Float oldThetamax = thetamax;
        thetamax = newThetamax;
        boolean oldThetamaxESet = thetamaxESet;
        thetamaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX, oldThetamax, thetamax, !oldThetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetamax() {
        Float oldThetamax = thetamax;
        boolean oldThetamaxESet = thetamaxESet;
        thetamax = THETAMAX_EDEFAULT;
        thetamaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX, oldThetamax, THETAMAX_EDEFAULT, oldThetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetamax() {
        return thetamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetamin() {
        return thetamin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetamin( Float newThetamin ) {
        Float oldThetamin = thetamin;
        thetamin = newThetamin;
        boolean oldThetaminESet = thetaminESet;
        thetaminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN, oldThetamin, thetamin, !oldThetaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetamin() {
        Float oldThetamin = thetamin;
        boolean oldThetaminESet = thetaminESet;
        thetamin = THETAMIN_EDEFAULT;
        thetaminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN, oldThetamin, THETAMIN_EDEFAULT, oldThetaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetamin() {
        return thetaminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTtheta() {
        return ttheta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTtheta( Float newTtheta ) {
        Float oldTtheta = ttheta;
        ttheta = newTtheta;
        boolean oldTthetaESet = tthetaESet;
        tthetaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA, oldTtheta, ttheta, !oldTthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTtheta() {
        Float oldTtheta = ttheta;
        boolean oldTthetaESet = tthetaESet;
        ttheta = TTHETA_EDEFAULT;
        tthetaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA, oldTtheta, TTHETA_EDEFAULT, oldTthetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTtheta() {
        return tthetaESet;
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
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
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
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
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
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
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
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC, null, null,
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PITCH_ANGLE_IEC, WindTurbineType3IEC.class, msgs );
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX:
            return getDthetamax();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN:
            return getDthetamin();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC:
            return getKic();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA:
            return getKiomega();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC:
            return getKpc();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA:
            return getKpomega();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX:
            return getKpx();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX:
            return getThetamax();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN:
            return getThetamin();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA:
            return getTtheta();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX:
            setDthetamax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN:
            setDthetamin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC:
            setKic( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA:
            setKiomega( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC:
            setKpc( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA:
            setKpomega( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX:
            setKpx( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX:
            setThetamax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN:
            setThetamin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA:
            setTtheta( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX:
            unsetDthetamax();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN:
            unsetDthetamin();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC:
            unsetKic();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA:
            unsetKiomega();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC:
            unsetKpc();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA:
            unsetKpomega();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX:
            unsetKpx();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX:
            unsetThetamax();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN:
            unsetThetamin();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA:
            unsetTtheta();
            return;
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
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
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMAX:
            return isSetDthetamax();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__DTHETAMIN:
            return isSetDthetamin();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIC:
            return isSetKic();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KIOMEGA:
            return isSetKiomega();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPC:
            return isSetKpc();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPOMEGA:
            return isSetKpomega();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__KPX:
            return isSetKpx();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMAX:
            return isSetThetamax();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__THETAMIN:
            return isSetThetamin();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__TTHETA:
            return isSetTtheta();
        case CimPackage.WIND_CONT_PITCH_ANGLE_IEC__WIND_TURBINE_TYPE3_IEC:
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
        result.append( " (dthetamax: " );
        if( dthetamaxESet )
            result.append( dthetamax );
        else
            result.append( "<unset>" );
        result.append( ", dthetamin: " );
        if( dthetaminESet )
            result.append( dthetamin );
        else
            result.append( "<unset>" );
        result.append( ", kic: " );
        if( kicESet )
            result.append( kic );
        else
            result.append( "<unset>" );
        result.append( ", kiomega: " );
        if( kiomegaESet )
            result.append( kiomega );
        else
            result.append( "<unset>" );
        result.append( ", kpc: " );
        if( kpcESet )
            result.append( kpc );
        else
            result.append( "<unset>" );
        result.append( ", kpomega: " );
        if( kpomegaESet )
            result.append( kpomega );
        else
            result.append( "<unset>" );
        result.append( ", kpx: " );
        if( kpxESet )
            result.append( kpx );
        else
            result.append( "<unset>" );
        result.append( ", thetamax: " );
        if( thetamaxESet )
            result.append( thetamax );
        else
            result.append( "<unset>" );
        result.append( ", thetamin: " );
        if( thetaminESet )
            result.append( thetamin );
        else
            result.append( "<unset>" );
        result.append( ", ttheta: " );
        if( tthetaESet )
            result.append( ttheta );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPitchAngleIECImpl
