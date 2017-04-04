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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovGAST3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov GAST3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getBca <em>Bca</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getDtc <em>Dtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getKac <em>Kac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getKca <em>Kca</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getKsi <em>Ksi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getKy <em>Ky</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getRcmn <em>Rcmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getRcmx <em>Rcmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTac <em>Tac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTfen <em>Tfen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTsi <em>Tsi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTtc <em>Ttc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovGAST3Impl#getTy <em>Ty</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovGAST3Impl extends TurbineGovernorDynamicsImpl implements GovGAST3 {
    /**
     * The default value of the '{@link #getBca() <em>Bca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBca()
     * @generated
     * @ordered
     */
    protected static final Float BCA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBca() <em>Bca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBca()
     * @generated
     * @ordered
     */
    protected Float bca = BCA_EDEFAULT;

    /**
     * This is true if the Bca attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bcaESet;

    /**
     * The default value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected static final Float BP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected Float bp = BP_EDEFAULT;

    /**
     * This is true if the Bp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bpESet;

    /**
     * The default value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected static final Float DTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected Float dtc = DTC_EDEFAULT;

    /**
     * This is true if the Dtc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtcESet;

    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Float KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Float ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getKac() <em>Kac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKac()
     * @generated
     * @ordered
     */
    protected static final Float KAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKac() <em>Kac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKac()
     * @generated
     * @ordered
     */
    protected Float kac = KAC_EDEFAULT;

    /**
     * This is true if the Kac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kacESet;

    /**
     * The default value of the '{@link #getKca() <em>Kca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKca()
     * @generated
     * @ordered
     */
    protected static final Float KCA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKca() <em>Kca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKca()
     * @generated
     * @ordered
     */
    protected Float kca = KCA_EDEFAULT;

    /**
     * This is true if the Kca attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcaESet;

    /**
     * The default value of the '{@link #getKsi() <em>Ksi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKsi()
     * @generated
     * @ordered
     */
    protected static final Float KSI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKsi() <em>Ksi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKsi()
     * @generated
     * @ordered
     */
    protected Float ksi = KSI_EDEFAULT;

    /**
     * This is true if the Ksi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ksiESet;

    /**
     * The default value of the '{@link #getKy() <em>Ky</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKy()
     * @generated
     * @ordered
     */
    protected static final Float KY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKy() <em>Ky</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKy()
     * @generated
     * @ordered
     */
    protected Float ky = KY_EDEFAULT;

    /**
     * This is true if the Ky attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kyESet;

    /**
     * The default value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected static final Float MNEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected Float mnef = MNEF_EDEFAULT;

    /**
     * This is true if the Mnef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mnefESet;

    /**
     * The default value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected static final Float MXEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected Float mxef = MXEF_EDEFAULT;

    /**
     * This is true if the Mxef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mxefESet;

    /**
     * The default value of the '{@link #getRcmn() <em>Rcmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcmn()
     * @generated
     * @ordered
     */
    protected static final Float RCMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRcmn() <em>Rcmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcmn()
     * @generated
     * @ordered
     */
    protected Float rcmn = RCMN_EDEFAULT;

    /**
     * This is true if the Rcmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcmnESet;

    /**
     * The default value of the '{@link #getRcmx() <em>Rcmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcmx()
     * @generated
     * @ordered
     */
    protected static final Float RCMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRcmx() <em>Rcmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRcmx()
     * @generated
     * @ordered
     */
    protected Float rcmx = RCMX_EDEFAULT;

    /**
     * This is true if the Rcmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcmxESet;

    /**
     * The default value of the '{@link #getTac() <em>Tac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTac()
     * @generated
     * @ordered
     */
    protected static final Float TAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTac() <em>Tac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTac()
     * @generated
     * @ordered
     */
    protected Float tac = TAC_EDEFAULT;

    /**
     * This is true if the Tac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tacESet;

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
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Float TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Float td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

    /**
     * The default value of the '{@link #getTfen() <em>Tfen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfen()
     * @generated
     * @ordered
     */
    protected static final Float TFEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfen() <em>Tfen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfen()
     * @generated
     * @ordered
     */
    protected Float tfen = TFEN_EDEFAULT;

    /**
     * This is true if the Tfen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfenESet;

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
     * The default value of the '{@link #getTsi() <em>Tsi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsi()
     * @generated
     * @ordered
     */
    protected static final Float TSI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsi() <em>Tsi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsi()
     * @generated
     * @ordered
     */
    protected Float tsi = TSI_EDEFAULT;

    /**
     * This is true if the Tsi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsiESet;

    /**
     * The default value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected static final Float TT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected Float tt = TT_EDEFAULT;

    /**
     * This is true if the Tt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ttESet;

    /**
     * The default value of the '{@link #getTtc() <em>Ttc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTtc()
     * @generated
     * @ordered
     */
    protected static final Float TTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTtc() <em>Ttc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTtc()
     * @generated
     * @ordered
     */
    protected Float ttc = TTC_EDEFAULT;

    /**
     * This is true if the Ttc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ttcESet;

    /**
     * The default value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected static final Float TY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected Float ty = TY_EDEFAULT;

    /**
     * This is true if the Ty attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovGAST3Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovGAST3();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBca() {
        return bca;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBca( Float newBca ) {
        Float oldBca = bca;
        bca = newBca;
        boolean oldBcaESet = bcaESet;
        bcaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__BCA, oldBca, bca, !oldBcaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBca() {
        Float oldBca = bca;
        boolean oldBcaESet = bcaESet;
        bca = BCA_EDEFAULT;
        bcaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__BCA, oldBca, BCA_EDEFAULT, oldBcaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBca() {
        return bcaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBp() {
        return bp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBp( Float newBp ) {
        Float oldBp = bp;
        bp = newBp;
        boolean oldBpESet = bpESet;
        bpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__BP, oldBp, bp, !oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBp() {
        Float oldBp = bp;
        boolean oldBpESet = bpESet;
        bp = BP_EDEFAULT;
        bpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__BP, oldBp, BP_EDEFAULT, oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBp() {
        return bpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDtc() {
        return dtc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtc( Float newDtc ) {
        Float oldDtc = dtc;
        dtc = newDtc;
        boolean oldDtcESet = dtcESet;
        dtcESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__DTC, oldDtc, dtc, !oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtc() {
        Float oldDtc = dtc;
        boolean oldDtcESet = dtcESet;
        dtc = DTC_EDEFAULT;
        dtcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__DTC, oldDtc, DTC_EDEFAULT, oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtc() {
        return dtcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Float newKa ) {
        Float oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__KA, oldKa, ka, !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Float oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKac() {
        return kac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKac( Float newKac ) {
        Float oldKac = kac;
        kac = newKac;
        boolean oldKacESet = kacESet;
        kacESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__KAC, oldKac, kac, !oldKacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKac() {
        Float oldKac = kac;
        boolean oldKacESet = kacESet;
        kac = KAC_EDEFAULT;
        kacESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__KAC, oldKac, KAC_EDEFAULT, oldKacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKac() {
        return kacESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKca() {
        return kca;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKca( Float newKca ) {
        Float oldKca = kca;
        kca = newKca;
        boolean oldKcaESet = kcaESet;
        kcaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__KCA, oldKca, kca, !oldKcaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKca() {
        Float oldKca = kca;
        boolean oldKcaESet = kcaESet;
        kca = KCA_EDEFAULT;
        kcaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__KCA, oldKca, KCA_EDEFAULT, oldKcaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKca() {
        return kcaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKsi() {
        return ksi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKsi( Float newKsi ) {
        Float oldKsi = ksi;
        ksi = newKsi;
        boolean oldKsiESet = ksiESet;
        ksiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__KSI, oldKsi, ksi, !oldKsiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKsi() {
        Float oldKsi = ksi;
        boolean oldKsiESet = ksiESet;
        ksi = KSI_EDEFAULT;
        ksiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__KSI, oldKsi, KSI_EDEFAULT, oldKsiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKsi() {
        return ksiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKy() {
        return ky;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKy( Float newKy ) {
        Float oldKy = ky;
        ky = newKy;
        boolean oldKyESet = kyESet;
        kyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__KY, oldKy, ky, !oldKyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKy() {
        Float oldKy = ky;
        boolean oldKyESet = kyESet;
        ky = KY_EDEFAULT;
        kyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__KY, oldKy, KY_EDEFAULT, oldKyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKy() {
        return kyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMnef() {
        return mnef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMnef( Float newMnef ) {
        Float oldMnef = mnef;
        mnef = newMnef;
        boolean oldMnefESet = mnefESet;
        mnefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST3__MNEF, oldMnef, mnef, !oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMnef() {
        Float oldMnef = mnef;
        boolean oldMnefESet = mnefESet;
        mnef = MNEF_EDEFAULT;
        mnefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__MNEF, oldMnef, MNEF_EDEFAULT, oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMnef() {
        return mnefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMxef() {
        return mxef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMxef( Float newMxef ) {
        Float oldMxef = mxef;
        mxef = newMxef;
        boolean oldMxefESet = mxefESet;
        mxefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST3__MXEF, oldMxef, mxef, !oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMxef() {
        Float oldMxef = mxef;
        boolean oldMxefESet = mxefESet;
        mxef = MXEF_EDEFAULT;
        mxefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__MXEF, oldMxef, MXEF_EDEFAULT, oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMxef() {
        return mxefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRcmn() {
        return rcmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRcmn( Float newRcmn ) {
        Float oldRcmn = rcmn;
        rcmn = newRcmn;
        boolean oldRcmnESet = rcmnESet;
        rcmnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST3__RCMN, oldRcmn, rcmn, !oldRcmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRcmn() {
        Float oldRcmn = rcmn;
        boolean oldRcmnESet = rcmnESet;
        rcmn = RCMN_EDEFAULT;
        rcmnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__RCMN, oldRcmn, RCMN_EDEFAULT, oldRcmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRcmn() {
        return rcmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRcmx() {
        return rcmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRcmx( Float newRcmx ) {
        Float oldRcmx = rcmx;
        rcmx = newRcmx;
        boolean oldRcmxESet = rcmxESet;
        rcmxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST3__RCMX, oldRcmx, rcmx, !oldRcmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRcmx() {
        Float oldRcmx = rcmx;
        boolean oldRcmxESet = rcmxESet;
        rcmx = RCMX_EDEFAULT;
        rcmxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__RCMX, oldRcmx, RCMX_EDEFAULT, oldRcmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRcmx() {
        return rcmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTac() {
        return tac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTac( Float newTac ) {
        Float oldTac = tac;
        tac = newTac;
        boolean oldTacESet = tacESet;
        tacESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TAC, oldTac, tac, !oldTacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTac() {
        Float oldTac = tac;
        boolean oldTacESet = tacESet;
        tac = TAC_EDEFAULT;
        tacESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TAC, oldTac, TAC_EDEFAULT, oldTacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTac() {
        return tacESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TC, oldTc, tc, !oldTcESet ) );
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
                CimPackage.GOV_GAST3__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
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
    public Float getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Float newTd ) {
        Float oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TD, oldTd, td, !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Float oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TD, oldTd, TD_EDEFAULT, oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTfen() {
        return tfen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfen( Float newTfen ) {
        Float oldTfen = tfen;
        tfen = newTfen;
        boolean oldTfenESet = tfenESet;
        tfenESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_GAST3__TFEN, oldTfen, tfen, !oldTfenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfen() {
        Float oldTfen = tfen;
        boolean oldTfenESet = tfenESet;
        tfen = TFEN_EDEFAULT;
        tfenESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TFEN, oldTfen, TFEN_EDEFAULT, oldTfenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfen() {
        return tfenESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TG, oldTg, tg, !oldTgESet ) );
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
                CimPackage.GOV_GAST3__TG, oldTg, TG_EDEFAULT, oldTgESet ) );
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
    public Float getTsi() {
        return tsi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsi( Float newTsi ) {
        Float oldTsi = tsi;
        tsi = newTsi;
        boolean oldTsiESet = tsiESet;
        tsiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TSI, oldTsi, tsi, !oldTsiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsi() {
        Float oldTsi = tsi;
        boolean oldTsiESet = tsiESet;
        tsi = TSI_EDEFAULT;
        tsiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TSI, oldTsi, TSI_EDEFAULT, oldTsiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsi() {
        return tsiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTt() {
        return tt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTt( Float newTt ) {
        Float oldTt = tt;
        tt = newTt;
        boolean oldTtESet = ttESet;
        ttESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TT, oldTt, tt, !oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTt() {
        Float oldTt = tt;
        boolean oldTtESet = ttESet;
        tt = TT_EDEFAULT;
        ttESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TT, oldTt, TT_EDEFAULT, oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTt() {
        return ttESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTtc() {
        return ttc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTtc( Float newTtc ) {
        Float oldTtc = ttc;
        ttc = newTtc;
        boolean oldTtcESet = ttcESet;
        ttcESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TTC, oldTtc, ttc, !oldTtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTtc() {
        Float oldTtc = ttc;
        boolean oldTtcESet = ttcESet;
        ttc = TTC_EDEFAULT;
        ttcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TTC, oldTtc, TTC_EDEFAULT, oldTtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTtc() {
        return ttcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTy() {
        return ty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTy( Float newTy ) {
        Float oldTy = ty;
        ty = newTy;
        boolean oldTyESet = tyESet;
        tyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST3__TY, oldTy, ty, !oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTy() {
        Float oldTy = ty;
        boolean oldTyESet = tyESet;
        ty = TY_EDEFAULT;
        tyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_GAST3__TY, oldTy, TY_EDEFAULT, oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTy() {
        return tyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_GAST3__BCA:
            return getBca();
        case CimPackage.GOV_GAST3__BP:
            return getBp();
        case CimPackage.GOV_GAST3__DTC:
            return getDtc();
        case CimPackage.GOV_GAST3__KA:
            return getKa();
        case CimPackage.GOV_GAST3__KAC:
            return getKac();
        case CimPackage.GOV_GAST3__KCA:
            return getKca();
        case CimPackage.GOV_GAST3__KSI:
            return getKsi();
        case CimPackage.GOV_GAST3__KY:
            return getKy();
        case CimPackage.GOV_GAST3__MNEF:
            return getMnef();
        case CimPackage.GOV_GAST3__MXEF:
            return getMxef();
        case CimPackage.GOV_GAST3__RCMN:
            return getRcmn();
        case CimPackage.GOV_GAST3__RCMX:
            return getRcmx();
        case CimPackage.GOV_GAST3__TAC:
            return getTac();
        case CimPackage.GOV_GAST3__TC:
            return getTc();
        case CimPackage.GOV_GAST3__TD:
            return getTd();
        case CimPackage.GOV_GAST3__TFEN:
            return getTfen();
        case CimPackage.GOV_GAST3__TG:
            return getTg();
        case CimPackage.GOV_GAST3__TSI:
            return getTsi();
        case CimPackage.GOV_GAST3__TT:
            return getTt();
        case CimPackage.GOV_GAST3__TTC:
            return getTtc();
        case CimPackage.GOV_GAST3__TY:
            return getTy();
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
        case CimPackage.GOV_GAST3__BCA:
            setBca( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__BP:
            setBp( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__DTC:
            setDtc( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__KAC:
            setKac( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__KCA:
            setKca( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__KSI:
            setKsi( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__KY:
            setKy( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__MNEF:
            setMnef( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__MXEF:
            setMxef( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__RCMN:
            setRcmn( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__RCMX:
            setRcmx( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TAC:
            setTac( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TD:
            setTd( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TFEN:
            setTfen( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TSI:
            setTsi( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TT:
            setTt( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TTC:
            setTtc( ( Float ) newValue );
            return;
        case CimPackage.GOV_GAST3__TY:
            setTy( ( Float ) newValue );
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
        case CimPackage.GOV_GAST3__BCA:
            unsetBca();
            return;
        case CimPackage.GOV_GAST3__BP:
            unsetBp();
            return;
        case CimPackage.GOV_GAST3__DTC:
            unsetDtc();
            return;
        case CimPackage.GOV_GAST3__KA:
            unsetKa();
            return;
        case CimPackage.GOV_GAST3__KAC:
            unsetKac();
            return;
        case CimPackage.GOV_GAST3__KCA:
            unsetKca();
            return;
        case CimPackage.GOV_GAST3__KSI:
            unsetKsi();
            return;
        case CimPackage.GOV_GAST3__KY:
            unsetKy();
            return;
        case CimPackage.GOV_GAST3__MNEF:
            unsetMnef();
            return;
        case CimPackage.GOV_GAST3__MXEF:
            unsetMxef();
            return;
        case CimPackage.GOV_GAST3__RCMN:
            unsetRcmn();
            return;
        case CimPackage.GOV_GAST3__RCMX:
            unsetRcmx();
            return;
        case CimPackage.GOV_GAST3__TAC:
            unsetTac();
            return;
        case CimPackage.GOV_GAST3__TC:
            unsetTc();
            return;
        case CimPackage.GOV_GAST3__TD:
            unsetTd();
            return;
        case CimPackage.GOV_GAST3__TFEN:
            unsetTfen();
            return;
        case CimPackage.GOV_GAST3__TG:
            unsetTg();
            return;
        case CimPackage.GOV_GAST3__TSI:
            unsetTsi();
            return;
        case CimPackage.GOV_GAST3__TT:
            unsetTt();
            return;
        case CimPackage.GOV_GAST3__TTC:
            unsetTtc();
            return;
        case CimPackage.GOV_GAST3__TY:
            unsetTy();
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
        case CimPackage.GOV_GAST3__BCA:
            return isSetBca();
        case CimPackage.GOV_GAST3__BP:
            return isSetBp();
        case CimPackage.GOV_GAST3__DTC:
            return isSetDtc();
        case CimPackage.GOV_GAST3__KA:
            return isSetKa();
        case CimPackage.GOV_GAST3__KAC:
            return isSetKac();
        case CimPackage.GOV_GAST3__KCA:
            return isSetKca();
        case CimPackage.GOV_GAST3__KSI:
            return isSetKsi();
        case CimPackage.GOV_GAST3__KY:
            return isSetKy();
        case CimPackage.GOV_GAST3__MNEF:
            return isSetMnef();
        case CimPackage.GOV_GAST3__MXEF:
            return isSetMxef();
        case CimPackage.GOV_GAST3__RCMN:
            return isSetRcmn();
        case CimPackage.GOV_GAST3__RCMX:
            return isSetRcmx();
        case CimPackage.GOV_GAST3__TAC:
            return isSetTac();
        case CimPackage.GOV_GAST3__TC:
            return isSetTc();
        case CimPackage.GOV_GAST3__TD:
            return isSetTd();
        case CimPackage.GOV_GAST3__TFEN:
            return isSetTfen();
        case CimPackage.GOV_GAST3__TG:
            return isSetTg();
        case CimPackage.GOV_GAST3__TSI:
            return isSetTsi();
        case CimPackage.GOV_GAST3__TT:
            return isSetTt();
        case CimPackage.GOV_GAST3__TTC:
            return isSetTtc();
        case CimPackage.GOV_GAST3__TY:
            return isSetTy();
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
        result.append( " (bca: " );
        if( bcaESet )
            result.append( bca );
        else
            result.append( "<unset>" );
        result.append( ", bp: " );
        if( bpESet )
            result.append( bp );
        else
            result.append( "<unset>" );
        result.append( ", dtc: " );
        if( dtcESet )
            result.append( dtc );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kac: " );
        if( kacESet )
            result.append( kac );
        else
            result.append( "<unset>" );
        result.append( ", kca: " );
        if( kcaESet )
            result.append( kca );
        else
            result.append( "<unset>" );
        result.append( ", ksi: " );
        if( ksiESet )
            result.append( ksi );
        else
            result.append( "<unset>" );
        result.append( ", ky: " );
        if( kyESet )
            result.append( ky );
        else
            result.append( "<unset>" );
        result.append( ", mnef: " );
        if( mnefESet )
            result.append( mnef );
        else
            result.append( "<unset>" );
        result.append( ", mxef: " );
        if( mxefESet )
            result.append( mxef );
        else
            result.append( "<unset>" );
        result.append( ", rcmn: " );
        if( rcmnESet )
            result.append( rcmn );
        else
            result.append( "<unset>" );
        result.append( ", rcmx: " );
        if( rcmxESet )
            result.append( rcmx );
        else
            result.append( "<unset>" );
        result.append( ", tac: " );
        if( tacESet )
            result.append( tac );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tfen: " );
        if( tfenESet )
            result.append( tfen );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", tsi: " );
        if( tsiESet )
            result.append( tsi );
        else
            result.append( "<unset>" );
        result.append( ", tt: " );
        if( ttESet )
            result.append( tt );
        else
            result.append( "<unset>" );
        result.append( ", ttc: " );
        if( ttcESet )
            result.append( ttc );
        else
            result.append( "<unset>" );
        result.append( ", ty: " );
        if( tyESet )
            result.append( ty );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovGAST3Impl
