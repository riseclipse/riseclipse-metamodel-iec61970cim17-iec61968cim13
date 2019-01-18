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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotorKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineModelKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineTimeConstantReactance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getRotorType <em>Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getTpdo <em>Tpdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getTppdo <em>Tppdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getTppqo <em>Tppqo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getTpqo <em>Tpqo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SynchronousMachineTimeConstantReactanceImpl#getXQuadTrans <em>XQuad Trans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineTimeConstantReactanceImpl extends SynchronousMachineDetailedImpl
        implements SynchronousMachineTimeConstantReactance {
    /**
     * The default value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected static final Float KS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected Float ks = KS_EDEFAULT;

    /**
     * This is true if the Ks attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ksESet;

    /**
     * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelType()
     * @generated
     * @ordered
     */
    protected static final SynchronousMachineModelKind MODEL_TYPE_EDEFAULT = SynchronousMachineModelKind.SUBTRANSIENT;

    /**
     * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelType()
     * @generated
     * @ordered
     */
    protected SynchronousMachineModelKind modelType = MODEL_TYPE_EDEFAULT;

    /**
     * This is true if the Model Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelTypeESet;

    /**
     * The default value of the '{@link #getRotorType() <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotorType()
     * @generated
     * @ordered
     */
    protected static final RotorKind ROTOR_TYPE_EDEFAULT = RotorKind.ROUND_ROTOR;

    /**
     * The cached value of the '{@link #getRotorType() <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotorType()
     * @generated
     * @ordered
     */
    protected RotorKind rotorType = ROTOR_TYPE_EDEFAULT;

    /**
     * This is true if the Rotor Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rotorTypeESet;

    /**
     * The default value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected static final Float TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected Float tc = TC_EDEFAULT;

    /**
     * This is true if the Tc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcESet;

    /**
     * The default value of the '{@link #getTpdo() <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpdo()
     * @generated
     * @ordered
     */
    protected static final Float TPDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpdo() <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpdo()
     * @generated
     * @ordered
     */
    protected Float tpdo = TPDO_EDEFAULT;

    /**
     * This is true if the Tpdo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpdoESet;

    /**
     * The default value of the '{@link #getTppdo() <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppdo()
     * @generated
     * @ordered
     */
    protected static final Float TPPDO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTppdo() <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppdo()
     * @generated
     * @ordered
     */
    protected Float tppdo = TPPDO_EDEFAULT;

    /**
     * This is true if the Tppdo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tppdoESet;

    /**
     * The default value of the '{@link #getTppqo() <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppqo()
     * @generated
     * @ordered
     */
    protected static final Float TPPQO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTppqo() <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppqo()
     * @generated
     * @ordered
     */
    protected Float tppqo = TPPQO_EDEFAULT;

    /**
     * This is true if the Tppqo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tppqoESet;

    /**
     * The default value of the '{@link #getTpqo() <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpqo()
     * @generated
     * @ordered
     */
    protected static final Float TPQO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpqo() <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpqo()
     * @generated
     * @ordered
     */
    protected Float tpqo = TPQO_EDEFAULT;

    /**
     * This is true if the Tpqo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpqoESet;

    /**
     * The default value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectSubtrans()
     * @generated
     * @ordered
     */
    protected static final Float XDIRECT_SUBTRANS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXDirectSubtrans() <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectSubtrans()
     * @generated
     * @ordered
     */
    protected Float xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;

    /**
     * This is true if the XDirect Subtrans attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xDirectSubtransESet;

    /**
     * The default value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectSync()
     * @generated
     * @ordered
     */
    protected static final Float XDIRECT_SYNC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXDirectSync() <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectSync()
     * @generated
     * @ordered
     */
    protected Float xDirectSync = XDIRECT_SYNC_EDEFAULT;

    /**
     * This is true if the XDirect Sync attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xDirectSyncESet;

    /**
     * The default value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectTrans()
     * @generated
     * @ordered
     */
    protected static final Float XDIRECT_TRANS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXDirectTrans() <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXDirectTrans()
     * @generated
     * @ordered
     */
    protected Float xDirectTrans = XDIRECT_TRANS_EDEFAULT;

    /**
     * This is true if the XDirect Trans attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xDirectTransESet;

    /**
     * The default value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadSubtrans()
     * @generated
     * @ordered
     */
    protected static final Float XQUAD_SUBTRANS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXQuadSubtrans() <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadSubtrans()
     * @generated
     * @ordered
     */
    protected Float xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;

    /**
     * This is true if the XQuad Subtrans attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xQuadSubtransESet;

    /**
     * The default value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadSync()
     * @generated
     * @ordered
     */
    protected static final Float XQUAD_SYNC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXQuadSync() <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadSync()
     * @generated
     * @ordered
     */
    protected Float xQuadSync = XQUAD_SYNC_EDEFAULT;

    /**
     * This is true if the XQuad Sync attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xQuadSyncESet;

    /**
     * The default value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadTrans()
     * @generated
     * @ordered
     */
    protected static final Float XQUAD_TRANS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXQuadTrans() <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXQuadTrans()
     * @generated
     * @ordered
     */
    protected Float xQuadTrans = XQUAD_TRANS_EDEFAULT;

    /**
     * This is true if the XQuad Trans attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xQuadTransESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineTimeConstantReactanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachineTimeConstantReactance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKs() {
        return ks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs( Float newKs ) {
        Float oldKs = ks;
        ks = newKs;
        boolean oldKsESet = ksESet;
        ksESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS, oldKs, ks, !oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs() {
        Float oldKs = ks;
        boolean oldKsESet = ksESet;
        ks = KS_EDEFAULT;
        ksESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS, oldKs, KS_EDEFAULT, oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs() {
        return ksESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineModelKind getModelType() {
        return modelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelType( SynchronousMachineModelKind newModelType ) {
        SynchronousMachineModelKind oldModelType = modelType;
        modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
        boolean oldModelTypeESet = modelTypeESet;
        modelTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE, oldModelType, modelType,
                !oldModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelType() {
        SynchronousMachineModelKind oldModelType = modelType;
        boolean oldModelTypeESet = modelTypeESet;
        modelType = MODEL_TYPE_EDEFAULT;
        modelTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE, oldModelType, MODEL_TYPE_EDEFAULT,
                oldModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelType() {
        return modelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotorKind getRotorType() {
        return rotorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRotorType( RotorKind newRotorType ) {
        RotorKind oldRotorType = rotorType;
        rotorType = newRotorType == null ? ROTOR_TYPE_EDEFAULT : newRotorType;
        boolean oldRotorTypeESet = rotorTypeESet;
        rotorTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE, oldRotorType, rotorType,
                !oldRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotorType() {
        RotorKind oldRotorType = rotorType;
        boolean oldRotorTypeESet = rotorTypeESet;
        rotorType = ROTOR_TYPE_EDEFAULT;
        rotorTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE, oldRotorType, ROTOR_TYPE_EDEFAULT,
                oldRotorTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotorType() {
        return rotorTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTc() {
        return tc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc( Float newTc ) {
        Float oldTc = tc;
        tc = newTc;
        boolean oldTcESet = tcESet;
        tcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC, oldTc, tc, !oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc() {
        Float oldTc = tc;
        boolean oldTcESet = tcESet;
        tc = TC_EDEFAULT;
        tcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc() {
        return tcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpdo() {
        return tpdo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpdo( Float newTpdo ) {
        Float oldTpdo = tpdo;
        tpdo = newTpdo;
        boolean oldTpdoESet = tpdoESet;
        tpdoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO, oldTpdo, tpdo, !oldTpdoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpdo() {
        Float oldTpdo = tpdo;
        boolean oldTpdoESet = tpdoESet;
        tpdo = TPDO_EDEFAULT;
        tpdoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO, oldTpdo, TPDO_EDEFAULT, oldTpdoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpdo() {
        return tpdoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTppdo() {
        return tppdo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTppdo( Float newTppdo ) {
        Float oldTppdo = tppdo;
        tppdo = newTppdo;
        boolean oldTppdoESet = tppdoESet;
        tppdoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO, oldTppdo, tppdo, !oldTppdoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTppdo() {
        Float oldTppdo = tppdo;
        boolean oldTppdoESet = tppdoESet;
        tppdo = TPPDO_EDEFAULT;
        tppdoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO, oldTppdo, TPPDO_EDEFAULT,
                oldTppdoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTppdo() {
        return tppdoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTppqo() {
        return tppqo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTppqo( Float newTppqo ) {
        Float oldTppqo = tppqo;
        tppqo = newTppqo;
        boolean oldTppqoESet = tppqoESet;
        tppqoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO, oldTppqo, tppqo, !oldTppqoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTppqo() {
        Float oldTppqo = tppqo;
        boolean oldTppqoESet = tppqoESet;
        tppqo = TPPQO_EDEFAULT;
        tppqoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO, oldTppqo, TPPQO_EDEFAULT,
                oldTppqoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTppqo() {
        return tppqoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpqo() {
        return tpqo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpqo( Float newTpqo ) {
        Float oldTpqo = tpqo;
        tpqo = newTpqo;
        boolean oldTpqoESet = tpqoESet;
        tpqoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO, oldTpqo, tpqo, !oldTpqoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpqo() {
        Float oldTpqo = tpqo;
        boolean oldTpqoESet = tpqoESet;
        tpqo = TPQO_EDEFAULT;
        tpqoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO, oldTpqo, TPQO_EDEFAULT, oldTpqoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpqo() {
        return tpqoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXDirectSubtrans() {
        return xDirectSubtrans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXDirectSubtrans( Float newXDirectSubtrans ) {
        Float oldXDirectSubtrans = xDirectSubtrans;
        xDirectSubtrans = newXDirectSubtrans;
        boolean oldXDirectSubtransESet = xDirectSubtransESet;
        xDirectSubtransESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS, oldXDirectSubtrans,
                xDirectSubtrans, !oldXDirectSubtransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXDirectSubtrans() {
        Float oldXDirectSubtrans = xDirectSubtrans;
        boolean oldXDirectSubtransESet = xDirectSubtransESet;
        xDirectSubtrans = XDIRECT_SUBTRANS_EDEFAULT;
        xDirectSubtransESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS, oldXDirectSubtrans,
                XDIRECT_SUBTRANS_EDEFAULT, oldXDirectSubtransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXDirectSubtrans() {
        return xDirectSubtransESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXDirectSync() {
        return xDirectSync;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXDirectSync( Float newXDirectSync ) {
        Float oldXDirectSync = xDirectSync;
        xDirectSync = newXDirectSync;
        boolean oldXDirectSyncESet = xDirectSyncESet;
        xDirectSyncESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC, oldXDirectSync, xDirectSync,
                !oldXDirectSyncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXDirectSync() {
        Float oldXDirectSync = xDirectSync;
        boolean oldXDirectSyncESet = xDirectSyncESet;
        xDirectSync = XDIRECT_SYNC_EDEFAULT;
        xDirectSyncESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC, oldXDirectSync,
                XDIRECT_SYNC_EDEFAULT, oldXDirectSyncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXDirectSync() {
        return xDirectSyncESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXDirectTrans() {
        return xDirectTrans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXDirectTrans( Float newXDirectTrans ) {
        Float oldXDirectTrans = xDirectTrans;
        xDirectTrans = newXDirectTrans;
        boolean oldXDirectTransESet = xDirectTransESet;
        xDirectTransESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS, oldXDirectTrans, xDirectTrans,
                !oldXDirectTransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXDirectTrans() {
        Float oldXDirectTrans = xDirectTrans;
        boolean oldXDirectTransESet = xDirectTransESet;
        xDirectTrans = XDIRECT_TRANS_EDEFAULT;
        xDirectTransESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS, oldXDirectTrans,
                XDIRECT_TRANS_EDEFAULT, oldXDirectTransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXDirectTrans() {
        return xDirectTransESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXQuadSubtrans() {
        return xQuadSubtrans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXQuadSubtrans( Float newXQuadSubtrans ) {
        Float oldXQuadSubtrans = xQuadSubtrans;
        xQuadSubtrans = newXQuadSubtrans;
        boolean oldXQuadSubtransESet = xQuadSubtransESet;
        xQuadSubtransESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS, oldXQuadSubtrans, xQuadSubtrans,
                !oldXQuadSubtransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXQuadSubtrans() {
        Float oldXQuadSubtrans = xQuadSubtrans;
        boolean oldXQuadSubtransESet = xQuadSubtransESet;
        xQuadSubtrans = XQUAD_SUBTRANS_EDEFAULT;
        xQuadSubtransESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS, oldXQuadSubtrans,
                XQUAD_SUBTRANS_EDEFAULT, oldXQuadSubtransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXQuadSubtrans() {
        return xQuadSubtransESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXQuadSync() {
        return xQuadSync;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXQuadSync( Float newXQuadSync ) {
        Float oldXQuadSync = xQuadSync;
        xQuadSync = newXQuadSync;
        boolean oldXQuadSyncESet = xQuadSyncESet;
        xQuadSyncESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC, oldXQuadSync, xQuadSync,
                !oldXQuadSyncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXQuadSync() {
        Float oldXQuadSync = xQuadSync;
        boolean oldXQuadSyncESet = xQuadSyncESet;
        xQuadSync = XQUAD_SYNC_EDEFAULT;
        xQuadSyncESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC, oldXQuadSync, XQUAD_SYNC_EDEFAULT,
                oldXQuadSyncESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXQuadSync() {
        return xQuadSyncESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXQuadTrans() {
        return xQuadTrans;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXQuadTrans( Float newXQuadTrans ) {
        Float oldXQuadTrans = xQuadTrans;
        xQuadTrans = newXQuadTrans;
        boolean oldXQuadTransESet = xQuadTransESet;
        xQuadTransESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS, oldXQuadTrans, xQuadTrans,
                !oldXQuadTransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXQuadTrans() {
        Float oldXQuadTrans = xQuadTrans;
        boolean oldXQuadTransESet = xQuadTransESet;
        xQuadTrans = XQUAD_TRANS_EDEFAULT;
        xQuadTransESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS, oldXQuadTrans,
                XQUAD_TRANS_EDEFAULT, oldXQuadTransESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXQuadTrans() {
        return xQuadTransESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS:
            return getKs();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE:
            return getModelType();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE:
            return getRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC:
            return getTc();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO:
            return getTpdo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO:
            return getTppdo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO:
            return getTppqo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO:
            return getTpqo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS:
            return getXDirectSubtrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC:
            return getXDirectSync();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS:
            return getXDirectTrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS:
            return getXQuadSubtrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC:
            return getXQuadSync();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS:
            return getXQuadTrans();
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
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS:
            setKs( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE:
            setModelType( ( SynchronousMachineModelKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE:
            setRotorType( ( RotorKind ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO:
            setTpdo( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO:
            setTppdo( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO:
            setTppqo( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO:
            setTpqo( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS:
            setXDirectSubtrans( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC:
            setXDirectSync( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS:
            setXDirectTrans( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS:
            setXQuadSubtrans( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC:
            setXQuadSync( ( Float ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS:
            setXQuadTrans( ( Float ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS:
            unsetKs();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE:
            unsetModelType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE:
            unsetRotorType();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC:
            unsetTc();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO:
            unsetTpdo();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO:
            unsetTppdo();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO:
            unsetTppqo();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO:
            unsetTpqo();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS:
            unsetXDirectSubtrans();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC:
            unsetXDirectSync();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS:
            unsetXDirectTrans();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS:
            unsetXQuadSubtrans();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC:
            unsetXQuadSync();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS:
            unsetXQuadTrans();
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
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__KS:
            return isSetKs();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__MODEL_TYPE:
            return isSetModelType();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__ROTOR_TYPE:
            return isSetRotorType();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TC:
            return isSetTc();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPDO:
            return isSetTpdo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPDO:
            return isSetTppdo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPQO:
            return isSetTppqo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPQO:
            return isSetTpqo();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SUBTRANS:
            return isSetXDirectSubtrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_SYNC:
            return isSetXDirectSync();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XDIRECT_TRANS:
            return isSetXDirectTrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SUBTRANS:
            return isSetXQuadSubtrans();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_SYNC:
            return isSetXQuadSync();
        case CimPackage.SYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XQUAD_TRANS:
            return isSetXQuadTrans();
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
        result.append( " (ks: " );
        if( ksESet )
            result.append( ks );
        else
            result.append( "<unset>" );
        result.append( ", modelType: " );
        if( modelTypeESet )
            result.append( modelType );
        else
            result.append( "<unset>" );
        result.append( ", rotorType: " );
        if( rotorTypeESet )
            result.append( rotorType );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", tpdo: " );
        if( tpdoESet )
            result.append( tpdo );
        else
            result.append( "<unset>" );
        result.append( ", tppdo: " );
        if( tppdoESet )
            result.append( tppdo );
        else
            result.append( "<unset>" );
        result.append( ", tppqo: " );
        if( tppqoESet )
            result.append( tppqo );
        else
            result.append( "<unset>" );
        result.append( ", tpqo: " );
        if( tpqoESet )
            result.append( tpqo );
        else
            result.append( "<unset>" );
        result.append( ", xDirectSubtrans: " );
        if( xDirectSubtransESet )
            result.append( xDirectSubtrans );
        else
            result.append( "<unset>" );
        result.append( ", xDirectSync: " );
        if( xDirectSyncESet )
            result.append( xDirectSync );
        else
            result.append( "<unset>" );
        result.append( ", xDirectTrans: " );
        if( xDirectTransESet )
            result.append( xDirectTrans );
        else
            result.append( "<unset>" );
        result.append( ", xQuadSubtrans: " );
        if( xQuadSubtransESet )
            result.append( xQuadSubtrans );
        else
            result.append( "<unset>" );
        result.append( ", xQuadSync: " );
        if( xQuadSyncESet )
            result.append( xQuadSync );
        else
            result.append( "<unset>" );
        result.append( ", xQuadTrans: " );
        if( xQuadTransESet )
            result.append( xQuadTrans );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SynchronousMachineTimeConstantReactanceImpl
