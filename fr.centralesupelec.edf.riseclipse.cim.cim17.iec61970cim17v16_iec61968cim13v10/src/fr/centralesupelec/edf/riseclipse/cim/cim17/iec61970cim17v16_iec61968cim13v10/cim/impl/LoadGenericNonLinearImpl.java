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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericNonLinearLoadModelKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadGenericNonLinear;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Generic Non Linear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getBt <em>Bt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getLt <em>Lt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getPt <em>Pt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getQt <em>Qt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadGenericNonLinearImpl#getTq <em>Tq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGenericNonLinearImpl extends LoadDynamicsImpl implements LoadGenericNonLinear {
    /**
     * The default value of the '{@link #getBs() <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBs()
     * @generated
     * @ordered
     */
    protected static final Float BS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBs() <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBs()
     * @generated
     * @ordered
     */
    protected Float bs = BS_EDEFAULT;

    /**
     * This is true if the Bs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bsESet;

    /**
     * The default value of the '{@link #getBt() <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBt()
     * @generated
     * @ordered
     */
    protected static final Float BT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBt() <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBt()
     * @generated
     * @ordered
     */
    protected Float bt = BT_EDEFAULT;

    /**
     * This is true if the Bt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean btESet;

    /**
     * The default value of the '{@link #getGenericNonLinearLoadModelType() <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     * @ordered
     */
    protected static final GenericNonLinearLoadModelKind GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT = GenericNonLinearLoadModelKind.EXPONENTIAL_RECOVERY;

    /**
     * The cached value of the '{@link #getGenericNonLinearLoadModelType() <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     * @ordered
     */
    protected GenericNonLinearLoadModelKind genericNonLinearLoadModelType = GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT;

    /**
     * This is true if the Generic Non Linear Load Model Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genericNonLinearLoadModelTypeESet;

    /**
     * The default value of the '{@link #getLs() <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLs()
     * @generated
     * @ordered
     */
    protected static final Float LS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLs() <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLs()
     * @generated
     * @ordered
     */
    protected Float ls = LS_EDEFAULT;

    /**
     * This is true if the Ls attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lsESet;

    /**
     * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLt()
     * @generated
     * @ordered
     */
    protected static final Float LT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLt()
     * @generated
     * @ordered
     */
    protected Float lt = LT_EDEFAULT;

    /**
     * This is true if the Lt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ltESet;

    /**
     * The default value of the '{@link #getPt() <em>Pt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPt()
     * @generated
     * @ordered
     */
    protected static final Float PT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPt() <em>Pt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPt()
     * @generated
     * @ordered
     */
    protected Float pt = PT_EDEFAULT;

    /**
     * This is true if the Pt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ptESet;

    /**
     * The default value of the '{@link #getQt() <em>Qt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQt()
     * @generated
     * @ordered
     */
    protected static final Float QT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQt() <em>Qt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQt()
     * @generated
     * @ordered
     */
    protected Float qt = QT_EDEFAULT;

    /**
     * This is true if the Qt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qtESet;

    /**
     * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected static final Float TP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected Float tp = TP_EDEFAULT;

    /**
     * This is true if the Tp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpESet;

    /**
     * The default value of the '{@link #getTq() <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTq()
     * @generated
     * @ordered
     */
    protected static final Float TQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTq() <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTq()
     * @generated
     * @ordered
     */
    protected Float tq = TQ_EDEFAULT;

    /**
     * This is true if the Tq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tqESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadGenericNonLinearImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadGenericNonLinear();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBs() {
        return bs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBs( Float newBs ) {
        Float oldBs = bs;
        bs = newBs;
        boolean oldBsESet = bsESet;
        bsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__BS, oldBs, bs, !oldBsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBs() {
        Float oldBs = bs;
        boolean oldBsESet = bsESet;
        bs = BS_EDEFAULT;
        bsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__BS, oldBs, BS_EDEFAULT, oldBsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBs() {
        return bsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBt() {
        return bt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBt( Float newBt ) {
        Float oldBt = bt;
        bt = newBt;
        boolean oldBtESet = btESet;
        btESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__BT, oldBt, bt, !oldBtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBt() {
        Float oldBt = bt;
        boolean oldBtESet = btESet;
        bt = BT_EDEFAULT;
        btESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__BT, oldBt, BT_EDEFAULT, oldBtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBt() {
        return btESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericNonLinearLoadModelKind getGenericNonLinearLoadModelType() {
        return genericNonLinearLoadModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenericNonLinearLoadModelType( GenericNonLinearLoadModelKind newGenericNonLinearLoadModelType ) {
        GenericNonLinearLoadModelKind oldGenericNonLinearLoadModelType = genericNonLinearLoadModelType;
        genericNonLinearLoadModelType = newGenericNonLinearLoadModelType == null
                ? GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT : newGenericNonLinearLoadModelType;
        boolean oldGenericNonLinearLoadModelTypeESet = genericNonLinearLoadModelTypeESet;
        genericNonLinearLoadModelTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE,
                oldGenericNonLinearLoadModelType, genericNonLinearLoadModelType,
                !oldGenericNonLinearLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenericNonLinearLoadModelType() {
        GenericNonLinearLoadModelKind oldGenericNonLinearLoadModelType = genericNonLinearLoadModelType;
        boolean oldGenericNonLinearLoadModelTypeESet = genericNonLinearLoadModelTypeESet;
        genericNonLinearLoadModelType = GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT;
        genericNonLinearLoadModelTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE,
                oldGenericNonLinearLoadModelType, GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT,
                oldGenericNonLinearLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenericNonLinearLoadModelType() {
        return genericNonLinearLoadModelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLs() {
        return ls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLs( Float newLs ) {
        Float oldLs = ls;
        ls = newLs;
        boolean oldLsESet = lsESet;
        lsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__LS, oldLs, ls, !oldLsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLs() {
        Float oldLs = ls;
        boolean oldLsESet = lsESet;
        ls = LS_EDEFAULT;
        lsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__LS, oldLs, LS_EDEFAULT, oldLsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLs() {
        return lsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLt() {
        return lt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLt( Float newLt ) {
        Float oldLt = lt;
        lt = newLt;
        boolean oldLtESet = ltESet;
        ltESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__LT, oldLt, lt, !oldLtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLt() {
        Float oldLt = lt;
        boolean oldLtESet = ltESet;
        lt = LT_EDEFAULT;
        ltESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__LT, oldLt, LT_EDEFAULT, oldLtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLt() {
        return ltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPt() {
        return pt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPt( Float newPt ) {
        Float oldPt = pt;
        pt = newPt;
        boolean oldPtESet = ptESet;
        ptESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__PT, oldPt, pt, !oldPtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPt() {
        Float oldPt = pt;
        boolean oldPtESet = ptESet;
        pt = PT_EDEFAULT;
        ptESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__PT, oldPt, PT_EDEFAULT, oldPtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPt() {
        return ptESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQt() {
        return qt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQt( Float newQt ) {
        Float oldQt = qt;
        qt = newQt;
        boolean oldQtESet = qtESet;
        qtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__QT, oldQt, qt, !oldQtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQt() {
        Float oldQt = qt;
        boolean oldQtESet = qtESet;
        qt = QT_EDEFAULT;
        qtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__QT, oldQt, QT_EDEFAULT, oldQtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQt() {
        return qtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTp() {
        return tp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTp( Float newTp ) {
        Float oldTp = tp;
        tp = newTp;
        boolean oldTpESet = tpESet;
        tpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__TP, oldTp, tp, !oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTp() {
        Float oldTp = tp;
        boolean oldTpESet = tpESet;
        tp = TP_EDEFAULT;
        tpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__TP, oldTp, TP_EDEFAULT, oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTp() {
        return tpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTq() {
        return tq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTq( Float newTq ) {
        Float oldTq = tq;
        tq = newTq;
        boolean oldTqESet = tqESet;
        tqESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__TQ, oldTq, tq, !oldTqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTq() {
        Float oldTq = tq;
        boolean oldTqESet = tqESet;
        tq = TQ_EDEFAULT;
        tqESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_GENERIC_NON_LINEAR__TQ, oldTq, TQ_EDEFAULT, oldTqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTq() {
        return tqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            return getBs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            return getBt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            return getGenericNonLinearLoadModelType();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            return getLs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            return getLt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__PT:
            return getPt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__QT:
            return getQt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            return getTp();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            return getTq();
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            setBs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            setBt( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            setGenericNonLinearLoadModelType( ( GenericNonLinearLoadModelKind ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            setLs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            setLt( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__PT:
            setPt( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__QT:
            setQt( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            setTq( ( Float ) newValue );
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            unsetBs();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            unsetBt();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            unsetGenericNonLinearLoadModelType();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            unsetLs();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            unsetLt();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__PT:
            unsetPt();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__QT:
            unsetQt();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            unsetTp();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            unsetTq();
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            return isSetBs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            return isSetBt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            return isSetGenericNonLinearLoadModelType();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            return isSetLs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            return isSetLt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__PT:
            return isSetPt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__QT:
            return isSetQt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            return isSetTp();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            return isSetTq();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (bs: " );
        if( bsESet )
            result.append( bs );
        else
            result.append( "<unset>" );
        result.append( ", bt: " );
        if( btESet )
            result.append( bt );
        else
            result.append( "<unset>" );
        result.append( ", genericNonLinearLoadModelType: " );
        if( genericNonLinearLoadModelTypeESet )
            result.append( genericNonLinearLoadModelType );
        else
            result.append( "<unset>" );
        result.append( ", ls: " );
        if( lsESet )
            result.append( ls );
        else
            result.append( "<unset>" );
        result.append( ", lt: " );
        if( ltESet )
            result.append( lt );
        else
            result.append( "<unset>" );
        result.append( ", pt: " );
        if( ptESet )
            result.append( pt );
        else
            result.append( "<unset>" );
        result.append( ", qt: " );
        if( qtESet )
            result.append( qt );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tq: " );
        if( tqESet )
            result.append( tq );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadGenericNonLinearImpl
