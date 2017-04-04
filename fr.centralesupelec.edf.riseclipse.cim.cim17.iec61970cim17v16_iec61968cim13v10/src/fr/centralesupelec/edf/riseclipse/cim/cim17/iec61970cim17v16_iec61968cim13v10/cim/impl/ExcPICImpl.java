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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcPIC;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc PIC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getE1 <em>E1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getE2 <em>E2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getEfdmax <em>Efdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getEfdmin <em>Efdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getSe1 <em>Se1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getSe2 <em>Se2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTa1 <em>Ta1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTa2 <em>Ta2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTa3 <em>Ta3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTa4 <em>Ta4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getVr1 <em>Vr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getVr2 <em>Vr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcPICImpl#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcPICImpl extends ExcitationSystemDynamicsImpl implements ExcPIC {
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
     * The default value of the '{@link #getTa1() <em>Ta1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa1()
     * @generated
     * @ordered
     */
    protected static final Float TA1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa1() <em>Ta1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa1()
     * @generated
     * @ordered
     */
    protected Float ta1 = TA1_EDEFAULT;

    /**
     * This is true if the Ta1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ta1ESet;

    /**
     * The default value of the '{@link #getTa2() <em>Ta2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa2()
     * @generated
     * @ordered
     */
    protected static final Float TA2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa2() <em>Ta2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa2()
     * @generated
     * @ordered
     */
    protected Float ta2 = TA2_EDEFAULT;

    /**
     * This is true if the Ta2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ta2ESet;

    /**
     * The default value of the '{@link #getTa3() <em>Ta3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa3()
     * @generated
     * @ordered
     */
    protected static final Float TA3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa3() <em>Ta3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa3()
     * @generated
     * @ordered
     */
    protected Float ta3 = TA3_EDEFAULT;

    /**
     * This is true if the Ta3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ta3ESet;

    /**
     * The default value of the '{@link #getTa4() <em>Ta4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa4()
     * @generated
     * @ordered
     */
    protected static final Float TA4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa4() <em>Ta4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa4()
     * @generated
     * @ordered
     */
    protected Float ta4 = TA4_EDEFAULT;

    /**
     * This is true if the Ta4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ta4ESet;

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
     * The default value of the '{@link #getVr1() <em>Vr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVr1()
     * @generated
     * @ordered
     */
    protected static final Float VR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVr1() <em>Vr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVr1()
     * @generated
     * @ordered
     */
    protected Float vr1 = VR1_EDEFAULT;

    /**
     * This is true if the Vr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vr1ESet;

    /**
     * The default value of the '{@link #getVr2() <em>Vr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVr2()
     * @generated
     * @ordered
     */
    protected static final Float VR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVr2() <em>Vr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVr2()
     * @generated
     * @ordered
     */
    protected Float vr2 = VR2_EDEFAULT;

    /**
     * This is true if the Vr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vr2ESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcPICImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcPIC();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__E1, oldE1, e1, !oldE1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__E1,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__E2, oldE2, e2, !oldE2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__E2,
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_PIC__EFDMAX, oldEfdmax, efdmax, !oldEfdmaxESet ) );
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
                CimPackage.EXC_PIC__EFDMAX, oldEfdmax, EFDMAX_EDEFAULT, oldEfdmaxESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_PIC__EFDMIN, oldEfdmin, efdmin, !oldEfdminESet ) );
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
                CimPackage.EXC_PIC__EFDMIN, oldEfdmin, EFDMIN_EDEFAULT, oldEfdminESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KA, oldKa, ka, !oldKaESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KA,
                oldKa, KA_EDEFAULT, oldKaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KC, oldKc, kc, !oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KC,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KE, oldKe, ke, !oldKeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KE,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KF, oldKf, kf, !oldKfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KF,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KI, oldKi, ki, !oldKiESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KI,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__KP, oldKp, kp, !oldKpESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__KP,
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__SE1, oldSe1, se1, !oldSe1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__SE1,
                oldSe1, SE1_EDEFAULT, oldSe1ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__SE2, oldSe2, se2, !oldSe2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__SE2,
                oldSe2, SE2_EDEFAULT, oldSe2ESet ) );
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
    public Float getTa1() {
        return ta1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa1( Float newTa1 ) {
        Float oldTa1 = ta1;
        ta1 = newTa1;
        boolean oldTa1ESet = ta1ESet;
        ta1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TA1, oldTa1, ta1, !oldTa1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa1() {
        Float oldTa1 = ta1;
        boolean oldTa1ESet = ta1ESet;
        ta1 = TA1_EDEFAULT;
        ta1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TA1,
                oldTa1, TA1_EDEFAULT, oldTa1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa1() {
        return ta1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa2() {
        return ta2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa2( Float newTa2 ) {
        Float oldTa2 = ta2;
        ta2 = newTa2;
        boolean oldTa2ESet = ta2ESet;
        ta2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TA2, oldTa2, ta2, !oldTa2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa2() {
        Float oldTa2 = ta2;
        boolean oldTa2ESet = ta2ESet;
        ta2 = TA2_EDEFAULT;
        ta2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TA2,
                oldTa2, TA2_EDEFAULT, oldTa2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa2() {
        return ta2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa3() {
        return ta3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa3( Float newTa3 ) {
        Float oldTa3 = ta3;
        ta3 = newTa3;
        boolean oldTa3ESet = ta3ESet;
        ta3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TA3, oldTa3, ta3, !oldTa3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa3() {
        Float oldTa3 = ta3;
        boolean oldTa3ESet = ta3ESet;
        ta3 = TA3_EDEFAULT;
        ta3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TA3,
                oldTa3, TA3_EDEFAULT, oldTa3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa3() {
        return ta3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTa4() {
        return ta4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa4( Float newTa4 ) {
        Float oldTa4 = ta4;
        ta4 = newTa4;
        boolean oldTa4ESet = ta4ESet;
        ta4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TA4, oldTa4, ta4, !oldTa4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa4() {
        Float oldTa4 = ta4;
        boolean oldTa4ESet = ta4ESet;
        ta4 = TA4_EDEFAULT;
        ta4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TA4,
                oldTa4, TA4_EDEFAULT, oldTa4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa4() {
        return ta4ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TE, oldTe, te, !oldTeESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TE,
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TF1, oldTf1, tf1, !oldTf1ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TF1,
                oldTf1, TF1_EDEFAULT, oldTf1ESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__TF2, oldTf2, tf2, !oldTf2ESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__TF2,
                oldTf2, TF2_EDEFAULT, oldTf2ESet ) );
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
    public Float getVr1() {
        return vr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVr1( Float newVr1 ) {
        Float oldVr1 = vr1;
        vr1 = newVr1;
        boolean oldVr1ESet = vr1ESet;
        vr1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__VR1, oldVr1, vr1, !oldVr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVr1() {
        Float oldVr1 = vr1;
        boolean oldVr1ESet = vr1ESet;
        vr1 = VR1_EDEFAULT;
        vr1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__VR1,
                oldVr1, VR1_EDEFAULT, oldVr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVr1() {
        return vr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVr2() {
        return vr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVr2( Float newVr2 ) {
        Float oldVr2 = vr2;
        vr2 = newVr2;
        boolean oldVr2ESet = vr2ESet;
        vr2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__VR2, oldVr2, vr2, !oldVr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVr2() {
        Float oldVr2 = vr2;
        boolean oldVr2ESet = vr2ESet;
        vr2 = VR2_EDEFAULT;
        vr2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_PIC__VR2,
                oldVr2, VR2_EDEFAULT, oldVr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVr2() {
        return vr2ESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__VRMAX,
                oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_PIC__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_PIC__VRMIN,
                oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_PIC__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_PIC__E1:
            return getE1();
        case CimPackage.EXC_PIC__E2:
            return getE2();
        case CimPackage.EXC_PIC__EFDMAX:
            return getEfdmax();
        case CimPackage.EXC_PIC__EFDMIN:
            return getEfdmin();
        case CimPackage.EXC_PIC__KA:
            return getKa();
        case CimPackage.EXC_PIC__KC:
            return getKc();
        case CimPackage.EXC_PIC__KE:
            return getKe();
        case CimPackage.EXC_PIC__KF:
            return getKf();
        case CimPackage.EXC_PIC__KI:
            return getKi();
        case CimPackage.EXC_PIC__KP:
            return getKp();
        case CimPackage.EXC_PIC__SE1:
            return getSe1();
        case CimPackage.EXC_PIC__SE2:
            return getSe2();
        case CimPackage.EXC_PIC__TA1:
            return getTa1();
        case CimPackage.EXC_PIC__TA2:
            return getTa2();
        case CimPackage.EXC_PIC__TA3:
            return getTa3();
        case CimPackage.EXC_PIC__TA4:
            return getTa4();
        case CimPackage.EXC_PIC__TE:
            return getTe();
        case CimPackage.EXC_PIC__TF1:
            return getTf1();
        case CimPackage.EXC_PIC__TF2:
            return getTf2();
        case CimPackage.EXC_PIC__VR1:
            return getVr1();
        case CimPackage.EXC_PIC__VR2:
            return getVr2();
        case CimPackage.EXC_PIC__VRMAX:
            return getVrmax();
        case CimPackage.EXC_PIC__VRMIN:
            return getVrmin();
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
        case CimPackage.EXC_PIC__E1:
            setE1( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__E2:
            setE2( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__EFDMAX:
            setEfdmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__EFDMIN:
            setEfdmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KE:
            setKe( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__KP:
            setKp( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__SE1:
            setSe1( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__SE2:
            setSe2( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TA1:
            setTa1( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TA2:
            setTa2( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TA3:
            setTa3( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TA4:
            setTa4( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TE:
            setTe( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TF1:
            setTf1( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__TF2:
            setTf2( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__VR1:
            setVr1( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__VR2:
            setVr2( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_PIC__VRMIN:
            setVrmin( ( Float ) newValue );
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
        case CimPackage.EXC_PIC__E1:
            unsetE1();
            return;
        case CimPackage.EXC_PIC__E2:
            unsetE2();
            return;
        case CimPackage.EXC_PIC__EFDMAX:
            unsetEfdmax();
            return;
        case CimPackage.EXC_PIC__EFDMIN:
            unsetEfdmin();
            return;
        case CimPackage.EXC_PIC__KA:
            unsetKa();
            return;
        case CimPackage.EXC_PIC__KC:
            unsetKc();
            return;
        case CimPackage.EXC_PIC__KE:
            unsetKe();
            return;
        case CimPackage.EXC_PIC__KF:
            unsetKf();
            return;
        case CimPackage.EXC_PIC__KI:
            unsetKi();
            return;
        case CimPackage.EXC_PIC__KP:
            unsetKp();
            return;
        case CimPackage.EXC_PIC__SE1:
            unsetSe1();
            return;
        case CimPackage.EXC_PIC__SE2:
            unsetSe2();
            return;
        case CimPackage.EXC_PIC__TA1:
            unsetTa1();
            return;
        case CimPackage.EXC_PIC__TA2:
            unsetTa2();
            return;
        case CimPackage.EXC_PIC__TA3:
            unsetTa3();
            return;
        case CimPackage.EXC_PIC__TA4:
            unsetTa4();
            return;
        case CimPackage.EXC_PIC__TE:
            unsetTe();
            return;
        case CimPackage.EXC_PIC__TF1:
            unsetTf1();
            return;
        case CimPackage.EXC_PIC__TF2:
            unsetTf2();
            return;
        case CimPackage.EXC_PIC__VR1:
            unsetVr1();
            return;
        case CimPackage.EXC_PIC__VR2:
            unsetVr2();
            return;
        case CimPackage.EXC_PIC__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_PIC__VRMIN:
            unsetVrmin();
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
        case CimPackage.EXC_PIC__E1:
            return isSetE1();
        case CimPackage.EXC_PIC__E2:
            return isSetE2();
        case CimPackage.EXC_PIC__EFDMAX:
            return isSetEfdmax();
        case CimPackage.EXC_PIC__EFDMIN:
            return isSetEfdmin();
        case CimPackage.EXC_PIC__KA:
            return isSetKa();
        case CimPackage.EXC_PIC__KC:
            return isSetKc();
        case CimPackage.EXC_PIC__KE:
            return isSetKe();
        case CimPackage.EXC_PIC__KF:
            return isSetKf();
        case CimPackage.EXC_PIC__KI:
            return isSetKi();
        case CimPackage.EXC_PIC__KP:
            return isSetKp();
        case CimPackage.EXC_PIC__SE1:
            return isSetSe1();
        case CimPackage.EXC_PIC__SE2:
            return isSetSe2();
        case CimPackage.EXC_PIC__TA1:
            return isSetTa1();
        case CimPackage.EXC_PIC__TA2:
            return isSetTa2();
        case CimPackage.EXC_PIC__TA3:
            return isSetTa3();
        case CimPackage.EXC_PIC__TA4:
            return isSetTa4();
        case CimPackage.EXC_PIC__TE:
            return isSetTe();
        case CimPackage.EXC_PIC__TF1:
            return isSetTf1();
        case CimPackage.EXC_PIC__TF2:
            return isSetTf2();
        case CimPackage.EXC_PIC__VR1:
            return isSetVr1();
        case CimPackage.EXC_PIC__VR2:
            return isSetVr2();
        case CimPackage.EXC_PIC__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_PIC__VRMIN:
            return isSetVrmin();
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
        result.append( ", efdmax: " );
        if( efdmaxESet )
            result.append( efdmax );
        else
            result.append( "<unset>" );
        result.append( ", efdmin: " );
        if( efdminESet )
            result.append( efdmin );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
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
        result.append( ", ta1: " );
        if( ta1ESet )
            result.append( ta1 );
        else
            result.append( "<unset>" );
        result.append( ", ta2: " );
        if( ta2ESet )
            result.append( ta2 );
        else
            result.append( "<unset>" );
        result.append( ", ta3: " );
        if( ta3ESet )
            result.append( ta3 );
        else
            result.append( "<unset>" );
        result.append( ", ta4: " );
        if( ta4ESet )
            result.append( ta4 );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
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
        result.append( ", vr1: " );
        if( vr1ESet )
            result.append( vr1 );
        else
            result.append( "<unset>" );
        result.append( ", vr2: " );
        if( vr2ESet )
            result.append( vr2 );
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
        result.append( ')' );
        return result.toString();
    }

} //ExcPICImpl
