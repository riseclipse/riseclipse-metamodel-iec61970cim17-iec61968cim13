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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcHU;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc HU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getAe <em>Ae</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getAi <em>Ai</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getAtr <em>Atr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getImax <em>Imax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getImin <em>Imin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getTi <em>Ti</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcHUImpl#getTr <em>Tr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcHUImpl extends ExcitationSystemDynamicsImpl implements ExcHU {
    /**
     * The default value of the '{@link #getAe() <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAe()
     * @generated
     * @ordered
     */
    protected static final Float AE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAe() <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAe()
     * @generated
     * @ordered
     */
    protected Float ae = AE_EDEFAULT;

    /**
     * This is true if the Ae attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aeESet;

    /**
     * The default value of the '{@link #getAi() <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAi()
     * @generated
     * @ordered
     */
    protected static final Float AI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAi() <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAi()
     * @generated
     * @ordered
     */
    protected Float ai = AI_EDEFAULT;

    /**
     * This is true if the Ai attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aiESet;

    /**
     * The default value of the '{@link #getAtr() <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtr()
     * @generated
     * @ordered
     */
    protected static final Float ATR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAtr() <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtr()
     * @generated
     * @ordered
     */
    protected Float atr = ATR_EDEFAULT;

    /**
     * This is true if the Atr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean atrESet;

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
     * The default value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected static final Float EMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected Float emin = EMIN_EDEFAULT;

    /**
     * This is true if the Emin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eminESet;

    /**
     * The default value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected static final Float IMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected Float imax = IMAX_EDEFAULT;

    /**
     * This is true if the Imax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean imaxESet;

    /**
     * The default value of the '{@link #getImin() <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImin()
     * @generated
     * @ordered
     */
    protected static final Float IMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImin() <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImin()
     * @generated
     * @ordered
     */
    protected Float imin = IMIN_EDEFAULT;

    /**
     * This is true if the Imin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iminESet;

    /**
     * The default value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected static final Float KE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected Float ke = KE_EDEFAULT;

    /**
     * This is true if the Ke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keESet;

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
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Float TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Float te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

    /**
     * The default value of the '{@link #getTi() <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi()
     * @generated
     * @ordered
     */
    protected static final Float TI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi() <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi()
     * @generated
     * @ordered
     */
    protected Float ti = TI_EDEFAULT;

    /**
     * This is true if the Ti attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tiESet;

    /**
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Float TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Float tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcHUImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcHU();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAe() {
        return ae;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAe( Float newAe ) {
        Float oldAe = ae;
        ae = newAe;
        boolean oldAeESet = aeESet;
        aeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__AE, oldAe, ae, !oldAeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAe() {
        Float oldAe = ae;
        boolean oldAeESet = aeESet;
        ae = AE_EDEFAULT;
        aeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__AE,
                oldAe, AE_EDEFAULT, oldAeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAe() {
        return aeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAi() {
        return ai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAi( Float newAi ) {
        Float oldAi = ai;
        ai = newAi;
        boolean oldAiESet = aiESet;
        aiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__AI, oldAi, ai, !oldAiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAi() {
        Float oldAi = ai;
        boolean oldAiESet = aiESet;
        ai = AI_EDEFAULT;
        aiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__AI,
                oldAi, AI_EDEFAULT, oldAiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAi() {
        return aiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAtr() {
        return atr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAtr( Float newAtr ) {
        Float oldAtr = atr;
        atr = newAtr;
        boolean oldAtrESet = atrESet;
        atrESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__ATR, oldAtr, atr, !oldAtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAtr() {
        Float oldAtr = atr;
        boolean oldAtrESet = atrESet;
        atr = ATR_EDEFAULT;
        atrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__ATR,
                oldAtr, ATR_EDEFAULT, oldAtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAtr() {
        return atrESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__EMAX, oldEmax, emax, !oldEmaxESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__EMAX,
                oldEmax, EMAX_EDEFAULT, oldEmaxESet ) );
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
    public Float getEmin() {
        return emin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmin( Float newEmin ) {
        Float oldEmin = emin;
        emin = newEmin;
        boolean oldEminESet = eminESet;
        eminESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__EMIN, oldEmin, emin, !oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmin() {
        Float oldEmin = emin;
        boolean oldEminESet = eminESet;
        emin = EMIN_EDEFAULT;
        eminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__EMIN,
                oldEmin, EMIN_EDEFAULT, oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmin() {
        return eminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getImax() {
        return imax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImax( Float newImax ) {
        Float oldImax = imax;
        imax = newImax;
        boolean oldImaxESet = imaxESet;
        imaxESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__IMAX, oldImax, imax, !oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImax() {
        Float oldImax = imax;
        boolean oldImaxESet = imaxESet;
        imax = IMAX_EDEFAULT;
        imaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__IMAX,
                oldImax, IMAX_EDEFAULT, oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImax() {
        return imaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getImin() {
        return imin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImin( Float newImin ) {
        Float oldImin = imin;
        imin = newImin;
        boolean oldIminESet = iminESet;
        iminESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__IMIN, oldImin, imin, !oldIminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImin() {
        Float oldImin = imin;
        boolean oldIminESet = iminESet;
        imin = IMIN_EDEFAULT;
        iminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__IMIN,
                oldImin, IMIN_EDEFAULT, oldIminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImin() {
        return iminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKe() {
        return ke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe( Float newKe ) {
        Float oldKe = ke;
        ke = newKe;
        boolean oldKeESet = keESet;
        keESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__KE, oldKe, ke, !oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe() {
        Float oldKe = ke;
        boolean oldKeESet = keESet;
        ke = KE_EDEFAULT;
        keESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__KE,
                oldKe, KE_EDEFAULT, oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe() {
        return keESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__KI, oldKi, ki, !oldKiESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__KI,
                oldKi, KI_EDEFAULT, oldKiESet ) );
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
    public Float getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Float newTe ) {
        Float oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Float oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TE,
                oldTe, TE_EDEFAULT, oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi() {
        return ti;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi( Float newTi ) {
        Float oldTi = ti;
        ti = newTi;
        boolean oldTiESet = tiESet;
        tiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TI, oldTi, ti, !oldTiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi() {
        Float oldTi = ti;
        boolean oldTiESet = tiESet;
        ti = TI_EDEFAULT;
        tiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TI,
                oldTi, TI_EDEFAULT, oldTiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi() {
        return tiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Float newTr ) {
        Float oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TR, oldTr, tr, !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Float oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TR,
                oldTr, TR_EDEFAULT, oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_HU__AE:
            return getAe();
        case CimPackage.EXC_HU__AI:
            return getAi();
        case CimPackage.EXC_HU__ATR:
            return getAtr();
        case CimPackage.EXC_HU__EMAX:
            return getEmax();
        case CimPackage.EXC_HU__EMIN:
            return getEmin();
        case CimPackage.EXC_HU__IMAX:
            return getImax();
        case CimPackage.EXC_HU__IMIN:
            return getImin();
        case CimPackage.EXC_HU__KE:
            return getKe();
        case CimPackage.EXC_HU__KI:
            return getKi();
        case CimPackage.EXC_HU__TE:
            return getTe();
        case CimPackage.EXC_HU__TI:
            return getTi();
        case CimPackage.EXC_HU__TR:
            return getTr();
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
        case CimPackage.EXC_HU__AE:
            setAe( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__AI:
            setAi( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__ATR:
            setAtr( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__EMAX:
            setEmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__EMIN:
            setEmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__IMAX:
            setImax( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__IMIN:
            setImin( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__TI:
            setTi( ( Float ) newValue );
            return;
        case CimPackage.EXC_HU__TR:
            setTr( ( Float ) newValue );
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
        case CimPackage.EXC_HU__AE:
            unsetAe();
            return;
        case CimPackage.EXC_HU__AI:
            unsetAi();
            return;
        case CimPackage.EXC_HU__ATR:
            unsetAtr();
            return;
        case CimPackage.EXC_HU__EMAX:
            unsetEmax();
            return;
        case CimPackage.EXC_HU__EMIN:
            unsetEmin();
            return;
        case CimPackage.EXC_HU__IMAX:
            unsetImax();
            return;
        case CimPackage.EXC_HU__IMIN:
            unsetImin();
            return;
        case CimPackage.EXC_HU__KE:
            unsetKe();
            return;
        case CimPackage.EXC_HU__KI:
            unsetKi();
            return;
        case CimPackage.EXC_HU__TE:
            unsetTe();
            return;
        case CimPackage.EXC_HU__TI:
            unsetTi();
            return;
        case CimPackage.EXC_HU__TR:
            unsetTr();
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
        case CimPackage.EXC_HU__AE:
            return isSetAe();
        case CimPackage.EXC_HU__AI:
            return isSetAi();
        case CimPackage.EXC_HU__ATR:
            return isSetAtr();
        case CimPackage.EXC_HU__EMAX:
            return isSetEmax();
        case CimPackage.EXC_HU__EMIN:
            return isSetEmin();
        case CimPackage.EXC_HU__IMAX:
            return isSetImax();
        case CimPackage.EXC_HU__IMIN:
            return isSetImin();
        case CimPackage.EXC_HU__KE:
            return isSetKe();
        case CimPackage.EXC_HU__KI:
            return isSetKi();
        case CimPackage.EXC_HU__TE:
            return isSetTe();
        case CimPackage.EXC_HU__TI:
            return isSetTi();
        case CimPackage.EXC_HU__TR:
            return isSetTr();
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
        result.append( " (ae: " );
        if( aeESet )
            result.append( ae );
        else
            result.append( "<unset>" );
        result.append( ", ai: " );
        if( aiESet )
            result.append( ai );
        else
            result.append( "<unset>" );
        result.append( ", atr: " );
        if( atrESet )
            result.append( atr );
        else
            result.append( "<unset>" );
        result.append( ", emax: " );
        if( emaxESet )
            result.append( emax );
        else
            result.append( "<unset>" );
        result.append( ", emin: " );
        if( eminESet )
            result.append( emin );
        else
            result.append( "<unset>" );
        result.append( ", imax: " );
        if( imaxESet )
            result.append( imax );
        else
            result.append( "<unset>" );
        result.append( ", imin: " );
        if( iminESet )
            result.append( imin );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", ti: " );
        if( tiESet )
            result.append( ti );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcHUImpl
