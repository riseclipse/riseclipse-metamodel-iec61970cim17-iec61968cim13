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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST1A;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST1AUELselectorKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEST1A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getIlr <em>Ilr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getKlr <em>Klr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getPssin <em>Pssin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTc1 <em>Tc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getUelin <em>Uelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVamax <em>Vamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVamin <em>Vamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVimin <em>Vimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcIEEEST1AImpl#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEST1AImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEST1A {
    /**
     * The default value of the '{@link #getIlr() <em>Ilr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIlr()
     * @generated
     * @ordered
     */
    protected static final Float ILR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIlr() <em>Ilr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIlr()
     * @generated
     * @ordered
     */
    protected Float ilr = ILR_EDEFAULT;

    /**
     * This is true if the Ilr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ilrESet;

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
     * The default value of the '{@link #getKlr() <em>Klr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlr()
     * @generated
     * @ordered
     */
    protected static final Float KLR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKlr() <em>Klr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlr()
     * @generated
     * @ordered
     */
    protected Float klr = KLR_EDEFAULT;

    /**
     * This is true if the Klr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klrESet;

    /**
     * The default value of the '{@link #getPssin() <em>Pssin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPssin()
     * @generated
     * @ordered
     */
    protected static final Boolean PSSIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPssin() <em>Pssin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPssin()
     * @generated
     * @ordered
     */
    protected Boolean pssin = PSSIN_EDEFAULT;

    /**
     * This is true if the Pssin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pssinESet;

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
     * The default value of the '{@link #getUelin() <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUelin()
     * @generated
     * @ordered
     */
    protected static final ExcIEEEST1AUELselectorKind UELIN_EDEFAULT = ExcIEEEST1AUELselectorKind.IGNORE_UE_LSIGNAL;

    /**
     * The cached value of the '{@link #getUelin() <em>Uelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUelin()
     * @generated
     * @ordered
     */
    protected ExcIEEEST1AUELselectorKind uelin = UELIN_EDEFAULT;

    /**
     * This is true if the Uelin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uelinESet;

    /**
     * The default value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected static final Float VAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected Float vamax = VAMAX_EDEFAULT;

    /**
     * This is true if the Vamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vamaxESet;

    /**
     * The default value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected static final Float VAMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected Float vamin = VAMIN_EDEFAULT;

    /**
     * This is true if the Vamin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vaminESet;

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
     * The default value of the '{@link #getVimin() <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimin()
     * @generated
     * @ordered
     */
    protected static final Float VIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVimin() <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVimin()
     * @generated
     * @ordered
     */
    protected Float vimin = VIMIN_EDEFAULT;

    /**
     * This is true if the Vimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean viminESet;

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
    protected ExcIEEEST1AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEST1A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getIlr() {
        return ilr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIlr( Float newIlr ) {
        Float oldIlr = ilr;
        ilr = newIlr;
        boolean oldIlrESet = ilrESet;
        ilrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__ILR, oldIlr, ilr, !oldIlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIlr() {
        Float oldIlr = ilr;
        boolean oldIlrESet = ilrESet;
        ilr = ILR_EDEFAULT;
        ilrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__ILR, oldIlr, ILR_EDEFAULT, oldIlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIlr() {
        return ilrESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__KA, oldKa, ka, !oldKaESet ) );
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
                CimPackage.EXC_IEEEST1A__KA, oldKa, KA_EDEFAULT, oldKaESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__KC, oldKc, kc, !oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__KC, oldKc, KC_EDEFAULT, oldKcESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__KF, oldKf, kf, !oldKfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__KF, oldKf, KF_EDEFAULT, oldKfESet ) );
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
    public Float getKlr() {
        return klr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKlr( Float newKlr ) {
        Float oldKlr = klr;
        klr = newKlr;
        boolean oldKlrESet = klrESet;
        klrESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__KLR, oldKlr, klr, !oldKlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKlr() {
        Float oldKlr = klr;
        boolean oldKlrESet = klrESet;
        klr = KLR_EDEFAULT;
        klrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__KLR, oldKlr, KLR_EDEFAULT, oldKlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKlr() {
        return klrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPssin() {
        return pssin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPssin( Boolean newPssin ) {
        Boolean oldPssin = pssin;
        pssin = newPssin;
        boolean oldPssinESet = pssinESet;
        pssinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__PSSIN, oldPssin, pssin, !oldPssinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPssin() {
        Boolean oldPssin = pssin;
        boolean oldPssinESet = pssinESet;
        pssin = PSSIN_EDEFAULT;
        pssinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__PSSIN, oldPssin, PSSIN_EDEFAULT, oldPssinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPssin() {
        return pssinESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__TA, oldTa, ta, !oldTaESet ) );
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
                CimPackage.EXC_IEEEST1A__TA, oldTa, TA_EDEFAULT, oldTaESet ) );
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
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__TB, oldTb, tb, !oldTbESet ) );
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
                CimPackage.EXC_IEEEST1A__TB, oldTb, TB_EDEFAULT, oldTbESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__TB1, oldTb1, tb1, !oldTb1ESet ) );
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
                CimPackage.EXC_IEEEST1A__TB1, oldTb1, TB1_EDEFAULT, oldTb1ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__TC, oldTc, tc, !oldTcESet ) );
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
                CimPackage.EXC_IEEEST1A__TC, oldTc, TC_EDEFAULT, oldTcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__TC1, oldTc1, tc1, !oldTc1ESet ) );
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
                CimPackage.EXC_IEEEST1A__TC1, oldTc1, TC1_EDEFAULT, oldTc1ESet ) );
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST1A__TF, oldTf, tf, !oldTfESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__TF, oldTf, TF_EDEFAULT, oldTfESet ) );
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
    public ExcIEEEST1AUELselectorKind getUelin() {
        return uelin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUelin( ExcIEEEST1AUELselectorKind newUelin ) {
        ExcIEEEST1AUELselectorKind oldUelin = uelin;
        uelin = newUelin == null ? UELIN_EDEFAULT : newUelin;
        boolean oldUelinESet = uelinESet;
        uelinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__UELIN, oldUelin, uelin, !oldUelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUelin() {
        ExcIEEEST1AUELselectorKind oldUelin = uelin;
        boolean oldUelinESet = uelinESet;
        uelin = UELIN_EDEFAULT;
        uelinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__UELIN, oldUelin, UELIN_EDEFAULT, oldUelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUelin() {
        return uelinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVamax() {
        return vamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamax( Float newVamax ) {
        Float oldVamax = vamax;
        vamax = newVamax;
        boolean oldVamaxESet = vamaxESet;
        vamaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__VAMAX, oldVamax, vamax, !oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamax() {
        Float oldVamax = vamax;
        boolean oldVamaxESet = vamaxESet;
        vamax = VAMAX_EDEFAULT;
        vamaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__VAMAX, oldVamax, VAMAX_EDEFAULT, oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamax() {
        return vamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVamin() {
        return vamin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamin( Float newVamin ) {
        Float oldVamin = vamin;
        vamin = newVamin;
        boolean oldVaminESet = vaminESet;
        vaminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__VAMIN, oldVamin, vamin, !oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamin() {
        Float oldVamin = vamin;
        boolean oldVaminESet = vaminESet;
        vamin = VAMIN_EDEFAULT;
        vaminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__VAMIN, oldVamin, VAMIN_EDEFAULT, oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamin() {
        return vaminESet;
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
                CimPackage.EXC_IEEEST1A__VIMAX, oldVimax, vimax, !oldVimaxESet ) );
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
                CimPackage.EXC_IEEEST1A__VIMAX, oldVimax, VIMAX_EDEFAULT, oldVimaxESet ) );
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
    public Float getVimin() {
        return vimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVimin( Float newVimin ) {
        Float oldVimin = vimin;
        vimin = newVimin;
        boolean oldViminESet = viminESet;
        viminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_IEEEST1A__VIMIN, oldVimin, vimin, !oldViminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVimin() {
        Float oldVimin = vimin;
        boolean oldViminESet = viminESet;
        vimin = VIMIN_EDEFAULT;
        viminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_IEEEST1A__VIMIN, oldVimin, VIMIN_EDEFAULT, oldViminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVimin() {
        return viminESet;
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
                CimPackage.EXC_IEEEST1A__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_IEEEST1A__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
                CimPackage.EXC_IEEEST1A__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_IEEEST1A__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
        case CimPackage.EXC_IEEEST1A__ILR:
            return getIlr();
        case CimPackage.EXC_IEEEST1A__KA:
            return getKa();
        case CimPackage.EXC_IEEEST1A__KC:
            return getKc();
        case CimPackage.EXC_IEEEST1A__KF:
            return getKf();
        case CimPackage.EXC_IEEEST1A__KLR:
            return getKlr();
        case CimPackage.EXC_IEEEST1A__PSSIN:
            return getPssin();
        case CimPackage.EXC_IEEEST1A__TA:
            return getTa();
        case CimPackage.EXC_IEEEST1A__TB:
            return getTb();
        case CimPackage.EXC_IEEEST1A__TB1:
            return getTb1();
        case CimPackage.EXC_IEEEST1A__TC:
            return getTc();
        case CimPackage.EXC_IEEEST1A__TC1:
            return getTc1();
        case CimPackage.EXC_IEEEST1A__TF:
            return getTf();
        case CimPackage.EXC_IEEEST1A__UELIN:
            return getUelin();
        case CimPackage.EXC_IEEEST1A__VAMAX:
            return getVamax();
        case CimPackage.EXC_IEEEST1A__VAMIN:
            return getVamin();
        case CimPackage.EXC_IEEEST1A__VIMAX:
            return getVimax();
        case CimPackage.EXC_IEEEST1A__VIMIN:
            return getVimin();
        case CimPackage.EXC_IEEEST1A__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEST1A__VRMIN:
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
        case CimPackage.EXC_IEEEST1A__ILR:
            setIlr( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__KA:
            setKa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__KC:
            setKc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__KF:
            setKf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__KLR:
            setKlr( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__PSSIN:
            setPssin( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TA:
            setTa( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TB:
            setTb( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TB1:
            setTb1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TC:
            setTc( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TC1:
            setTc1( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__TF:
            setTf( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__UELIN:
            setUelin( ( ExcIEEEST1AUELselectorKind ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VAMAX:
            setVamax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VAMIN:
            setVamin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VIMAX:
            setVimax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VIMIN:
            setVimin( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_IEEEST1A__VRMIN:
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
        case CimPackage.EXC_IEEEST1A__ILR:
            unsetIlr();
            return;
        case CimPackage.EXC_IEEEST1A__KA:
            unsetKa();
            return;
        case CimPackage.EXC_IEEEST1A__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEST1A__KF:
            unsetKf();
            return;
        case CimPackage.EXC_IEEEST1A__KLR:
            unsetKlr();
            return;
        case CimPackage.EXC_IEEEST1A__PSSIN:
            unsetPssin();
            return;
        case CimPackage.EXC_IEEEST1A__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEST1A__TB:
            unsetTb();
            return;
        case CimPackage.EXC_IEEEST1A__TB1:
            unsetTb1();
            return;
        case CimPackage.EXC_IEEEST1A__TC:
            unsetTc();
            return;
        case CimPackage.EXC_IEEEST1A__TC1:
            unsetTc1();
            return;
        case CimPackage.EXC_IEEEST1A__TF:
            unsetTf();
            return;
        case CimPackage.EXC_IEEEST1A__UELIN:
            unsetUelin();
            return;
        case CimPackage.EXC_IEEEST1A__VAMAX:
            unsetVamax();
            return;
        case CimPackage.EXC_IEEEST1A__VAMIN:
            unsetVamin();
            return;
        case CimPackage.EXC_IEEEST1A__VIMAX:
            unsetVimax();
            return;
        case CimPackage.EXC_IEEEST1A__VIMIN:
            unsetVimin();
            return;
        case CimPackage.EXC_IEEEST1A__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEST1A__VRMIN:
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
        case CimPackage.EXC_IEEEST1A__ILR:
            return isSetIlr();
        case CimPackage.EXC_IEEEST1A__KA:
            return isSetKa();
        case CimPackage.EXC_IEEEST1A__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEST1A__KF:
            return isSetKf();
        case CimPackage.EXC_IEEEST1A__KLR:
            return isSetKlr();
        case CimPackage.EXC_IEEEST1A__PSSIN:
            return isSetPssin();
        case CimPackage.EXC_IEEEST1A__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEST1A__TB:
            return isSetTb();
        case CimPackage.EXC_IEEEST1A__TB1:
            return isSetTb1();
        case CimPackage.EXC_IEEEST1A__TC:
            return isSetTc();
        case CimPackage.EXC_IEEEST1A__TC1:
            return isSetTc1();
        case CimPackage.EXC_IEEEST1A__TF:
            return isSetTf();
        case CimPackage.EXC_IEEEST1A__UELIN:
            return isSetUelin();
        case CimPackage.EXC_IEEEST1A__VAMAX:
            return isSetVamax();
        case CimPackage.EXC_IEEEST1A__VAMIN:
            return isSetVamin();
        case CimPackage.EXC_IEEEST1A__VIMAX:
            return isSetVimax();
        case CimPackage.EXC_IEEEST1A__VIMIN:
            return isSetVimin();
        case CimPackage.EXC_IEEEST1A__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEST1A__VRMIN:
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
        result.append( " (ilr: " );
        if( ilrESet )
            result.append( ilr );
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
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", klr: " );
        if( klrESet )
            result.append( klr );
        else
            result.append( "<unset>" );
        result.append( ", pssin: " );
        if( pssinESet )
            result.append( pssin );
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
        result.append( ", tb1: " );
        if( tb1ESet )
            result.append( tb1 );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", tc1: " );
        if( tc1ESet )
            result.append( tc1 );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", uelin: " );
        if( uelinESet )
            result.append( uelin );
        else
            result.append( "<unset>" );
        result.append( ", vamax: " );
        if( vamaxESet )
            result.append( vamax );
        else
            result.append( "<unset>" );
        result.append( ", vamin: " );
        if( vaminESet )
            result.append( vamin );
        else
            result.append( "<unset>" );
        result.append( ", vimax: " );
        if( vimaxESet )
            result.append( vimax );
        else
            result.append( "<unset>" );
        result.append( ", vimin: " );
        if( viminESet )
            result.append( vimin );
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

} //ExcIEEEST1AImpl
