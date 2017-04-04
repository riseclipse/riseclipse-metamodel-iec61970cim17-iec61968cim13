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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GovHydroPID2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro PID2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getAtw <em>Atw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getFeedbackSignal <em>Feedback Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getG1 <em>G1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getG2 <em>G2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getP2 <em>P2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getP3 <em>P3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getRperm <em>Rperm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getTreg <em>Treg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getVelmax <em>Velmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GovHydroPID2Impl#getVelmin <em>Velmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydroPID2Impl extends TurbineGovernorDynamicsImpl implements GovHydroPID2 {
    /**
     * The default value of the '{@link #getAtw() <em>Atw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtw()
     * @generated
     * @ordered
     */
    protected static final Float ATW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAtw() <em>Atw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtw()
     * @generated
     * @ordered
     */
    protected Float atw = ATW_EDEFAULT;

    /**
     * This is true if the Atw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean atwESet;

    /**
     * The default value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected static final Float D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected Float d = D_EDEFAULT;

    /**
     * This is true if the D attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dESet;

    /**
     * The default value of the '{@link #getFeedbackSignal() <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackSignal()
     * @generated
     * @ordered
     */
    protected static final Boolean FEEDBACK_SIGNAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFeedbackSignal() <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeedbackSignal()
     * @generated
     * @ordered
     */
    protected Boolean feedbackSignal = FEEDBACK_SIGNAL_EDEFAULT;

    /**
     * This is true if the Feedback Signal attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean feedbackSignalESet;

    /**
     * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected static final Float G0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected Float g0 = G0_EDEFAULT;

    /**
     * This is true if the G0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0ESet;

    /**
     * The default value of the '{@link #getG1() <em>G1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG1()
     * @generated
     * @ordered
     */
    protected static final Float G1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG1() <em>G1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG1()
     * @generated
     * @ordered
     */
    protected Float g1 = G1_EDEFAULT;

    /**
     * This is true if the G1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g1ESet;

    /**
     * The default value of the '{@link #getG2() <em>G2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG2()
     * @generated
     * @ordered
     */
    protected static final Float G2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG2() <em>G2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG2()
     * @generated
     * @ordered
     */
    protected Float g2 = G2_EDEFAULT;

    /**
     * This is true if the G2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g2ESet;

    /**
     * The default value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected static final Float GMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected Float gmax = GMAX_EDEFAULT;

    /**
     * This is true if the Gmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gmaxESet;

    /**
     * The default value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected static final Float GMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected Float gmin = GMIN_EDEFAULT;

    /**
     * This is true if the Gmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gminESet;

    /**
     * The default value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected static final Float KD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected Float kd = KD_EDEFAULT;

    /**
     * This is true if the Kd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdESet;

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
     * The default value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected static final Float P1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected Float p1 = P1_EDEFAULT;

    /**
     * This is true if the P1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p1ESet;

    /**
     * The default value of the '{@link #getP2() <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP2()
     * @generated
     * @ordered
     */
    protected static final Float P2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP2() <em>P2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP2()
     * @generated
     * @ordered
     */
    protected Float p2 = P2_EDEFAULT;

    /**
     * This is true if the P2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p2ESet;

    /**
     * The default value of the '{@link #getP3() <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP3()
     * @generated
     * @ordered
     */
    protected static final Float P3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP3() <em>P3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP3()
     * @generated
     * @ordered
     */
    protected Float p3 = P3_EDEFAULT;

    /**
     * This is true if the P3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p3ESet;

    /**
     * The default value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected static final Float RPERM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected Float rperm = RPERM_EDEFAULT;

    /**
     * This is true if the Rperm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rpermESet;

    /**
     * The default value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected static final Float TA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected Float ta = TA_EDEFAULT;

    /**
     * This is true if the Ta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Float TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Float tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getTreg() <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTreg()
     * @generated
     * @ordered
     */
    protected static final Float TREG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTreg() <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTreg()
     * @generated
     * @ordered
     */
    protected Float treg = TREG_EDEFAULT;

    /**
     * This is true if the Treg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tregESet;

    /**
     * The default value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected static final Float TW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected Float tw = TW_EDEFAULT;

    /**
     * This is true if the Tw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twESet;

    /**
     * The default value of the '{@link #getVelmax() <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmax()
     * @generated
     * @ordered
     */
    protected static final Float VELMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelmax() <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmax()
     * @generated
     * @ordered
     */
    protected Float velmax = VELMAX_EDEFAULT;

    /**
     * This is true if the Velmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velmaxESet;

    /**
     * The default value of the '{@link #getVelmin() <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmin()
     * @generated
     * @ordered
     */
    protected static final Float VELMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelmin() <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmin()
     * @generated
     * @ordered
     */
    protected Float velmin = VELMIN_EDEFAULT;

    /**
     * This is true if the Velmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydroPID2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydroPID2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAtw() {
        return atw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAtw( Float newAtw ) {
        Float oldAtw = atw;
        atw = newAtw;
        boolean oldAtwESet = atwESet;
        atwESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__ATW, oldAtw, atw, !oldAtwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAtw() {
        Float oldAtw = atw;
        boolean oldAtwESet = atwESet;
        atw = ATW_EDEFAULT;
        atwESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__ATW, oldAtw, ATW_EDEFAULT, oldAtwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAtw() {
        return atwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getD() {
        return d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setD( Float newD ) {
        Float oldD = d;
        d = newD;
        boolean oldDESet = dESet;
        dESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__D, oldD, d, !oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetD() {
        Float oldD = d;
        boolean oldDESet = dESet;
        d = D_EDEFAULT;
        dESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__D, oldD, D_EDEFAULT, oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetD() {
        return dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getFeedbackSignal() {
        return feedbackSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFeedbackSignal( Boolean newFeedbackSignal ) {
        Boolean oldFeedbackSignal = feedbackSignal;
        feedbackSignal = newFeedbackSignal;
        boolean oldFeedbackSignalESet = feedbackSignalESet;
        feedbackSignalESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL,
                    oldFeedbackSignal, feedbackSignal, !oldFeedbackSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFeedbackSignal() {
        Boolean oldFeedbackSignal = feedbackSignal;
        boolean oldFeedbackSignalESet = feedbackSignalESet;
        feedbackSignal = FEEDBACK_SIGNAL_EDEFAULT;
        feedbackSignalESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL,
                    oldFeedbackSignal, FEEDBACK_SIGNAL_EDEFAULT, oldFeedbackSignalESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFeedbackSignal() {
        return feedbackSignalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG0() {
        return g0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0( Float newG0 ) {
        Float oldG0 = g0;
        g0 = newG0;
        boolean oldG0ESet = g0ESet;
        g0ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__G0, oldG0, g0, !oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0() {
        Float oldG0 = g0;
        boolean oldG0ESet = g0ESet;
        g0 = G0_EDEFAULT;
        g0ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__G0, oldG0, G0_EDEFAULT, oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0() {
        return g0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG1() {
        return g1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG1( Float newG1 ) {
        Float oldG1 = g1;
        g1 = newG1;
        boolean oldG1ESet = g1ESet;
        g1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__G1, oldG1, g1, !oldG1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG1() {
        Float oldG1 = g1;
        boolean oldG1ESet = g1ESet;
        g1 = G1_EDEFAULT;
        g1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__G1, oldG1, G1_EDEFAULT, oldG1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG1() {
        return g1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getG2() {
        return g2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG2( Float newG2 ) {
        Float oldG2 = g2;
        g2 = newG2;
        boolean oldG2ESet = g2ESet;
        g2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__G2, oldG2, g2, !oldG2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG2() {
        Float oldG2 = g2;
        boolean oldG2ESet = g2ESet;
        g2 = G2_EDEFAULT;
        g2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__G2, oldG2, G2_EDEFAULT, oldG2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG2() {
        return g2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGmax() {
        return gmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmax( Float newGmax ) {
        Float oldGmax = gmax;
        gmax = newGmax;
        boolean oldGmaxESet = gmaxESet;
        gmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__GMAX, oldGmax, gmax, !oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmax() {
        Float oldGmax = gmax;
        boolean oldGmaxESet = gmaxESet;
        gmax = GMAX_EDEFAULT;
        gmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__GMAX, oldGmax, GMAX_EDEFAULT, oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmax() {
        return gmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGmin() {
        return gmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmin( Float newGmin ) {
        Float oldGmin = gmin;
        gmin = newGmin;
        boolean oldGminESet = gminESet;
        gminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__GMIN, oldGmin, gmin, !oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmin() {
        Float oldGmin = gmin;
        boolean oldGminESet = gminESet;
        gmin = GMIN_EDEFAULT;
        gminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__GMIN, oldGmin, GMIN_EDEFAULT, oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmin() {
        return gminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKd() {
        return kd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd( Float newKd ) {
        Float oldKd = kd;
        kd = newKd;
        boolean oldKdESet = kdESet;
        kdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__KD, oldKd, kd, !oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd() {
        Float oldKd = kd;
        boolean oldKdESet = kdESet;
        kd = KD_EDEFAULT;
        kdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__KD, oldKd, KD_EDEFAULT, oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd() {
        return kdESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__KI, oldKi, ki, !oldKiESet ) );
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
                CimPackage.GOV_HYDRO_PID2__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__KP, oldKp, kp, !oldKpESet ) );
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
                CimPackage.GOV_HYDRO_PID2__KP, oldKp, KP_EDEFAULT, oldKpESet ) );
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
                CimPackage.GOV_HYDRO_PID2__MWBASE, oldMwbase, mwbase, !oldMwbaseESet ) );
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
                CimPackage.GOV_HYDRO_PID2__MWBASE, oldMwbase, MWBASE_EDEFAULT, oldMwbaseESet ) );
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
    public Float getP1() {
        return p1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP1( Float newP1 ) {
        Float oldP1 = p1;
        p1 = newP1;
        boolean oldP1ESet = p1ESet;
        p1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__P1, oldP1, p1, !oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP1() {
        Float oldP1 = p1;
        boolean oldP1ESet = p1ESet;
        p1 = P1_EDEFAULT;
        p1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__P1, oldP1, P1_EDEFAULT, oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP1() {
        return p1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP2() {
        return p2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP2( Float newP2 ) {
        Float oldP2 = p2;
        p2 = newP2;
        boolean oldP2ESet = p2ESet;
        p2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__P2, oldP2, p2, !oldP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP2() {
        Float oldP2 = p2;
        boolean oldP2ESet = p2ESet;
        p2 = P2_EDEFAULT;
        p2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__P2, oldP2, P2_EDEFAULT, oldP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP2() {
        return p2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getP3() {
        return p3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP3( Float newP3 ) {
        Float oldP3 = p3;
        p3 = newP3;
        boolean oldP3ESet = p3ESet;
        p3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__P3, oldP3, p3, !oldP3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP3() {
        Float oldP3 = p3;
        boolean oldP3ESet = p3ESet;
        p3 = P3_EDEFAULT;
        p3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__P3, oldP3, P3_EDEFAULT, oldP3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP3() {
        return p3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRperm() {
        return rperm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRperm( Float newRperm ) {
        Float oldRperm = rperm;
        rperm = newRperm;
        boolean oldRpermESet = rpermESet;
        rpermESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__RPERM, oldRperm, rperm, !oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRperm() {
        Float oldRperm = rperm;
        boolean oldRpermESet = rpermESet;
        rperm = RPERM_EDEFAULT;
        rpermESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__RPERM, oldRperm, RPERM_EDEFAULT, oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRperm() {
        return rpermESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa() {
        return ta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa( Float newTa ) {
        Float oldTa = ta;
        ta = newTa;
        boolean oldTaESet = taESet;
        taESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__TA, oldTa, ta, !oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa() {
        Float oldTa = ta;
        boolean oldTaESet = taESet;
        ta = TA_EDEFAULT;
        taESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa() {
        return taESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Float newTb ) {
        Float oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Float oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__TB, oldTb, TB_EDEFAULT, oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTreg() {
        return treg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTreg( Float newTreg ) {
        Float oldTreg = treg;
        treg = newTreg;
        boolean oldTregESet = tregESet;
        tregESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__TREG, oldTreg, treg, !oldTregESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTreg() {
        Float oldTreg = treg;
        boolean oldTregESet = tregESet;
        treg = TREG_EDEFAULT;
        tregESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__TREG, oldTreg, TREG_EDEFAULT, oldTregESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTreg() {
        return tregESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTw() {
        return tw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw( Float newTw ) {
        Float oldTw = tw;
        tw = newTw;
        boolean oldTwESet = twESet;
        twESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_PID2__TW, oldTw, tw, !oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw() {
        Float oldTw = tw;
        boolean oldTwESet = twESet;
        tw = TW_EDEFAULT;
        twESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__TW, oldTw, TW_EDEFAULT, oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw() {
        return twESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVelmax() {
        return velmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelmax( Float newVelmax ) {
        Float oldVelmax = velmax;
        velmax = newVelmax;
        boolean oldVelmaxESet = velmaxESet;
        velmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__VELMAX, oldVelmax, velmax, !oldVelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelmax() {
        Float oldVelmax = velmax;
        boolean oldVelmaxESet = velmaxESet;
        velmax = VELMAX_EDEFAULT;
        velmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__VELMAX, oldVelmax, VELMAX_EDEFAULT, oldVelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelmax() {
        return velmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVelmin() {
        return velmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelmin( Float newVelmin ) {
        Float oldVelmin = velmin;
        velmin = newVelmin;
        boolean oldVelminESet = velminESet;
        velminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GOV_HYDRO_PID2__VELMIN, oldVelmin, velmin, !oldVelminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelmin() {
        Float oldVelmin = velmin;
        boolean oldVelminESet = velminESet;
        velmin = VELMIN_EDEFAULT;
        velminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GOV_HYDRO_PID2__VELMIN, oldVelmin, VELMIN_EDEFAULT, oldVelminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelmin() {
        return velminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO_PID2__ATW:
            return getAtw();
        case CimPackage.GOV_HYDRO_PID2__D:
            return getD();
        case CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL:
            return getFeedbackSignal();
        case CimPackage.GOV_HYDRO_PID2__G0:
            return getG0();
        case CimPackage.GOV_HYDRO_PID2__G1:
            return getG1();
        case CimPackage.GOV_HYDRO_PID2__G2:
            return getG2();
        case CimPackage.GOV_HYDRO_PID2__GMAX:
            return getGmax();
        case CimPackage.GOV_HYDRO_PID2__GMIN:
            return getGmin();
        case CimPackage.GOV_HYDRO_PID2__KD:
            return getKd();
        case CimPackage.GOV_HYDRO_PID2__KI:
            return getKi();
        case CimPackage.GOV_HYDRO_PID2__KP:
            return getKp();
        case CimPackage.GOV_HYDRO_PID2__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO_PID2__P1:
            return getP1();
        case CimPackage.GOV_HYDRO_PID2__P2:
            return getP2();
        case CimPackage.GOV_HYDRO_PID2__P3:
            return getP3();
        case CimPackage.GOV_HYDRO_PID2__RPERM:
            return getRperm();
        case CimPackage.GOV_HYDRO_PID2__TA:
            return getTa();
        case CimPackage.GOV_HYDRO_PID2__TB:
            return getTb();
        case CimPackage.GOV_HYDRO_PID2__TREG:
            return getTreg();
        case CimPackage.GOV_HYDRO_PID2__TW:
            return getTw();
        case CimPackage.GOV_HYDRO_PID2__VELMAX:
            return getVelmax();
        case CimPackage.GOV_HYDRO_PID2__VELMIN:
            return getVelmin();
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
        case CimPackage.GOV_HYDRO_PID2__ATW:
            setAtw( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__D:
            setD( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL:
            setFeedbackSignal( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__G0:
            setG0( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__G1:
            setG1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__G2:
            setG2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__GMAX:
            setGmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__GMIN:
            setGmin( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__MWBASE:
            setMwbase( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__P1:
            setP1( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__P2:
            setP2( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__P3:
            setP3( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__RPERM:
            setRperm( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__TREG:
            setTreg( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__TW:
            setTw( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__VELMAX:
            setVelmax( ( Float ) newValue );
            return;
        case CimPackage.GOV_HYDRO_PID2__VELMIN:
            setVelmin( ( Float ) newValue );
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
        case CimPackage.GOV_HYDRO_PID2__ATW:
            unsetAtw();
            return;
        case CimPackage.GOV_HYDRO_PID2__D:
            unsetD();
            return;
        case CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL:
            unsetFeedbackSignal();
            return;
        case CimPackage.GOV_HYDRO_PID2__G0:
            unsetG0();
            return;
        case CimPackage.GOV_HYDRO_PID2__G1:
            unsetG1();
            return;
        case CimPackage.GOV_HYDRO_PID2__G2:
            unsetG2();
            return;
        case CimPackage.GOV_HYDRO_PID2__GMAX:
            unsetGmax();
            return;
        case CimPackage.GOV_HYDRO_PID2__GMIN:
            unsetGmin();
            return;
        case CimPackage.GOV_HYDRO_PID2__KD:
            unsetKd();
            return;
        case CimPackage.GOV_HYDRO_PID2__KI:
            unsetKi();
            return;
        case CimPackage.GOV_HYDRO_PID2__KP:
            unsetKp();
            return;
        case CimPackage.GOV_HYDRO_PID2__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO_PID2__P1:
            unsetP1();
            return;
        case CimPackage.GOV_HYDRO_PID2__P2:
            unsetP2();
            return;
        case CimPackage.GOV_HYDRO_PID2__P3:
            unsetP3();
            return;
        case CimPackage.GOV_HYDRO_PID2__RPERM:
            unsetRperm();
            return;
        case CimPackage.GOV_HYDRO_PID2__TA:
            unsetTa();
            return;
        case CimPackage.GOV_HYDRO_PID2__TB:
            unsetTb();
            return;
        case CimPackage.GOV_HYDRO_PID2__TREG:
            unsetTreg();
            return;
        case CimPackage.GOV_HYDRO_PID2__TW:
            unsetTw();
            return;
        case CimPackage.GOV_HYDRO_PID2__VELMAX:
            unsetVelmax();
            return;
        case CimPackage.GOV_HYDRO_PID2__VELMIN:
            unsetVelmin();
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
        case CimPackage.GOV_HYDRO_PID2__ATW:
            return isSetAtw();
        case CimPackage.GOV_HYDRO_PID2__D:
            return isSetD();
        case CimPackage.GOV_HYDRO_PID2__FEEDBACK_SIGNAL:
            return isSetFeedbackSignal();
        case CimPackage.GOV_HYDRO_PID2__G0:
            return isSetG0();
        case CimPackage.GOV_HYDRO_PID2__G1:
            return isSetG1();
        case CimPackage.GOV_HYDRO_PID2__G2:
            return isSetG2();
        case CimPackage.GOV_HYDRO_PID2__GMAX:
            return isSetGmax();
        case CimPackage.GOV_HYDRO_PID2__GMIN:
            return isSetGmin();
        case CimPackage.GOV_HYDRO_PID2__KD:
            return isSetKd();
        case CimPackage.GOV_HYDRO_PID2__KI:
            return isSetKi();
        case CimPackage.GOV_HYDRO_PID2__KP:
            return isSetKp();
        case CimPackage.GOV_HYDRO_PID2__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO_PID2__P1:
            return isSetP1();
        case CimPackage.GOV_HYDRO_PID2__P2:
            return isSetP2();
        case CimPackage.GOV_HYDRO_PID2__P3:
            return isSetP3();
        case CimPackage.GOV_HYDRO_PID2__RPERM:
            return isSetRperm();
        case CimPackage.GOV_HYDRO_PID2__TA:
            return isSetTa();
        case CimPackage.GOV_HYDRO_PID2__TB:
            return isSetTb();
        case CimPackage.GOV_HYDRO_PID2__TREG:
            return isSetTreg();
        case CimPackage.GOV_HYDRO_PID2__TW:
            return isSetTw();
        case CimPackage.GOV_HYDRO_PID2__VELMAX:
            return isSetVelmax();
        case CimPackage.GOV_HYDRO_PID2__VELMIN:
            return isSetVelmin();
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
        result.append( " (atw: " );
        if( atwESet )
            result.append( atw );
        else
            result.append( "<unset>" );
        result.append( ", d: " );
        if( dESet )
            result.append( d );
        else
            result.append( "<unset>" );
        result.append( ", feedbackSignal: " );
        if( feedbackSignalESet )
            result.append( feedbackSignal );
        else
            result.append( "<unset>" );
        result.append( ", g0: " );
        if( g0ESet )
            result.append( g0 );
        else
            result.append( "<unset>" );
        result.append( ", g1: " );
        if( g1ESet )
            result.append( g1 );
        else
            result.append( "<unset>" );
        result.append( ", g2: " );
        if( g2ESet )
            result.append( g2 );
        else
            result.append( "<unset>" );
        result.append( ", gmax: " );
        if( gmaxESet )
            result.append( gmax );
        else
            result.append( "<unset>" );
        result.append( ", gmin: " );
        if( gminESet )
            result.append( gmin );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
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
        result.append( ", p1: " );
        if( p1ESet )
            result.append( p1 );
        else
            result.append( "<unset>" );
        result.append( ", p2: " );
        if( p2ESet )
            result.append( p2 );
        else
            result.append( "<unset>" );
        result.append( ", p3: " );
        if( p3ESet )
            result.append( p3 );
        else
            result.append( "<unset>" );
        result.append( ", rperm: " );
        if( rpermESet )
            result.append( rperm );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", treg: " );
        if( tregESet )
            result.append( treg );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", velmax: " );
        if( velmaxESet )
            result.append( velmax );
        else
            result.append( "<unset>" );
        result.append( ", velmin: " );
        if( velminESet )
            result.append( velmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydroPID2Impl
