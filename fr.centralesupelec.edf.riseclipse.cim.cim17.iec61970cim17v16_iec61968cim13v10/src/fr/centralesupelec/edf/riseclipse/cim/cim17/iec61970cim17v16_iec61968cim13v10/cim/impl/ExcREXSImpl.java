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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcREXS;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcREXSFeedbackSignalKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc REXS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getFbf <em>Fbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getFlimf <em>Flimf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKefd <em>Kefd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKh <em>Kh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKii <em>Kii</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKvi <em>Kvi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKvp <em>Kvp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getKvphz <em>Kvphz</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getNvphz <em>Nvphz</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getSe1 <em>Se1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getSe2 <em>Se2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTb2 <em>Tb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTc1 <em>Tc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTc2 <em>Tc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVcmax <em>Vcmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVfmax <em>Vfmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVfmin <em>Vfmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcREXSImpl#getXc <em>Xc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcREXSImpl extends ExcitationSystemDynamicsImpl implements ExcREXS {
    /**
     * The default value of the '{@link #getE1() <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE1()
     * @generated
     * @ordered
     */
    protected static final Float E1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE1() <em>E1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE1()
     * @generated
     * @ordered
     */
    protected Float e1 = E1_EDEFAULT;

    /**
     * This is true if the E1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean e1ESet;

    /**
     * The default value of the '{@link #getE2() <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE2()
     * @generated
     * @ordered
     */
    protected static final Float E2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getE2() <em>E2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getE2()
     * @generated
     * @ordered
     */
    protected Float e2 = E2_EDEFAULT;

    /**
     * This is true if the E2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean e2ESet;

    /**
     * The default value of the '{@link #getFbf() <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFbf()
     * @generated
     * @ordered
     */
    protected static final ExcREXSFeedbackSignalKind FBF_EDEFAULT = ExcREXSFeedbackSignalKind.FIELD_VOLTAGE;

    /**
     * The cached value of the '{@link #getFbf() <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFbf()
     * @generated
     * @ordered
     */
    protected ExcREXSFeedbackSignalKind fbf = FBF_EDEFAULT;

    /**
     * This is true if the Fbf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fbfESet;

    /**
     * The default value of the '{@link #getFlimf() <em>Flimf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlimf()
     * @generated
     * @ordered
     */
    protected static final Float FLIMF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlimf() <em>Flimf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlimf()
     * @generated
     * @ordered
     */
    protected Float flimf = FLIMF_EDEFAULT;

    /**
     * This is true if the Flimf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flimfESet;

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
     * The default value of the '{@link #getKefd() <em>Kefd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKefd()
     * @generated
     * @ordered
     */
    protected static final Float KEFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKefd() <em>Kefd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKefd()
     * @generated
     * @ordered
     */
    protected Float kefd = KEFD_EDEFAULT;

    /**
     * This is true if the Kefd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kefdESet;

    /**
     * The default value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected static final Float KF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected Float kf = KF_EDEFAULT;

    /**
     * This is true if the Kf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfESet;

    /**
     * The default value of the '{@link #getKh() <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh()
     * @generated
     * @ordered
     */
    protected static final Float KH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKh() <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh()
     * @generated
     * @ordered
     */
    protected Float kh = KH_EDEFAULT;

    /**
     * This is true if the Kh attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean khESet;

    /**
     * The default value of the '{@link #getKii() <em>Kii</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKii()
     * @generated
     * @ordered
     */
    protected static final Float KII_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKii() <em>Kii</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKii()
     * @generated
     * @ordered
     */
    protected Float kii = KII_EDEFAULT;

    /**
     * This is true if the Kii attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiiESet;

    /**
     * The default value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected static final Float KIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected Float kip = KIP_EDEFAULT;

    /**
     * This is true if the Kip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipESet;

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
     * The default value of the '{@link #getKvi() <em>Kvi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvi()
     * @generated
     * @ordered
     */
    protected static final Float KVI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKvi() <em>Kvi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvi()
     * @generated
     * @ordered
     */
    protected Float kvi = KVI_EDEFAULT;

    /**
     * This is true if the Kvi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kviESet;

    /**
     * The default value of the '{@link #getKvp() <em>Kvp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvp()
     * @generated
     * @ordered
     */
    protected static final Float KVP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKvp() <em>Kvp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvp()
     * @generated
     * @ordered
     */
    protected Float kvp = KVP_EDEFAULT;

    /**
     * This is true if the Kvp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kvpESet;

    /**
     * The default value of the '{@link #getKvphz() <em>Kvphz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvphz()
     * @generated
     * @ordered
     */
    protected static final Float KVPHZ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKvphz() <em>Kvphz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvphz()
     * @generated
     * @ordered
     */
    protected Float kvphz = KVPHZ_EDEFAULT;

    /**
     * This is true if the Kvphz attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kvphzESet;

    /**
     * The default value of the '{@link #getNvphz() <em>Nvphz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNvphz()
     * @generated
     * @ordered
     */
    protected static final Float NVPHZ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNvphz() <em>Nvphz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNvphz()
     * @generated
     * @ordered
     */
    protected Float nvphz = NVPHZ_EDEFAULT;

    /**
     * This is true if the Nvphz attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nvphzESet;

    /**
     * The default value of the '{@link #getSe1() <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe1()
     * @generated
     * @ordered
     */
    protected static final Float SE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSe1() <em>Se1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe1()
     * @generated
     * @ordered
     */
    protected Float se1 = SE1_EDEFAULT;

    /**
     * This is true if the Se1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean se1ESet;

    /**
     * The default value of the '{@link #getSe2() <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe2()
     * @generated
     * @ordered
     */
    protected static final Float SE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSe2() <em>Se2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSe2()
     * @generated
     * @ordered
     */
    protected Float se2 = SE2_EDEFAULT;

    /**
     * This is true if the Se2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean se2ESet;

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
     * The default value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected static final Float TB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb1() <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb1()
     * @generated
     * @ordered
     */
    protected Float tb1 = TB1_EDEFAULT;

    /**
     * This is true if the Tb1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tb1ESet;

    /**
     * The default value of the '{@link #getTb2() <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb2()
     * @generated
     * @ordered
     */
    protected static final Float TB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb2() <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb2()
     * @generated
     * @ordered
     */
    protected Float tb2 = TB2_EDEFAULT;

    /**
     * This is true if the Tb2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tb2ESet;

    /**
     * The default value of the '{@link #getTc1() <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc1()
     * @generated
     * @ordered
     */
    protected static final Float TC1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc1() <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc1()
     * @generated
     * @ordered
     */
    protected Float tc1 = TC1_EDEFAULT;

    /**
     * This is true if the Tc1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tc1ESet;

    /**
     * The default value of the '{@link #getTc2() <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc2()
     * @generated
     * @ordered
     */
    protected static final Float TC2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc2() <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc2()
     * @generated
     * @ordered
     */
    protected Float tc2 = TC2_EDEFAULT;

    /**
     * This is true if the Tc2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tc2ESet;

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
     * The default value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected static final Float TF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected Float tf = TF_EDEFAULT;

    /**
     * This is true if the Tf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfESet;

    /**
     * The default value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected static final Float TF1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf1() <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf1()
     * @generated
     * @ordered
     */
    protected Float tf1 = TF1_EDEFAULT;

    /**
     * This is true if the Tf1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf1ESet;

    /**
     * The default value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected static final Float TF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected Float tf2 = TF2_EDEFAULT;

    /**
     * This is true if the Tf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf2ESet;

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
     * The default value of the '{@link #getVcmax() <em>Vcmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcmax()
     * @generated
     * @ordered
     */
    protected static final Float VCMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVcmax() <em>Vcmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVcmax()
     * @generated
     * @ordered
     */
    protected Float vcmax = VCMAX_EDEFAULT;

    /**
     * This is true if the Vcmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vcmaxESet;

    /**
     * The default value of the '{@link #getVfmax() <em>Vfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmax()
     * @generated
     * @ordered
     */
    protected static final Float VFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfmax() <em>Vfmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmax()
     * @generated
     * @ordered
     */
    protected Float vfmax = VFMAX_EDEFAULT;

    /**
     * This is true if the Vfmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfmaxESet;

    /**
     * The default value of the '{@link #getVfmin() <em>Vfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmin()
     * @generated
     * @ordered
     */
    protected static final Float VFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfmin() <em>Vfmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmin()
     * @generated
     * @ordered
     */
    protected Float vfmin = VFMIN_EDEFAULT;

    /**
     * This is true if the Vfmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfminESet;

    /**
     * The default value of the '{@link #getVimax() <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimax()
     * @generated
     * @ordered
     */
    protected static final Float VIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVimax() <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimax()
     * @generated
     * @ordered
     */
    protected Float vimax = VIMAX_EDEFAULT;

    /**
     * This is true if the Vimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vimaxESet;

    /**
     * The default value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected static final Float VRMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected Float vrmax = VRMAX_EDEFAULT;

    /**
     * This is true if the Vrmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmaxESet;

    /**
     * The default value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected static final Float VRMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected Float vrmin = VRMIN_EDEFAULT;

    /**
     * This is true if the Vrmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrminESet;

    /**
     * The default value of the '{@link #getXc() <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXc()
     * @generated
     * @ordered
     */
    protected static final Float XC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXc() <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXc()
     * @generated
     * @ordered
     */
    protected Float xc = XC_EDEFAULT;

    /**
     * This is true if the Xc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcREXSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcREXS();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getE1() {
        return e1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE1( Float newE1 ) {
        Float oldE1 = e1;
        e1 = newE1;
        boolean oldE1ESet = e1ESet;
        e1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__E1, oldE1, e1, !oldE1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE1() {
        Float oldE1 = e1;
        boolean oldE1ESet = e1ESet;
        e1 = E1_EDEFAULT;
        e1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__E1,
                oldE1, E1_EDEFAULT, oldE1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE1() {
        return e1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getE2() {
        return e2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setE2( Float newE2 ) {
        Float oldE2 = e2;
        e2 = newE2;
        boolean oldE2ESet = e2ESet;
        e2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__E2, oldE2, e2, !oldE2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetE2() {
        Float oldE2 = e2;
        boolean oldE2ESet = e2ESet;
        e2 = E2_EDEFAULT;
        e2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__E2,
                oldE2, E2_EDEFAULT, oldE2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetE2() {
        return e2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcREXSFeedbackSignalKind getFbf() {
        return fbf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFbf( ExcREXSFeedbackSignalKind newFbf ) {
        ExcREXSFeedbackSignalKind oldFbf = fbf;
        fbf = newFbf == null ? FBF_EDEFAULT : newFbf;
        boolean oldFbfESet = fbfESet;
        fbfESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__FBF, oldFbf, fbf, !oldFbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFbf() {
        ExcREXSFeedbackSignalKind oldFbf = fbf;
        boolean oldFbfESet = fbfESet;
        fbf = FBF_EDEFAULT;
        fbfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__FBF, oldFbf, FBF_EDEFAULT, oldFbfESet ) );
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
    public Float getFlimf() {
        return flimf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlimf( Float newFlimf ) {
        Float oldFlimf = flimf;
        flimf = newFlimf;
        boolean oldFlimfESet = flimfESet;
        flimfESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__FLIMF, oldFlimf, flimf, !oldFlimfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlimf() {
        Float oldFlimf = flimf;
        boolean oldFlimfESet = flimfESet;
        flimf = FLIMF_EDEFAULT;
        flimfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__FLIMF, oldFlimf, FLIMF_EDEFAULT, oldFlimfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlimf() {
        return flimfESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KC, oldKc, kc, !oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KC,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KD, oldKd, kd, !oldKdESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KD,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KE, oldKe, ke, !oldKeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KE,
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
    public Float getKefd() {
        return kefd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKefd( Float newKefd ) {
        Float oldKefd = kefd;
        kefd = newKefd;
        boolean oldKefdESet = kefdESet;
        kefdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KEFD,
                oldKefd, kefd, !oldKefdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKefd() {
        Float oldKefd = kefd;
        boolean oldKefdESet = kefdESet;
        kefd = KEFD_EDEFAULT;
        kefdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KEFD, oldKefd, KEFD_EDEFAULT, oldKefdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKefd() {
        return kefdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKf() {
        return kf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf( Float newKf ) {
        Float oldKf = kf;
        kf = newKf;
        boolean oldKfESet = kfESet;
        kfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KF, oldKf, kf, !oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf() {
        Float oldKf = kf;
        boolean oldKfESet = kfESet;
        kf = KF_EDEFAULT;
        kfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KF,
                oldKf, KF_EDEFAULT, oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf() {
        return kfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKh() {
        return kh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKh( Float newKh ) {
        Float oldKh = kh;
        kh = newKh;
        boolean oldKhESet = khESet;
        khESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KH, oldKh, kh, !oldKhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKh() {
        Float oldKh = kh;
        boolean oldKhESet = khESet;
        kh = KH_EDEFAULT;
        khESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KH,
                oldKh, KH_EDEFAULT, oldKhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKh() {
        return khESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKii() {
        return kii;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKii( Float newKii ) {
        Float oldKii = kii;
        kii = newKii;
        boolean oldKiiESet = kiiESet;
        kiiESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KII, oldKii, kii, !oldKiiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKii() {
        Float oldKii = kii;
        boolean oldKiiESet = kiiESet;
        kii = KII_EDEFAULT;
        kiiESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KII, oldKii, KII_EDEFAULT, oldKiiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKii() {
        return kiiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKip() {
        return kip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKip( Float newKip ) {
        Float oldKip = kip;
        kip = newKip;
        boolean oldKipESet = kipESet;
        kipESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KIP, oldKip, kip, !oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKip() {
        Float oldKip = kip;
        boolean oldKipESet = kipESet;
        kip = KIP_EDEFAULT;
        kipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KIP, oldKip, KIP_EDEFAULT, oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKip() {
        return kipESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KS, oldKs, ks, !oldKsESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__KS,
                oldKs, KS_EDEFAULT, oldKsESet ) );
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
    public Float getKvi() {
        return kvi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKvi( Float newKvi ) {
        Float oldKvi = kvi;
        kvi = newKvi;
        boolean oldKviESet = kviESet;
        kviESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KVI, oldKvi, kvi, !oldKviESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKvi() {
        Float oldKvi = kvi;
        boolean oldKviESet = kviESet;
        kvi = KVI_EDEFAULT;
        kviESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KVI, oldKvi, KVI_EDEFAULT, oldKviESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKvi() {
        return kviESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKvp() {
        return kvp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKvp( Float newKvp ) {
        Float oldKvp = kvp;
        kvp = newKvp;
        boolean oldKvpESet = kvpESet;
        kvpESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__KVP, oldKvp, kvp, !oldKvpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKvp() {
        Float oldKvp = kvp;
        boolean oldKvpESet = kvpESet;
        kvp = KVP_EDEFAULT;
        kvpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KVP, oldKvp, KVP_EDEFAULT, oldKvpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKvp() {
        return kvpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKvphz() {
        return kvphz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKvphz( Float newKvphz ) {
        Float oldKvphz = kvphz;
        kvphz = newKvphz;
        boolean oldKvphzESet = kvphzESet;
        kvphzESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__KVPHZ, oldKvphz, kvphz, !oldKvphzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKvphz() {
        Float oldKvphz = kvphz;
        boolean oldKvphzESet = kvphzESet;
        kvphz = KVPHZ_EDEFAULT;
        kvphzESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__KVPHZ, oldKvphz, KVPHZ_EDEFAULT, oldKvphzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKvphz() {
        return kvphzESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNvphz() {
        return nvphz;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNvphz( Float newNvphz ) {
        Float oldNvphz = nvphz;
        nvphz = newNvphz;
        boolean oldNvphzESet = nvphzESet;
        nvphzESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__NVPHZ, oldNvphz, nvphz, !oldNvphzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNvphz() {
        Float oldNvphz = nvphz;
        boolean oldNvphzESet = nvphzESet;
        nvphz = NVPHZ_EDEFAULT;
        nvphzESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__NVPHZ, oldNvphz, NVPHZ_EDEFAULT, oldNvphzESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNvphz() {
        return nvphzESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSe1() {
        return se1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSe1( Float newSe1 ) {
        Float oldSe1 = se1;
        se1 = newSe1;
        boolean oldSe1ESet = se1ESet;
        se1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__SE1, oldSe1, se1, !oldSe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSe1() {
        Float oldSe1 = se1;
        boolean oldSe1ESet = se1ESet;
        se1 = SE1_EDEFAULT;
        se1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__SE1, oldSe1, SE1_EDEFAULT, oldSe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSe1() {
        return se1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSe2() {
        return se2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSe2( Float newSe2 ) {
        Float oldSe2 = se2;
        se2 = newSe2;
        boolean oldSe2ESet = se2ESet;
        se2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__SE2, oldSe2, se2, !oldSe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSe2() {
        Float oldSe2 = se2;
        boolean oldSe2ESet = se2ESet;
        se2 = SE2_EDEFAULT;
        se2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__SE2, oldSe2, SE2_EDEFAULT, oldSe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSe2() {
        return se2ESet;
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TA, oldTa, ta, !oldTaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__TA,
                oldTa, TA_EDEFAULT, oldTaESet ) );
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
    public Float getTb1() {
        return tb1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb1( Float newTb1 ) {
        Float oldTb1 = tb1;
        tb1 = newTb1;
        boolean oldTb1ESet = tb1ESet;
        tb1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TB1, oldTb1, tb1, !oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb1() {
        Float oldTb1 = tb1;
        boolean oldTb1ESet = tb1ESet;
        tb1 = TB1_EDEFAULT;
        tb1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TB1, oldTb1, TB1_EDEFAULT, oldTb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb1() {
        return tb1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTb2() {
        return tb2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb2( Float newTb2 ) {
        Float oldTb2 = tb2;
        tb2 = newTb2;
        boolean oldTb2ESet = tb2ESet;
        tb2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TB2, oldTb2, tb2, !oldTb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb2() {
        Float oldTb2 = tb2;
        boolean oldTb2ESet = tb2ESet;
        tb2 = TB2_EDEFAULT;
        tb2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TB2, oldTb2, TB2_EDEFAULT, oldTb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb2() {
        return tb2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTc1() {
        return tc1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc1( Float newTc1 ) {
        Float oldTc1 = tc1;
        tc1 = newTc1;
        boolean oldTc1ESet = tc1ESet;
        tc1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TC1, oldTc1, tc1, !oldTc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc1() {
        Float oldTc1 = tc1;
        boolean oldTc1ESet = tc1ESet;
        tc1 = TC1_EDEFAULT;
        tc1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TC1, oldTc1, TC1_EDEFAULT, oldTc1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc1() {
        return tc1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTc2() {
        return tc2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc2( Float newTc2 ) {
        Float oldTc2 = tc2;
        tc2 = newTc2;
        boolean oldTc2ESet = tc2ESet;
        tc2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TC2, oldTc2, tc2, !oldTc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc2() {
        Float oldTc2 = tc2;
        boolean oldTc2ESet = tc2ESet;
        tc2 = TC2_EDEFAULT;
        tc2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TC2, oldTc2, TC2_EDEFAULT, oldTc2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc2() {
        return tc2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TE, oldTe, te, !oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__TE,
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
    public Float getTf() {
        return tf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf( Float newTf ) {
        Float oldTf = tf;
        tf = newTf;
        boolean oldTfESet = tfESet;
        tfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TF, oldTf, tf, !oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf() {
        Float oldTf = tf;
        boolean oldTfESet = tfESet;
        tf = TF_EDEFAULT;
        tfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__TF,
                oldTf, TF_EDEFAULT, oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf() {
        return tfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf1() {
        return tf1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf1( Float newTf1 ) {
        Float oldTf1 = tf1;
        tf1 = newTf1;
        boolean oldTf1ESet = tf1ESet;
        tf1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TF1, oldTf1, tf1, !oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf1() {
        Float oldTf1 = tf1;
        boolean oldTf1ESet = tf1ESet;
        tf1 = TF1_EDEFAULT;
        tf1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TF1, oldTf1, TF1_EDEFAULT, oldTf1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf1() {
        return tf1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTf2() {
        return tf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf2( Float newTf2 ) {
        Float oldTf2 = tf2;
        tf2 = newTf2;
        boolean oldTf2ESet = tf2ESet;
        tf2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TF2, oldTf2, tf2, !oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf2() {
        Float oldTf2 = tf2;
        boolean oldTf2ESet = tf2ESet;
        tf2 = TF2_EDEFAULT;
        tf2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__TF2, oldTf2, TF2_EDEFAULT, oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf2() {
        return tf2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__TP, oldTp, tp, !oldTpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__TP,
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
    public Float getVcmax() {
        return vcmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVcmax( Float newVcmax ) {
        Float oldVcmax = vcmax;
        vcmax = newVcmax;
        boolean oldVcmaxESet = vcmaxESet;
        vcmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VCMAX, oldVcmax, vcmax, !oldVcmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVcmax() {
        Float oldVcmax = vcmax;
        boolean oldVcmaxESet = vcmaxESet;
        vcmax = VCMAX_EDEFAULT;
        vcmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VCMAX, oldVcmax, VCMAX_EDEFAULT, oldVcmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVcmax() {
        return vcmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVfmax() {
        return vfmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfmax( Float newVfmax ) {
        Float oldVfmax = vfmax;
        vfmax = newVfmax;
        boolean oldVfmaxESet = vfmaxESet;
        vfmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VFMAX, oldVfmax, vfmax, !oldVfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfmax() {
        Float oldVfmax = vfmax;
        boolean oldVfmaxESet = vfmaxESet;
        vfmax = VFMAX_EDEFAULT;
        vfmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VFMAX, oldVfmax, VFMAX_EDEFAULT, oldVfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfmax() {
        return vfmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVfmin() {
        return vfmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfmin( Float newVfmin ) {
        Float oldVfmin = vfmin;
        vfmin = newVfmin;
        boolean oldVfminESet = vfminESet;
        vfminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VFMIN, oldVfmin, vfmin, !oldVfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfmin() {
        Float oldVfmin = vfmin;
        boolean oldVfminESet = vfminESet;
        vfmin = VFMIN_EDEFAULT;
        vfminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VFMIN, oldVfmin, VFMIN_EDEFAULT, oldVfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfmin() {
        return vfminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVimax() {
        return vimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVimax( Float newVimax ) {
        Float oldVimax = vimax;
        vimax = newVimax;
        boolean oldVimaxESet = vimaxESet;
        vimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VIMAX, oldVimax, vimax, !oldVimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVimax() {
        Float oldVimax = vimax;
        boolean oldVimaxESet = vimaxESet;
        vimax = VIMAX_EDEFAULT;
        vimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VIMAX, oldVimax, VIMAX_EDEFAULT, oldVimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVimax() {
        return vimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmax() {
        return vrmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmax( Float newVrmax ) {
        Float oldVrmax = vrmax;
        vrmax = newVrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmax() {
        Float oldVrmax = vrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmax = VRMAX_EDEFAULT;
        vrmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmax() {
        return vrmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVrmin() {
        return vrmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmin( Float newVrmin ) {
        Float oldVrmin = vrmin;
        vrmin = newVrmin;
        boolean oldVrminESet = vrminESet;
        vrminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_REXS__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmin() {
        Float oldVrmin = vrmin;
        boolean oldVrminESet = vrminESet;
        vrmin = VRMIN_EDEFAULT;
        vrminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_REXS__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmin() {
        return vrminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXc() {
        return xc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXc( Float newXc ) {
        Float oldXc = xc;
        xc = newXc;
        boolean oldXcESet = xcESet;
        xcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_REXS__XC, oldXc, xc, !oldXcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXc() {
        Float oldXc = xc;
        boolean oldXcESet = xcESet;
        xc = XC_EDEFAULT;
        xcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_REXS__XC,
                oldXc, XC_EDEFAULT, oldXcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXc() {
        return xcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_REXS__E1:
            return getE1();
        case CimPackage.EXC_REXS__E2:
            return getE2();
        case CimPackage.EXC_REXS__FBF:
            return getFbf();
        case CimPackage.EXC_REXS__FLIMF:
            return getFlimf();
        case CimPackage.EXC_REXS__KC:
            return getKc();
        case CimPackage.EXC_REXS__KD:
            return getKd();
        case CimPackage.EXC_REXS__KE:
            return getKe();
        case CimPackage.EXC_REXS__KEFD:
            return getKefd();
        case CimPackage.EXC_REXS__KF:
            return getKf();
        case CimPackage.EXC_REXS__KH:
            return getKh();
        case CimPackage.EXC_REXS__KII:
            return getKii();
        case CimPackage.EXC_REXS__KIP:
            return getKip();
        case CimPackage.EXC_REXS__KS:
            return getKs();
        case CimPackage.EXC_REXS__KVI:
            return getKvi();
        case CimPackage.EXC_REXS__KVP:
            return getKvp();
        case CimPackage.EXC_REXS__KVPHZ:
            return getKvphz();
        case CimPackage.EXC_REXS__NVPHZ:
            return getNvphz();
        case CimPackage.EXC_REXS__SE1:
            return getSe1();
        case CimPackage.EXC_REXS__SE2:
            return getSe2();
        case CimPackage.EXC_REXS__TA:
            return getTa();
        case CimPackage.EXC_REXS__TB1:
            return getTb1();
        case CimPackage.EXC_REXS__TB2:
            return getTb2();
        case CimPackage.EXC_REXS__TC1:
            return getTc1();
        case CimPackage.EXC_REXS__TC2:
            return getTc2();
        case CimPackage.EXC_REXS__TE:
            return getTe();
        case CimPackage.EXC_REXS__TF:
            return getTf();
        case CimPackage.EXC_REXS__TF1:
            return getTf1();
        case CimPackage.EXC_REXS__TF2:
            return getTf2();
        case CimPackage.EXC_REXS__TP:
            return getTp();
        case CimPackage.EXC_REXS__VCMAX:
            return getVcmax();
        case CimPackage.EXC_REXS__VFMAX:
            return getVfmax();
        case CimPackage.EXC_REXS__VFMIN:
            return getVfmin();
        case CimPackage.EXC_REXS__VIMAX:
            return getVimax();
        case CimPackage.EXC_REXS__VRMAX:
            return getVrmax();
        case CimPackage.EXC_REXS__VRMIN:
            return getVrmin();
        case CimPackage.EXC_REXS__XC:
            return getXc();
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
        case CimPackage.EXC_REXS__E1:
            setE1( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__E2:
            setE2( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__FBF:
            setFbf( ( ExcREXSFeedbackSignalKind ) newValue );
            return;
        case CimPackage.EXC_REXS__FLIMF:
            setFlimf( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KD:
            setKd( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KEFD:
            setKefd( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KH:
            setKh( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KII:
            setKii( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KIP:
            setKip( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KS:
            setKs( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KVI:
            setKvi( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KVP:
            setKvp( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__KVPHZ:
            setKvphz( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__NVPHZ:
            setNvphz( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__SE1:
            setSe1( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__SE2:
            setSe2( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TB1:
            setTb1( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TB2:
            setTb2( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TC1:
            setTc1( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TC2:
            setTc2( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TF1:
            setTf1( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TF2:
            setTf2( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__TP:
            setTp( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VCMAX:
            setVcmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VFMAX:
            setVfmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VFMIN:
            setVfmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VIMAX:
            setVimax( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__VRMIN:
            setVrmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_REXS__XC:
            setXc( ( Float ) newValue );
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
        case CimPackage.EXC_REXS__E1:
            unsetE1();
            return;
        case CimPackage.EXC_REXS__E2:
            unsetE2();
            return;
        case CimPackage.EXC_REXS__FBF:
            unsetFbf();
            return;
        case CimPackage.EXC_REXS__FLIMF:
            unsetFlimf();
            return;
        case CimPackage.EXC_REXS__KC:
            unsetKc();
            return;
        case CimPackage.EXC_REXS__KD:
            unsetKd();
            return;
        case CimPackage.EXC_REXS__KE:
            unsetKe();
            return;
        case CimPackage.EXC_REXS__KEFD:
            unsetKefd();
            return;
        case CimPackage.EXC_REXS__KF:
            unsetKf();
            return;
        case CimPackage.EXC_REXS__KH:
            unsetKh();
            return;
        case CimPackage.EXC_REXS__KII:
            unsetKii();
            return;
        case CimPackage.EXC_REXS__KIP:
            unsetKip();
            return;
        case CimPackage.EXC_REXS__KS:
            unsetKs();
            return;
        case CimPackage.EXC_REXS__KVI:
            unsetKvi();
            return;
        case CimPackage.EXC_REXS__KVP:
            unsetKvp();
            return;
        case CimPackage.EXC_REXS__KVPHZ:
            unsetKvphz();
            return;
        case CimPackage.EXC_REXS__NVPHZ:
            unsetNvphz();
            return;
        case CimPackage.EXC_REXS__SE1:
            unsetSe1();
            return;
        case CimPackage.EXC_REXS__SE2:
            unsetSe2();
            return;
        case CimPackage.EXC_REXS__TA:
            unsetTa();
            return;
        case CimPackage.EXC_REXS__TB1:
            unsetTb1();
            return;
        case CimPackage.EXC_REXS__TB2:
            unsetTb2();
            return;
        case CimPackage.EXC_REXS__TC1:
            unsetTc1();
            return;
        case CimPackage.EXC_REXS__TC2:
            unsetTc2();
            return;
        case CimPackage.EXC_REXS__TE:
            unsetTe();
            return;
        case CimPackage.EXC_REXS__TF:
            unsetTf();
            return;
        case CimPackage.EXC_REXS__TF1:
            unsetTf1();
            return;
        case CimPackage.EXC_REXS__TF2:
            unsetTf2();
            return;
        case CimPackage.EXC_REXS__TP:
            unsetTp();
            return;
        case CimPackage.EXC_REXS__VCMAX:
            unsetVcmax();
            return;
        case CimPackage.EXC_REXS__VFMAX:
            unsetVfmax();
            return;
        case CimPackage.EXC_REXS__VFMIN:
            unsetVfmin();
            return;
        case CimPackage.EXC_REXS__VIMAX:
            unsetVimax();
            return;
        case CimPackage.EXC_REXS__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_REXS__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_REXS__XC:
            unsetXc();
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
        case CimPackage.EXC_REXS__E1:
            return isSetE1();
        case CimPackage.EXC_REXS__E2:
            return isSetE2();
        case CimPackage.EXC_REXS__FBF:
            return isSetFbf();
        case CimPackage.EXC_REXS__FLIMF:
            return isSetFlimf();
        case CimPackage.EXC_REXS__KC:
            return isSetKc();
        case CimPackage.EXC_REXS__KD:
            return isSetKd();
        case CimPackage.EXC_REXS__KE:
            return isSetKe();
        case CimPackage.EXC_REXS__KEFD:
            return isSetKefd();
        case CimPackage.EXC_REXS__KF:
            return isSetKf();
        case CimPackage.EXC_REXS__KH:
            return isSetKh();
        case CimPackage.EXC_REXS__KII:
            return isSetKii();
        case CimPackage.EXC_REXS__KIP:
            return isSetKip();
        case CimPackage.EXC_REXS__KS:
            return isSetKs();
        case CimPackage.EXC_REXS__KVI:
            return isSetKvi();
        case CimPackage.EXC_REXS__KVP:
            return isSetKvp();
        case CimPackage.EXC_REXS__KVPHZ:
            return isSetKvphz();
        case CimPackage.EXC_REXS__NVPHZ:
            return isSetNvphz();
        case CimPackage.EXC_REXS__SE1:
            return isSetSe1();
        case CimPackage.EXC_REXS__SE2:
            return isSetSe2();
        case CimPackage.EXC_REXS__TA:
            return isSetTa();
        case CimPackage.EXC_REXS__TB1:
            return isSetTb1();
        case CimPackage.EXC_REXS__TB2:
            return isSetTb2();
        case CimPackage.EXC_REXS__TC1:
            return isSetTc1();
        case CimPackage.EXC_REXS__TC2:
            return isSetTc2();
        case CimPackage.EXC_REXS__TE:
            return isSetTe();
        case CimPackage.EXC_REXS__TF:
            return isSetTf();
        case CimPackage.EXC_REXS__TF1:
            return isSetTf1();
        case CimPackage.EXC_REXS__TF2:
            return isSetTf2();
        case CimPackage.EXC_REXS__TP:
            return isSetTp();
        case CimPackage.EXC_REXS__VCMAX:
            return isSetVcmax();
        case CimPackage.EXC_REXS__VFMAX:
            return isSetVfmax();
        case CimPackage.EXC_REXS__VFMIN:
            return isSetVfmin();
        case CimPackage.EXC_REXS__VIMAX:
            return isSetVimax();
        case CimPackage.EXC_REXS__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_REXS__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_REXS__XC:
            return isSetXc();
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
        result.append( " (e1: " );
        if( e1ESet )
            result.append( e1 );
        else
            result.append( "<unset>" );
        result.append( ", e2: " );
        if( e2ESet )
            result.append( e2 );
        else
            result.append( "<unset>" );
        result.append( ", fbf: " );
        if( fbfESet )
            result.append( fbf );
        else
            result.append( "<unset>" );
        result.append( ", flimf: " );
        if( flimfESet )
            result.append( flimf );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", kefd: " );
        if( kefdESet )
            result.append( kefd );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", kh: " );
        if( khESet )
            result.append( kh );
        else
            result.append( "<unset>" );
        result.append( ", kii: " );
        if( kiiESet )
            result.append( kii );
        else
            result.append( "<unset>" );
        result.append( ", kip: " );
        if( kipESet )
            result.append( kip );
        else
            result.append( "<unset>" );
        result.append( ", ks: " );
        if( ksESet )
            result.append( ks );
        else
            result.append( "<unset>" );
        result.append( ", kvi: " );
        if( kviESet )
            result.append( kvi );
        else
            result.append( "<unset>" );
        result.append( ", kvp: " );
        if( kvpESet )
            result.append( kvp );
        else
            result.append( "<unset>" );
        result.append( ", kvphz: " );
        if( kvphzESet )
            result.append( kvphz );
        else
            result.append( "<unset>" );
        result.append( ", nvphz: " );
        if( nvphzESet )
            result.append( nvphz );
        else
            result.append( "<unset>" );
        result.append( ", se1: " );
        if( se1ESet )
            result.append( se1 );
        else
            result.append( "<unset>" );
        result.append( ", se2: " );
        if( se2ESet )
            result.append( se2 );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tb1: " );
        if( tb1ESet )
            result.append( tb1 );
        else
            result.append( "<unset>" );
        result.append( ", tb2: " );
        if( tb2ESet )
            result.append( tb2 );
        else
            result.append( "<unset>" );
        result.append( ", tc1: " );
        if( tc1ESet )
            result.append( tc1 );
        else
            result.append( "<unset>" );
        result.append( ", tc2: " );
        if( tc2ESet )
            result.append( tc2 );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tf1: " );
        if( tf1ESet )
            result.append( tf1 );
        else
            result.append( "<unset>" );
        result.append( ", tf2: " );
        if( tf2ESet )
            result.append( tf2 );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", vcmax: " );
        if( vcmaxESet )
            result.append( vcmax );
        else
            result.append( "<unset>" );
        result.append( ", vfmax: " );
        if( vfmaxESet )
            result.append( vfmax );
        else
            result.append( "<unset>" );
        result.append( ", vfmin: " );
        if( vfminESet )
            result.append( vfmin );
        else
            result.append( "<unset>" );
        result.append( ", vimax: " );
        if( vimaxESet )
            result.append( vimax );
        else
            result.append( "<unset>" );
        result.append( ", vrmax: " );
        if( vrmaxESet )
            result.append( vrmax );
        else
            result.append( "<unset>" );
        result.append( ", vrmin: " );
        if( vrminESet )
            result.append( vrmin );
        else
            result.append( "<unset>" );
        result.append( ", xc: " );
        if( xcESet )
            result.append( xc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcREXSImpl
