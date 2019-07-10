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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcSK;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc SK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getEfdmax <em>Efdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getEfdmin <em>Efdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKce <em>Kce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKgob <em>Kgob</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKqi <em>Kqi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKqob <em>Kqob</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getKqp <em>Kqp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getNq <em>Nq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getQconoff <em>Qconoff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getQz <em>Qz</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getRemote <em>Remote</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getSbase <em>Sbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getTi <em>Ti</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getUimax <em>Uimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getUimin <em>Uimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getUrmax <em>Urmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getUrmin <em>Urmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getVtmax <em>Vtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getVtmin <em>Vtmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcSKImpl#getYp <em>Yp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcSKImpl extends ExcitationSystemDynamicsImpl implements ExcSK {
    /**
     * The default value of the '{@link #getEfdmax() <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmax()
     * @generated
     * @ordered
     */
    protected static final Float EFDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdmax() <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmax()
     * @generated
     * @ordered
     */
    protected Float efdmax = EFDMAX_EDEFAULT;

    /**
     * This is true if the Efdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdmaxESet;

    /**
     * The default value of the '{@link #getEfdmin() <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmin()
     * @generated
     * @ordered
     */
    protected static final Float EFDMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdmin() <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdmin()
     * @generated
     * @ordered
     */
    protected Float efdmin = EFDMIN_EDEFAULT;

    /**
     * This is true if the Efdmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdminESet;

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
     * The default value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected static final Float K_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected Float k = K_EDEFAULT;

    /**
     * This is true if the K attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kESet;

    /**
     * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected static final Float K1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected Float k1 = K1_EDEFAULT;

    /**
     * This is true if the K1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ESet;

    /**
     * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected static final Float K2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected Float k2 = K2_EDEFAULT;

    /**
     * This is true if the K2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k2ESet;

    /**
     * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected static final Float KC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected Float kc = KC_EDEFAULT;

    /**
     * This is true if the Kc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcESet;

    /**
     * The default value of the '{@link #getKce() <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKce()
     * @generated
     * @ordered
     */
    protected static final Float KCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKce() <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKce()
     * @generated
     * @ordered
     */
    protected Float kce = KCE_EDEFAULT;

    /**
     * This is true if the Kce attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kceESet;

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
     * The default value of the '{@link #getKgob() <em>Kgob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKgob()
     * @generated
     * @ordered
     */
    protected static final Float KGOB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKgob() <em>Kgob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKgob()
     * @generated
     * @ordered
     */
    protected Float kgob = KGOB_EDEFAULT;

    /**
     * This is true if the Kgob attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgobESet;

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
     * The default value of the '{@link #getKqi() <em>Kqi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqi()
     * @generated
     * @ordered
     */
    protected static final Float KQI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKqi() <em>Kqi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqi()
     * @generated
     * @ordered
     */
    protected Float kqi = KQI_EDEFAULT;

    /**
     * This is true if the Kqi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kqiESet;

    /**
     * The default value of the '{@link #getKqob() <em>Kqob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqob()
     * @generated
     * @ordered
     */
    protected static final Float KQOB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKqob() <em>Kqob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqob()
     * @generated
     * @ordered
     */
    protected Float kqob = KQOB_EDEFAULT;

    /**
     * This is true if the Kqob attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kqobESet;

    /**
     * The default value of the '{@link #getKqp() <em>Kqp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqp()
     * @generated
     * @ordered
     */
    protected static final Float KQP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKqp() <em>Kqp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqp()
     * @generated
     * @ordered
     */
    protected Float kqp = KQP_EDEFAULT;

    /**
     * This is true if the Kqp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kqpESet;

    /**
     * The default value of the '{@link #getNq() <em>Nq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNq()
     * @generated
     * @ordered
     */
    protected static final Float NQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNq() <em>Nq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNq()
     * @generated
     * @ordered
     */
    protected Float nq = NQ_EDEFAULT;

    /**
     * This is true if the Nq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nqESet;

    /**
     * The default value of the '{@link #getQconoff() <em>Qconoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQconoff()
     * @generated
     * @ordered
     */
    protected static final Boolean QCONOFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQconoff() <em>Qconoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQconoff()
     * @generated
     * @ordered
     */
    protected Boolean qconoff = QCONOFF_EDEFAULT;

    /**
     * This is true if the Qconoff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qconoffESet;

    /**
     * The default value of the '{@link #getQz() <em>Qz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQz()
     * @generated
     * @ordered
     */
    protected static final Float QZ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQz() <em>Qz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQz()
     * @generated
     * @ordered
     */
    protected Float qz = QZ_EDEFAULT;

    /**
     * This is true if the Qz attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qzESet;

    /**
     * The default value of the '{@link #getRemote() <em>Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemote()
     * @generated
     * @ordered
     */
    protected static final Boolean REMOTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRemote() <em>Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemote()
     * @generated
     * @ordered
     */
    protected Boolean remote = REMOTE_EDEFAULT;

    /**
     * This is true if the Remote attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean remoteESet;

    /**
     * The default value of the '{@link #getSbase() <em>Sbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSbase()
     * @generated
     * @ordered
     */
    protected static final Float SBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSbase() <em>Sbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSbase()
     * @generated
     * @ordered
     */
    protected Float sbase = SBASE_EDEFAULT;

    /**
     * This is true if the Sbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sbaseESet;

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
     * The default value of the '{@link #getUimax() <em>Uimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUimax()
     * @generated
     * @ordered
     */
    protected static final Float UIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUimax() <em>Uimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUimax()
     * @generated
     * @ordered
     */
    protected Float uimax = UIMAX_EDEFAULT;

    /**
     * This is true if the Uimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uimaxESet;

    /**
     * The default value of the '{@link #getUimin() <em>Uimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUimin()
     * @generated
     * @ordered
     */
    protected static final Float UIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUimin() <em>Uimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUimin()
     * @generated
     * @ordered
     */
    protected Float uimin = UIMIN_EDEFAULT;

    /**
     * This is true if the Uimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uiminESet;

    /**
     * The default value of the '{@link #getUrmax() <em>Urmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrmax()
     * @generated
     * @ordered
     */
    protected static final Float URMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrmax() <em>Urmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrmax()
     * @generated
     * @ordered
     */
    protected Float urmax = URMAX_EDEFAULT;

    /**
     * This is true if the Urmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean urmaxESet;

    /**
     * The default value of the '{@link #getUrmin() <em>Urmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrmin()
     * @generated
     * @ordered
     */
    protected static final Float URMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrmin() <em>Urmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUrmin()
     * @generated
     * @ordered
     */
    protected Float urmin = URMIN_EDEFAULT;

    /**
     * This is true if the Urmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean urminESet;

    /**
     * The default value of the '{@link #getVtmax() <em>Vtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmax()
     * @generated
     * @ordered
     */
    protected static final Float VTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtmax() <em>Vtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmax()
     * @generated
     * @ordered
     */
    protected Float vtmax = VTMAX_EDEFAULT;

    /**
     * This is true if the Vtmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtmaxESet;

    /**
     * The default value of the '{@link #getVtmin() <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmin()
     * @generated
     * @ordered
     */
    protected static final Float VTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtmin() <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtmin()
     * @generated
     * @ordered
     */
    protected Float vtmin = VTMIN_EDEFAULT;

    /**
     * This is true if the Vtmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtminESet;

    /**
     * The default value of the '{@link #getYp() <em>Yp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYp()
     * @generated
     * @ordered
     */
    protected static final Float YP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYp() <em>Yp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYp()
     * @generated
     * @ordered
     */
    protected Float yp = YP_EDEFAULT;

    /**
     * This is true if the Yp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ypESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcSKImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcSK();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdmax() {
        return efdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdmax( Float newEfdmax ) {
        Float oldEfdmax = efdmax;
        efdmax = newEfdmax;
        boolean oldEfdmaxESet = efdmaxESet;
        efdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__EFDMAX,
                oldEfdmax, efdmax, !oldEfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdmax() {
        Float oldEfdmax = efdmax;
        boolean oldEfdmaxESet = efdmaxESet;
        efdmax = EFDMAX_EDEFAULT;
        efdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__EFDMAX, oldEfdmax, EFDMAX_EDEFAULT, oldEfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdmax() {
        return efdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfdmin() {
        return efdmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdmin( Float newEfdmin ) {
        Float oldEfdmin = efdmin;
        efdmin = newEfdmin;
        boolean oldEfdminESet = efdminESet;
        efdminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__EFDMIN,
                oldEfdmin, efdmin, !oldEfdminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdmin() {
        Float oldEfdmin = efdmin;
        boolean oldEfdminESet = efdminESet;
        efdmin = EFDMIN_EDEFAULT;
        efdminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__EFDMIN, oldEfdmin, EFDMIN_EDEFAULT, oldEfdminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdmin() {
        return efdminESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__EMAX, oldEmax, emax, !oldEmaxESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__EMAX,
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__EMIN, oldEmin, emin, !oldEminESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__EMIN,
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
    public Float getK() {
        return k;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK( Float newK ) {
        Float oldK = k;
        k = newK;
        boolean oldKESet = kESet;
        kESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__K, oldK, k, !oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK() {
        Float oldK = k;
        boolean oldKESet = kESet;
        k = K_EDEFAULT;
        kESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__K, oldK, K_EDEFAULT, oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK() {
        return kESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK1() {
        return k1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1( Float newK1 ) {
        Float oldK1 = k1;
        k1 = newK1;
        boolean oldK1ESet = k1ESet;
        k1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__K1, oldK1, k1, !oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1() {
        Float oldK1 = k1;
        boolean oldK1ESet = k1ESet;
        k1 = K1_EDEFAULT;
        k1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__K1,
                oldK1, K1_EDEFAULT, oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK1() {
        return k1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getK2() {
        return k2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK2( Float newK2 ) {
        Float oldK2 = k2;
        k2 = newK2;
        boolean oldK2ESet = k2ESet;
        k2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__K2, oldK2, k2, !oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK2() {
        Float oldK2 = k2;
        boolean oldK2ESet = k2ESet;
        k2 = K2_EDEFAULT;
        k2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__K2,
                oldK2, K2_EDEFAULT, oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK2() {
        return k2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKc() {
        return kc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKc( Float newKc ) {
        Float oldKc = kc;
        kc = newKc;
        boolean oldKcESet = kcESet;
        kcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KC, oldKc, kc, !oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKc() {
        Float oldKc = kc;
        boolean oldKcESet = kcESet;
        kc = KC_EDEFAULT;
        kcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KC,
                oldKc, KC_EDEFAULT, oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKc() {
        return kcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKce() {
        return kce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKce( Float newKce ) {
        Float oldKce = kce;
        kce = newKce;
        boolean oldKceESet = kceESet;
        kceESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KCE, oldKce, kce, !oldKceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKce() {
        Float oldKce = kce;
        boolean oldKceESet = kceESet;
        kce = KCE_EDEFAULT;
        kceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KCE,
                oldKce, KCE_EDEFAULT, oldKceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKce() {
        return kceESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KD, oldKd, kd, !oldKdESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KD,
                oldKd, KD_EDEFAULT, oldKdESet ) );
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
    public Float getKgob() {
        return kgob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKgob( Float newKgob ) {
        Float oldKgob = kgob;
        kgob = newKgob;
        boolean oldKgobESet = kgobESet;
        kgobESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KGOB, oldKgob, kgob, !oldKgobESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKgob() {
        Float oldKgob = kgob;
        boolean oldKgobESet = kgobESet;
        kgob = KGOB_EDEFAULT;
        kgobESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KGOB,
                oldKgob, KGOB_EDEFAULT, oldKgobESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKgob() {
        return kgobESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KP, oldKp, kp, !oldKpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KP,
                oldKp, KP_EDEFAULT, oldKpESet ) );
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
    public Float getKqi() {
        return kqi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKqi( Float newKqi ) {
        Float oldKqi = kqi;
        kqi = newKqi;
        boolean oldKqiESet = kqiESet;
        kqiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KQI, oldKqi, kqi, !oldKqiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKqi() {
        Float oldKqi = kqi;
        boolean oldKqiESet = kqiESet;
        kqi = KQI_EDEFAULT;
        kqiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KQI,
                oldKqi, KQI_EDEFAULT, oldKqiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKqi() {
        return kqiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKqob() {
        return kqob;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKqob( Float newKqob ) {
        Float oldKqob = kqob;
        kqob = newKqob;
        boolean oldKqobESet = kqobESet;
        kqobESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KQOB, oldKqob, kqob, !oldKqobESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKqob() {
        Float oldKqob = kqob;
        boolean oldKqobESet = kqobESet;
        kqob = KQOB_EDEFAULT;
        kqobESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KQOB,
                oldKqob, KQOB_EDEFAULT, oldKqobESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKqob() {
        return kqobESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKqp() {
        return kqp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKqp( Float newKqp ) {
        Float oldKqp = kqp;
        kqp = newKqp;
        boolean oldKqpESet = kqpESet;
        kqpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__KQP, oldKqp, kqp, !oldKqpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKqp() {
        Float oldKqp = kqp;
        boolean oldKqpESet = kqpESet;
        kqp = KQP_EDEFAULT;
        kqpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__KQP,
                oldKqp, KQP_EDEFAULT, oldKqpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKqp() {
        return kqpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNq() {
        return nq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNq( Float newNq ) {
        Float oldNq = nq;
        nq = newNq;
        boolean oldNqESet = nqESet;
        nqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__NQ, oldNq, nq, !oldNqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNq() {
        Float oldNq = nq;
        boolean oldNqESet = nqESet;
        nq = NQ_EDEFAULT;
        nqESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__NQ,
                oldNq, NQ_EDEFAULT, oldNqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNq() {
        return nqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getQconoff() {
        return qconoff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQconoff( Boolean newQconoff ) {
        Boolean oldQconoff = qconoff;
        qconoff = newQconoff;
        boolean oldQconoffESet = qconoffESet;
        qconoffESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_SK__QCONOFF, oldQconoff, qconoff, !oldQconoffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQconoff() {
        Boolean oldQconoff = qconoff;
        boolean oldQconoffESet = qconoffESet;
        qconoff = QCONOFF_EDEFAULT;
        qconoffESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__QCONOFF, oldQconoff, QCONOFF_EDEFAULT, oldQconoffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQconoff() {
        return qconoffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getQz() {
        return qz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQz( Float newQz ) {
        Float oldQz = qz;
        qz = newQz;
        boolean oldQzESet = qzESet;
        qzESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__QZ, oldQz, qz, !oldQzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQz() {
        Float oldQz = qz;
        boolean oldQzESet = qzESet;
        qz = QZ_EDEFAULT;
        qzESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__QZ,
                oldQz, QZ_EDEFAULT, oldQzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQz() {
        return qzESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRemote() {
        return remote;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRemote( Boolean newRemote ) {
        Boolean oldRemote = remote;
        remote = newRemote;
        boolean oldRemoteESet = remoteESet;
        remoteESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__REMOTE,
                oldRemote, remote, !oldRemoteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemote() {
        Boolean oldRemote = remote;
        boolean oldRemoteESet = remoteESet;
        remote = REMOTE_EDEFAULT;
        remoteESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__REMOTE, oldRemote, REMOTE_EDEFAULT, oldRemoteESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemote() {
        return remoteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSbase() {
        return sbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSbase( Float newSbase ) {
        Float oldSbase = sbase;
        sbase = newSbase;
        boolean oldSbaseESet = sbaseESet;
        sbaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__SBASE,
                oldSbase, sbase, !oldSbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSbase() {
        Float oldSbase = sbase;
        boolean oldSbaseESet = sbaseESet;
        sbase = SBASE_EDEFAULT;
        sbaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__SBASE, oldSbase, SBASE_EDEFAULT, oldSbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSbase() {
        return sbaseESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__TC, oldTc, tc, !oldTcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__TC,
                oldTc, TC_EDEFAULT, oldTcESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__TE, oldTe, te, !oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__TE,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__TI, oldTi, ti, !oldTiESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__TI,
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__TP, oldTp, tp, !oldTpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__TP,
                oldTp, TP_EDEFAULT, oldTpESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__TR, oldTr, tr, !oldTrESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__TR,
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
    public Float getUimax() {
        return uimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUimax( Float newUimax ) {
        Float oldUimax = uimax;
        uimax = newUimax;
        boolean oldUimaxESet = uimaxESet;
        uimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__UIMAX,
                oldUimax, uimax, !oldUimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUimax() {
        Float oldUimax = uimax;
        boolean oldUimaxESet = uimaxESet;
        uimax = UIMAX_EDEFAULT;
        uimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__UIMAX, oldUimax, UIMAX_EDEFAULT, oldUimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUimax() {
        return uimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUimin() {
        return uimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUimin( Float newUimin ) {
        Float oldUimin = uimin;
        uimin = newUimin;
        boolean oldUiminESet = uiminESet;
        uiminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__UIMIN,
                oldUimin, uimin, !oldUiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUimin() {
        Float oldUimin = uimin;
        boolean oldUiminESet = uiminESet;
        uimin = UIMIN_EDEFAULT;
        uiminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__UIMIN, oldUimin, UIMIN_EDEFAULT, oldUiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUimin() {
        return uiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUrmax() {
        return urmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUrmax( Float newUrmax ) {
        Float oldUrmax = urmax;
        urmax = newUrmax;
        boolean oldUrmaxESet = urmaxESet;
        urmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__URMAX,
                oldUrmax, urmax, !oldUrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUrmax() {
        Float oldUrmax = urmax;
        boolean oldUrmaxESet = urmaxESet;
        urmax = URMAX_EDEFAULT;
        urmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__URMAX, oldUrmax, URMAX_EDEFAULT, oldUrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUrmax() {
        return urmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUrmin() {
        return urmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUrmin( Float newUrmin ) {
        Float oldUrmin = urmin;
        urmin = newUrmin;
        boolean oldUrminESet = urminESet;
        urminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__URMIN,
                oldUrmin, urmin, !oldUrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUrmin() {
        Float oldUrmin = urmin;
        boolean oldUrminESet = urminESet;
        urmin = URMIN_EDEFAULT;
        urminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__URMIN, oldUrmin, URMIN_EDEFAULT, oldUrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUrmin() {
        return urminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtmax() {
        return vtmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtmax( Float newVtmax ) {
        Float oldVtmax = vtmax;
        vtmax = newVtmax;
        boolean oldVtmaxESet = vtmaxESet;
        vtmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__VTMAX,
                oldVtmax, vtmax, !oldVtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtmax() {
        Float oldVtmax = vtmax;
        boolean oldVtmaxESet = vtmaxESet;
        vtmax = VTMAX_EDEFAULT;
        vtmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__VTMAX, oldVtmax, VTMAX_EDEFAULT, oldVtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtmax() {
        return vtmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtmin() {
        return vtmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtmin( Float newVtmin ) {
        Float oldVtmin = vtmin;
        vtmin = newVtmin;
        boolean oldVtminESet = vtminESet;
        vtminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__VTMIN,
                oldVtmin, vtmin, !oldVtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtmin() {
        Float oldVtmin = vtmin;
        boolean oldVtminESet = vtminESet;
        vtmin = VTMIN_EDEFAULT;
        vtminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_SK__VTMIN, oldVtmin, VTMIN_EDEFAULT, oldVtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtmin() {
        return vtminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getYp() {
        return yp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYp( Float newYp ) {
        Float oldYp = yp;
        yp = newYp;
        boolean oldYpESet = ypESet;
        ypESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_SK__YP, oldYp, yp, !oldYpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYp() {
        Float oldYp = yp;
        boolean oldYpESet = ypESet;
        yp = YP_EDEFAULT;
        ypESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_SK__YP,
                oldYp, YP_EDEFAULT, oldYpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYp() {
        return ypESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_SK__EFDMAX:
            return getEfdmax();
        case CimPackage.EXC_SK__EFDMIN:
            return getEfdmin();
        case CimPackage.EXC_SK__EMAX:
            return getEmax();
        case CimPackage.EXC_SK__EMIN:
            return getEmin();
        case CimPackage.EXC_SK__K:
            return getK();
        case CimPackage.EXC_SK__K1:
            return getK1();
        case CimPackage.EXC_SK__K2:
            return getK2();
        case CimPackage.EXC_SK__KC:
            return getKc();
        case CimPackage.EXC_SK__KCE:
            return getKce();
        case CimPackage.EXC_SK__KD:
            return getKd();
        case CimPackage.EXC_SK__KGOB:
            return getKgob();
        case CimPackage.EXC_SK__KP:
            return getKp();
        case CimPackage.EXC_SK__KQI:
            return getKqi();
        case CimPackage.EXC_SK__KQOB:
            return getKqob();
        case CimPackage.EXC_SK__KQP:
            return getKqp();
        case CimPackage.EXC_SK__NQ:
            return getNq();
        case CimPackage.EXC_SK__QCONOFF:
            return getQconoff();
        case CimPackage.EXC_SK__QZ:
            return getQz();
        case CimPackage.EXC_SK__REMOTE:
            return getRemote();
        case CimPackage.EXC_SK__SBASE:
            return getSbase();
        case CimPackage.EXC_SK__TC:
            return getTc();
        case CimPackage.EXC_SK__TE:
            return getTe();
        case CimPackage.EXC_SK__TI:
            return getTi();
        case CimPackage.EXC_SK__TP:
            return getTp();
        case CimPackage.EXC_SK__TR:
            return getTr();
        case CimPackage.EXC_SK__UIMAX:
            return getUimax();
        case CimPackage.EXC_SK__UIMIN:
            return getUimin();
        case CimPackage.EXC_SK__URMAX:
            return getUrmax();
        case CimPackage.EXC_SK__URMIN:
            return getUrmin();
        case CimPackage.EXC_SK__VTMAX:
            return getVtmax();
        case CimPackage.EXC_SK__VTMIN:
            return getVtmin();
        case CimPackage.EXC_SK__YP:
            return getYp();
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
        case CimPackage.EXC_SK__EFDMAX:
            setEfdmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__EFDMIN:
            setEfdmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__EMAX:
            setEmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__EMIN:
            setEmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__K:
            setK( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__K1:
            setK1( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__K2:
            setK2( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KCE:
            setKce( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KGOB:
            setKgob( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KQI:
            setKqi( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KQOB:
            setKqob( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__KQP:
            setKqp( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__NQ:
            setNq( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__QCONOFF:
            setQconoff( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_SK__QZ:
            setQz( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__REMOTE:
            setRemote( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_SK__SBASE:
            setSbase( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__TI:
            setTi( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__TR:
            setTr( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__UIMAX:
            setUimax( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__UIMIN:
            setUimin( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__URMAX:
            setUrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__URMIN:
            setUrmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__VTMAX:
            setVtmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__VTMIN:
            setVtmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_SK__YP:
            setYp( ( Float ) newValue );
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
        case CimPackage.EXC_SK__EFDMAX:
            unsetEfdmax();
            return;
        case CimPackage.EXC_SK__EFDMIN:
            unsetEfdmin();
            return;
        case CimPackage.EXC_SK__EMAX:
            unsetEmax();
            return;
        case CimPackage.EXC_SK__EMIN:
            unsetEmin();
            return;
        case CimPackage.EXC_SK__K:
            unsetK();
            return;
        case CimPackage.EXC_SK__K1:
            unsetK1();
            return;
        case CimPackage.EXC_SK__K2:
            unsetK2();
            return;
        case CimPackage.EXC_SK__KC:
            unsetKc();
            return;
        case CimPackage.EXC_SK__KCE:
            unsetKce();
            return;
        case CimPackage.EXC_SK__KD:
            unsetKd();
            return;
        case CimPackage.EXC_SK__KGOB:
            unsetKgob();
            return;
        case CimPackage.EXC_SK__KP:
            unsetKp();
            return;
        case CimPackage.EXC_SK__KQI:
            unsetKqi();
            return;
        case CimPackage.EXC_SK__KQOB:
            unsetKqob();
            return;
        case CimPackage.EXC_SK__KQP:
            unsetKqp();
            return;
        case CimPackage.EXC_SK__NQ:
            unsetNq();
            return;
        case CimPackage.EXC_SK__QCONOFF:
            unsetQconoff();
            return;
        case CimPackage.EXC_SK__QZ:
            unsetQz();
            return;
        case CimPackage.EXC_SK__REMOTE:
            unsetRemote();
            return;
        case CimPackage.EXC_SK__SBASE:
            unsetSbase();
            return;
        case CimPackage.EXC_SK__TC:
            unsetTc();
            return;
        case CimPackage.EXC_SK__TE:
            unsetTe();
            return;
        case CimPackage.EXC_SK__TI:
            unsetTi();
            return;
        case CimPackage.EXC_SK__TP:
            unsetTp();
            return;
        case CimPackage.EXC_SK__TR:
            unsetTr();
            return;
        case CimPackage.EXC_SK__UIMAX:
            unsetUimax();
            return;
        case CimPackage.EXC_SK__UIMIN:
            unsetUimin();
            return;
        case CimPackage.EXC_SK__URMAX:
            unsetUrmax();
            return;
        case CimPackage.EXC_SK__URMIN:
            unsetUrmin();
            return;
        case CimPackage.EXC_SK__VTMAX:
            unsetVtmax();
            return;
        case CimPackage.EXC_SK__VTMIN:
            unsetVtmin();
            return;
        case CimPackage.EXC_SK__YP:
            unsetYp();
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
        case CimPackage.EXC_SK__EFDMAX:
            return isSetEfdmax();
        case CimPackage.EXC_SK__EFDMIN:
            return isSetEfdmin();
        case CimPackage.EXC_SK__EMAX:
            return isSetEmax();
        case CimPackage.EXC_SK__EMIN:
            return isSetEmin();
        case CimPackage.EXC_SK__K:
            return isSetK();
        case CimPackage.EXC_SK__K1:
            return isSetK1();
        case CimPackage.EXC_SK__K2:
            return isSetK2();
        case CimPackage.EXC_SK__KC:
            return isSetKc();
        case CimPackage.EXC_SK__KCE:
            return isSetKce();
        case CimPackage.EXC_SK__KD:
            return isSetKd();
        case CimPackage.EXC_SK__KGOB:
            return isSetKgob();
        case CimPackage.EXC_SK__KP:
            return isSetKp();
        case CimPackage.EXC_SK__KQI:
            return isSetKqi();
        case CimPackage.EXC_SK__KQOB:
            return isSetKqob();
        case CimPackage.EXC_SK__KQP:
            return isSetKqp();
        case CimPackage.EXC_SK__NQ:
            return isSetNq();
        case CimPackage.EXC_SK__QCONOFF:
            return isSetQconoff();
        case CimPackage.EXC_SK__QZ:
            return isSetQz();
        case CimPackage.EXC_SK__REMOTE:
            return isSetRemote();
        case CimPackage.EXC_SK__SBASE:
            return isSetSbase();
        case CimPackage.EXC_SK__TC:
            return isSetTc();
        case CimPackage.EXC_SK__TE:
            return isSetTe();
        case CimPackage.EXC_SK__TI:
            return isSetTi();
        case CimPackage.EXC_SK__TP:
            return isSetTp();
        case CimPackage.EXC_SK__TR:
            return isSetTr();
        case CimPackage.EXC_SK__UIMAX:
            return isSetUimax();
        case CimPackage.EXC_SK__UIMIN:
            return isSetUimin();
        case CimPackage.EXC_SK__URMAX:
            return isSetUrmax();
        case CimPackage.EXC_SK__URMIN:
            return isSetUrmin();
        case CimPackage.EXC_SK__VTMAX:
            return isSetVtmax();
        case CimPackage.EXC_SK__VTMIN:
            return isSetVtmin();
        case CimPackage.EXC_SK__YP:
            return isSetYp();
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
        result.append( " (efdmax: " );
        if( efdmaxESet )
            result.append( efdmax );
        else
            result.append( "<unset>" );
        result.append( ", efdmin: " );
        if( efdminESet )
            result.append( efdmin );
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
        result.append( ", k: " );
        if( kESet )
            result.append( k );
        else
            result.append( "<unset>" );
        result.append( ", k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", kce: " );
        if( kceESet )
            result.append( kce );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", kgob: " );
        if( kgobESet )
            result.append( kgob );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", kqi: " );
        if( kqiESet )
            result.append( kqi );
        else
            result.append( "<unset>" );
        result.append( ", kqob: " );
        if( kqobESet )
            result.append( kqob );
        else
            result.append( "<unset>" );
        result.append( ", kqp: " );
        if( kqpESet )
            result.append( kqp );
        else
            result.append( "<unset>" );
        result.append( ", nq: " );
        if( nqESet )
            result.append( nq );
        else
            result.append( "<unset>" );
        result.append( ", qconoff: " );
        if( qconoffESet )
            result.append( qconoff );
        else
            result.append( "<unset>" );
        result.append( ", qz: " );
        if( qzESet )
            result.append( qz );
        else
            result.append( "<unset>" );
        result.append( ", remote: " );
        if( remoteESet )
            result.append( remote );
        else
            result.append( "<unset>" );
        result.append( ", sbase: " );
        if( sbaseESet )
            result.append( sbase );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
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
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", uimax: " );
        if( uimaxESet )
            result.append( uimax );
        else
            result.append( "<unset>" );
        result.append( ", uimin: " );
        if( uiminESet )
            result.append( uimin );
        else
            result.append( "<unset>" );
        result.append( ", urmax: " );
        if( urmaxESet )
            result.append( urmax );
        else
            result.append( "<unset>" );
        result.append( ", urmin: " );
        if( urminESet )
            result.append( urmin );
        else
            result.append( "<unset>" );
        result.append( ", vtmax: " );
        if( vtmaxESet )
            result.append( vtmax );
        else
            result.append( "<unset>" );
        result.append( ", vtmin: " );
        if( vtminESet )
            result.append( vtmin );
        else
            result.append( "<unset>" );
        result.append( ", yp: " );
        if( ypESet )
            result.append( yp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcSKImpl
