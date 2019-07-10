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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbLCFB1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turb LCFB1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getFb <em>Fb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getFbf <em>Fbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getIrmax <em>Irmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getPbf <em>Pbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getPmwset <em>Pmwset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getSpeedReferenceGovernor <em>Speed Reference Governor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TurbLCFB1Impl#getTpelec <em>Tpelec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurbLCFB1Impl extends TurbineLoadControllerDynamicsImpl implements TurbLCFB1 {
    /**
     * The default value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected static final Float DB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDb() <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDb()
     * @generated
     * @ordered
     */
    protected Float db = DB_EDEFAULT;

    /**
     * This is true if the Db attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dbESet;

    /**
     * The default value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected static final Float EMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected Float emax = EMAX_EDEFAULT;

    /**
     * This is true if the Emax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean emaxESet;

    /**
     * The default value of the '{@link #getFb() <em>Fb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFb()
     * @generated
     * @ordered
     */
    protected static final Float FB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFb() <em>Fb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFb()
     * @generated
     * @ordered
     */
    protected Float fb = FB_EDEFAULT;

    /**
     * This is true if the Fb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fbESet;

    /**
     * The default value of the '{@link #getFbf() <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFbf()
     * @generated
     * @ordered
     */
    protected static final Boolean FBF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFbf() <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFbf()
     * @generated
     * @ordered
     */
    protected Boolean fbf = FBF_EDEFAULT;

    /**
     * This is true if the Fbf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fbfESet;

    /**
     * The default value of the '{@link #getIrmax() <em>Irmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIrmax()
     * @generated
     * @ordered
     */
    protected static final Float IRMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIrmax() <em>Irmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIrmax()
     * @generated
     * @ordered
     */
    protected Float irmax = IRMAX_EDEFAULT;

    /**
     * This is true if the Irmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean irmaxESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Float KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Float ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

    /**
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Float KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Float kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

    /**
     * The default value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected static final Float MWBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected Float mwbase = MWBASE_EDEFAULT;

    /**
     * This is true if the Mwbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwbaseESet;

    /**
     * The default value of the '{@link #getPbf() <em>Pbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPbf()
     * @generated
     * @ordered
     */
    protected static final Boolean PBF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPbf() <em>Pbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPbf()
     * @generated
     * @ordered
     */
    protected Boolean pbf = PBF_EDEFAULT;

    /**
     * This is true if the Pbf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pbfESet;

    /**
     * The default value of the '{@link #getPmwset() <em>Pmwset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmwset()
     * @generated
     * @ordered
     */
    protected static final Float PMWSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmwset() <em>Pmwset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmwset()
     * @generated
     * @ordered
     */
    protected Float pmwset = PMWSET_EDEFAULT;

    /**
     * This is true if the Pmwset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmwsetESet;

    /**
     * The default value of the '{@link #getSpeedReferenceGovernor() <em>Speed Reference Governor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedReferenceGovernor()
     * @generated
     * @ordered
     */
    protected static final Boolean SPEED_REFERENCE_GOVERNOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpeedReferenceGovernor() <em>Speed Reference Governor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedReferenceGovernor()
     * @generated
     * @ordered
     */
    protected Boolean speedReferenceGovernor = SPEED_REFERENCE_GOVERNOR_EDEFAULT;

    /**
     * This is true if the Speed Reference Governor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean speedReferenceGovernorESet;

    /**
     * The default value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected static final Float TPELEC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpelec() <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpelec()
     * @generated
     * @ordered
     */
    protected Float tpelec = TPELEC_EDEFAULT;

    /**
     * This is true if the Tpelec attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpelecESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TurbLCFB1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTurbLCFB1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDb() {
        return db;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDb( Float newDb ) {
        Float oldDb = db;
        db = newDb;
        boolean oldDbESet = dbESet;
        dbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__DB, oldDb, db, !oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDb() {
        Float oldDb = db;
        boolean oldDbESet = dbESet;
        db = DB_EDEFAULT;
        dbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__DB, oldDb, DB_EDEFAULT, oldDbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDb() {
        return dbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEmax() {
        return emax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmax( Float newEmax ) {
        Float oldEmax = emax;
        emax = newEmax;
        boolean oldEmaxESet = emaxESet;
        emaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TURB_LCFB1__EMAX, oldEmax, emax, !oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmax() {
        Float oldEmax = emax;
        boolean oldEmaxESet = emaxESet;
        emax = EMAX_EDEFAULT;
        emaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__EMAX, oldEmax, EMAX_EDEFAULT, oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmax() {
        return emaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFb() {
        return fb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFb( Float newFb ) {
        Float oldFb = fb;
        fb = newFb;
        boolean oldFbESet = fbESet;
        fbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__FB, oldFb, fb, !oldFbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFb() {
        Float oldFb = fb;
        boolean oldFbESet = fbESet;
        fb = FB_EDEFAULT;
        fbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__FB, oldFb, FB_EDEFAULT, oldFbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFb() {
        return fbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFbf() {
        return fbf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFbf( Boolean newFbf ) {
        Boolean oldFbf = fbf;
        fbf = newFbf;
        boolean oldFbfESet = fbfESet;
        fbfESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__FBF, oldFbf, fbf, !oldFbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFbf() {
        Boolean oldFbf = fbf;
        boolean oldFbfESet = fbfESet;
        fbf = FBF_EDEFAULT;
        fbfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__FBF, oldFbf, FBF_EDEFAULT, oldFbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFbf() {
        return fbfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIrmax() {
        return irmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIrmax( Float newIrmax ) {
        Float oldIrmax = irmax;
        irmax = newIrmax;
        boolean oldIrmaxESet = irmaxESet;
        irmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TURB_LCFB1__IRMAX, oldIrmax, irmax, !oldIrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIrmax() {
        Float oldIrmax = irmax;
        boolean oldIrmaxESet = irmaxESet;
        irmax = IRMAX_EDEFAULT;
        irmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__IRMAX, oldIrmax, IRMAX_EDEFAULT, oldIrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIrmax() {
        return irmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Float newKi ) {
        Float oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__KI, oldKi, ki, !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Float oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Float newKp ) {
        Float oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__KP, oldKp, kp, !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Float oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__KP, oldKp, KP_EDEFAULT, oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMwbase() {
        return mwbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwbase( Float newMwbase ) {
        Float oldMwbase = mwbase;
        mwbase = newMwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TURB_LCFB1__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwbase() {
        Float oldMwbase = mwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbase = MWBASE_EDEFAULT;
        mwbaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwbase() {
        return mwbaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPbf() {
        return pbf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPbf( Boolean newPbf ) {
        Boolean oldPbf = pbf;
        pbf = newPbf;
        boolean oldPbfESet = pbfESet;
        pbfESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__PBF, oldPbf, pbf, !oldPbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPbf() {
        Boolean oldPbf = pbf;
        boolean oldPbfESet = pbfESet;
        pbf = PBF_EDEFAULT;
        pbfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__PBF, oldPbf, PBF_EDEFAULT, oldPbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPbf() {
        return pbfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPmwset() {
        return pmwset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmwset( Float newPmwset ) {
        Float oldPmwset = pmwset;
        pmwset = newPmwset;
        boolean oldPmwsetESet = pmwsetESet;
        pmwsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TURB_LCFB1__PMWSET, oldPmwset, pmwset, !oldPmwsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmwset() {
        Float oldPmwset = pmwset;
        boolean oldPmwsetESet = pmwsetESet;
        pmwset = PMWSET_EDEFAULT;
        pmwsetESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__PMWSET, oldPmwset, PMWSET_EDEFAULT, oldPmwsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmwset() {
        return pmwsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSpeedReferenceGovernor() {
        return speedReferenceGovernor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpeedReferenceGovernor( Boolean newSpeedReferenceGovernor ) {
        Boolean oldSpeedReferenceGovernor = speedReferenceGovernor;
        speedReferenceGovernor = newSpeedReferenceGovernor;
        boolean oldSpeedReferenceGovernorESet = speedReferenceGovernorESet;
        speedReferenceGovernorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR,
                    oldSpeedReferenceGovernor, speedReferenceGovernor, !oldSpeedReferenceGovernorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpeedReferenceGovernor() {
        Boolean oldSpeedReferenceGovernor = speedReferenceGovernor;
        boolean oldSpeedReferenceGovernorESet = speedReferenceGovernorESet;
        speedReferenceGovernor = SPEED_REFERENCE_GOVERNOR_EDEFAULT;
        speedReferenceGovernorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR,
                    oldSpeedReferenceGovernor, SPEED_REFERENCE_GOVERNOR_EDEFAULT, oldSpeedReferenceGovernorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpeedReferenceGovernor() {
        return speedReferenceGovernorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpelec() {
        return tpelec;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpelec( Float newTpelec ) {
        Float oldTpelec = tpelec;
        tpelec = newTpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelecESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TURB_LCFB1__TPELEC, oldTpelec, tpelec, !oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpelec() {
        Float oldTpelec = tpelec;
        boolean oldTpelecESet = tpelecESet;
        tpelec = TPELEC_EDEFAULT;
        tpelecESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TURB_LCFB1__TPELEC, oldTpelec, TPELEC_EDEFAULT, oldTpelecESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpelec() {
        return tpelecESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TURB_LCFB1__DB:
            return getDb();
        case CimPackage.TURB_LCFB1__EMAX:
            return getEmax();
        case CimPackage.TURB_LCFB1__FB:
            return getFb();
        case CimPackage.TURB_LCFB1__FBF:
            return getFbf();
        case CimPackage.TURB_LCFB1__IRMAX:
            return getIrmax();
        case CimPackage.TURB_LCFB1__KI:
            return getKi();
        case CimPackage.TURB_LCFB1__KP:
            return getKp();
        case CimPackage.TURB_LCFB1__MWBASE:
            return getMwbase();
        case CimPackage.TURB_LCFB1__PBF:
            return getPbf();
        case CimPackage.TURB_LCFB1__PMWSET:
            return getPmwset();
        case CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR:
            return getSpeedReferenceGovernor();
        case CimPackage.TURB_LCFB1__TPELEC:
            return getTpelec();
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
        case CimPackage.TURB_LCFB1__DB:
            setDb( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__EMAX:
            setEmax( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__FB:
            setFb( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__FBF:
            setFbf( ( Boolean ) newValue );
            return;
        case CimPackage.TURB_LCFB1__IRMAX:
            setIrmax( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__PBF:
            setPbf( ( Boolean ) newValue );
            return;
        case CimPackage.TURB_LCFB1__PMWSET:
            setPmwset( ( Float ) newValue );
            return;
        case CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR:
            setSpeedReferenceGovernor( ( Boolean ) newValue );
            return;
        case CimPackage.TURB_LCFB1__TPELEC:
            setTpelec( ( Float ) newValue );
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
        case CimPackage.TURB_LCFB1__DB:
            unsetDb();
            return;
        case CimPackage.TURB_LCFB1__EMAX:
            unsetEmax();
            return;
        case CimPackage.TURB_LCFB1__FB:
            unsetFb();
            return;
        case CimPackage.TURB_LCFB1__FBF:
            unsetFbf();
            return;
        case CimPackage.TURB_LCFB1__IRMAX:
            unsetIrmax();
            return;
        case CimPackage.TURB_LCFB1__KI:
            unsetKi();
            return;
        case CimPackage.TURB_LCFB1__KP:
            unsetKp();
            return;
        case CimPackage.TURB_LCFB1__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.TURB_LCFB1__PBF:
            unsetPbf();
            return;
        case CimPackage.TURB_LCFB1__PMWSET:
            unsetPmwset();
            return;
        case CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR:
            unsetSpeedReferenceGovernor();
            return;
        case CimPackage.TURB_LCFB1__TPELEC:
            unsetTpelec();
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
        case CimPackage.TURB_LCFB1__DB:
            return isSetDb();
        case CimPackage.TURB_LCFB1__EMAX:
            return isSetEmax();
        case CimPackage.TURB_LCFB1__FB:
            return isSetFb();
        case CimPackage.TURB_LCFB1__FBF:
            return isSetFbf();
        case CimPackage.TURB_LCFB1__IRMAX:
            return isSetIrmax();
        case CimPackage.TURB_LCFB1__KI:
            return isSetKi();
        case CimPackage.TURB_LCFB1__KP:
            return isSetKp();
        case CimPackage.TURB_LCFB1__MWBASE:
            return isSetMwbase();
        case CimPackage.TURB_LCFB1__PBF:
            return isSetPbf();
        case CimPackage.TURB_LCFB1__PMWSET:
            return isSetPmwset();
        case CimPackage.TURB_LCFB1__SPEED_REFERENCE_GOVERNOR:
            return isSetSpeedReferenceGovernor();
        case CimPackage.TURB_LCFB1__TPELEC:
            return isSetTpelec();
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
        result.append( " (db: " );
        if( dbESet )
            result.append( db );
        else
            result.append( "<unset>" );
        result.append( ", emax: " );
        if( emaxESet )
            result.append( emax );
        else
            result.append( "<unset>" );
        result.append( ", fb: " );
        if( fbESet )
            result.append( fb );
        else
            result.append( "<unset>" );
        result.append( ", fbf: " );
        if( fbfESet )
            result.append( fbf );
        else
            result.append( "<unset>" );
        result.append( ", irmax: " );
        if( irmaxESet )
            result.append( irmax );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", pbf: " );
        if( pbfESet )
            result.append( pbf );
        else
            result.append( "<unset>" );
        result.append( ", pmwset: " );
        if( pmwsetESet )
            result.append( pmwset );
        else
            result.append( "<unset>" );
        result.append( ", speedReferenceGovernor: " );
        if( speedReferenceGovernorESet )
            result.append( speedReferenceGovernor );
        else
            result.append( "<unset>" );
        result.append( ", tpelec: " );
        if( tpelecESet )
            result.append( tpelec );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TurbLCFB1Impl
