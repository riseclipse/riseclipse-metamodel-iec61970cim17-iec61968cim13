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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST6B;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcST6BOELselectorKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ST6B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getIlr <em>Ilr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKcl <em>Kcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKff <em>Kff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKia <em>Kia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKlr <em>Klr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKpa <em>Kpa</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getKvd <em>Kvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getOelin <em>Oelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getTs <em>Ts</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getTvd <em>Tvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVamax <em>Vamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVamin <em>Vamin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVilim <em>Vilim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVimin <em>Vimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVmult <em>Vmult</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ExcST6BImpl#getXc <em>Xc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcST6BImpl extends ExcitationSystemDynamicsImpl implements ExcST6B {
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
     * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected static final Boolean K1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected Boolean k1 = K1_EDEFAULT;

    /**
     * This is true if the K1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ESet;

    /**
     * The default value of the '{@link #getKcl() <em>Kcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcl()
     * @generated
     * @ordered
     */
    protected static final Float KCL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKcl() <em>Kcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcl()
     * @generated
     * @ordered
     */
    protected Float kcl = KCL_EDEFAULT;

    /**
     * This is true if the Kcl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kclESet;

    /**
     * The default value of the '{@link #getKff() <em>Kff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKff()
     * @generated
     * @ordered
     */
    protected static final Float KFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKff() <em>Kff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKff()
     * @generated
     * @ordered
     */
    protected Float kff = KFF_EDEFAULT;

    /**
     * This is true if the Kff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kffESet;

    /**
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Float KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Float kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getKia() <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKia()
     * @generated
     * @ordered
     */
    protected static final Float KIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKia() <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKia()
     * @generated
     * @ordered
     */
    protected Float kia = KIA_EDEFAULT;

    /**
     * This is true if the Kia attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiaESet;

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
     * The default value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected static final Float KM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected Float km = KM_EDEFAULT;

    /**
     * This is true if the Km attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmESet;

    /**
     * The default value of the '{@link #getKpa() <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpa()
     * @generated
     * @ordered
     */
    protected static final Float KPA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpa() <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpa()
     * @generated
     * @ordered
     */
    protected Float kpa = KPA_EDEFAULT;

    /**
     * This is true if the Kpa attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpaESet;

    /**
     * The default value of the '{@link #getKvd() <em>Kvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvd()
     * @generated
     * @ordered
     */
    protected static final Float KVD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKvd() <em>Kvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvd()
     * @generated
     * @ordered
     */
    protected Float kvd = KVD_EDEFAULT;

    /**
     * This is true if the Kvd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kvdESet;

    /**
     * The default value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected static final ExcST6BOELselectorKind OELIN_EDEFAULT = ExcST6BOELselectorKind.NO_OE_LINPUT;

    /**
     * The cached value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected ExcST6BOELselectorKind oelin = OELIN_EDEFAULT;

    /**
     * This is true if the Oelin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oelinESet;

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
     * The default value of the '{@link #getTs() <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs()
     * @generated
     * @ordered
     */
    protected static final Float TS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs() <em>Ts</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs()
     * @generated
     * @ordered
     */
    protected Float ts = TS_EDEFAULT;

    /**
     * This is true if the Ts attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tsESet;

    /**
     * The default value of the '{@link #getTvd() <em>Tvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvd()
     * @generated
     * @ordered
     */
    protected static final Float TVD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTvd() <em>Tvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTvd()
     * @generated
     * @ordered
     */
    protected Float tvd = TVD_EDEFAULT;

    /**
     * This is true if the Tvd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvdESet;

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
     * The default value of the '{@link #getVilim() <em>Vilim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVilim()
     * @generated
     * @ordered
     */
    protected static final Boolean VILIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVilim() <em>Vilim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVilim()
     * @generated
     * @ordered
     */
    protected Boolean vilim = VILIM_EDEFAULT;

    /**
     * This is true if the Vilim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vilimESet;

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
     * The default value of the '{@link #getVmult() <em>Vmult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmult()
     * @generated
     * @ordered
     */
    protected static final Boolean VMULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmult() <em>Vmult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmult()
     * @generated
     * @ordered
     */
    protected Boolean vmult = VMULT_EDEFAULT;

    /**
     * This is true if the Vmult attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmultESet;

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
    protected ExcST6BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcST6B();
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__ILR, oldIlr, ilr, !oldIlrESet ) );
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
                CimPackage.EXC_ST6B__ILR, oldIlr, ILR_EDEFAULT, oldIlrESet ) );
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
    public Boolean getK1() {
        return k1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1( Boolean newK1 ) {
        Boolean oldK1 = k1;
        k1 = newK1;
        boolean oldK1ESet = k1ESet;
        k1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__K1, oldK1, k1, !oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1() {
        Boolean oldK1 = k1;
        boolean oldK1ESet = k1ESet;
        k1 = K1_EDEFAULT;
        k1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__K1,
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
    public Float getKcl() {
        return kcl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKcl( Float newKcl ) {
        Float oldKcl = kcl;
        kcl = newKcl;
        boolean oldKclESet = kclESet;
        kclESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KCL, oldKcl, kcl, !oldKclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKcl() {
        Float oldKcl = kcl;
        boolean oldKclESet = kclESet;
        kcl = KCL_EDEFAULT;
        kclESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__KCL, oldKcl, KCL_EDEFAULT, oldKclESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKcl() {
        return kclESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKff() {
        return kff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKff( Float newKff ) {
        Float oldKff = kff;
        kff = newKff;
        boolean oldKffESet = kffESet;
        kffESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KFF, oldKff, kff, !oldKffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKff() {
        Float oldKff = kff;
        boolean oldKffESet = kffESet;
        kff = KFF_EDEFAULT;
        kffESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__KFF, oldKff, KFF_EDEFAULT, oldKffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKff() {
        return kffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Float newKg ) {
        Float oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KG, oldKg, kg, !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Float oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__KG,
                oldKg, KG_EDEFAULT, oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKia() {
        return kia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKia( Float newKia ) {
        Float oldKia = kia;
        kia = newKia;
        boolean oldKiaESet = kiaESet;
        kiaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KIA, oldKia, kia, !oldKiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKia() {
        Float oldKia = kia;
        boolean oldKiaESet = kiaESet;
        kia = KIA_EDEFAULT;
        kiaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__KIA, oldKia, KIA_EDEFAULT, oldKiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKia() {
        return kiaESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KLR, oldKlr, klr, !oldKlrESet ) );
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
                CimPackage.EXC_ST6B__KLR, oldKlr, KLR_EDEFAULT, oldKlrESet ) );
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
    public Float getKm() {
        return km;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKm( Float newKm ) {
        Float oldKm = km;
        km = newKm;
        boolean oldKmESet = kmESet;
        kmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KM, oldKm, km, !oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKm() {
        Float oldKm = km;
        boolean oldKmESet = kmESet;
        km = KM_EDEFAULT;
        kmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__KM,
                oldKm, KM_EDEFAULT, oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKm() {
        return kmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpa() {
        return kpa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpa( Float newKpa ) {
        Float oldKpa = kpa;
        kpa = newKpa;
        boolean oldKpaESet = kpaESet;
        kpaESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KPA, oldKpa, kpa, !oldKpaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpa() {
        Float oldKpa = kpa;
        boolean oldKpaESet = kpaESet;
        kpa = KPA_EDEFAULT;
        kpaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__KPA, oldKpa, KPA_EDEFAULT, oldKpaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpa() {
        return kpaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKvd() {
        return kvd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKvd( Float newKvd ) {
        Float oldKvd = kvd;
        kvd = newKvd;
        boolean oldKvdESet = kvdESet;
        kvdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__KVD, oldKvd, kvd, !oldKvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKvd() {
        Float oldKvd = kvd;
        boolean oldKvdESet = kvdESet;
        kvd = KVD_EDEFAULT;
        kvdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__KVD, oldKvd, KVD_EDEFAULT, oldKvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKvd() {
        return kvdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST6BOELselectorKind getOelin() {
        return oelin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOelin( ExcST6BOELselectorKind newOelin ) {
        ExcST6BOELselectorKind oldOelin = oelin;
        oelin = newOelin == null ? OELIN_EDEFAULT : newOelin;
        boolean oldOelinESet = oelinESet;
        oelinESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST6B__OELIN, oldOelin, oelin, !oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOelin() {
        ExcST6BOELselectorKind oldOelin = oelin;
        boolean oldOelinESet = oelinESet;
        oelin = OELIN_EDEFAULT;
        oelinESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__OELIN, oldOelin, OELIN_EDEFAULT, oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOelin() {
        return oelinESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__TG, oldTg, tg, !oldTgESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__TG,
                oldTg, TG_EDEFAULT, oldTgESet ) );
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
    public Float getTs() {
        return ts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs( Float newTs ) {
        Float oldTs = ts;
        ts = newTs;
        boolean oldTsESet = tsESet;
        tsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__TS, oldTs, ts, !oldTsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs() {
        Float oldTs = ts;
        boolean oldTsESet = tsESet;
        ts = TS_EDEFAULT;
        tsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__TS,
                oldTs, TS_EDEFAULT, oldTsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs() {
        return tsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTvd() {
        return tvd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTvd( Float newTvd ) {
        Float oldTvd = tvd;
        tvd = newTvd;
        boolean oldTvdESet = tvdESet;
        tvdESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__TVD, oldTvd, tvd, !oldTvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTvd() {
        Float oldTvd = tvd;
        boolean oldTvdESet = tvdESet;
        tvd = TVD_EDEFAULT;
        tvdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__TVD, oldTvd, TVD_EDEFAULT, oldTvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTvd() {
        return tvdESet;
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
                CimPackage.EXC_ST6B__VAMAX, oldVamax, vamax, !oldVamaxESet ) );
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
                CimPackage.EXC_ST6B__VAMAX, oldVamax, VAMAX_EDEFAULT, oldVamaxESet ) );
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
                CimPackage.EXC_ST6B__VAMIN, oldVamin, vamin, !oldVaminESet ) );
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
                CimPackage.EXC_ST6B__VAMIN, oldVamin, VAMIN_EDEFAULT, oldVaminESet ) );
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
    public Boolean getVilim() {
        return vilim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVilim( Boolean newVilim ) {
        Boolean oldVilim = vilim;
        vilim = newVilim;
        boolean oldVilimESet = vilimESet;
        vilimESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST6B__VILIM, oldVilim, vilim, !oldVilimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVilim() {
        Boolean oldVilim = vilim;
        boolean oldVilimESet = vilimESet;
        vilim = VILIM_EDEFAULT;
        vilimESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__VILIM, oldVilim, VILIM_EDEFAULT, oldVilimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVilim() {
        return vilimESet;
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
                CimPackage.EXC_ST6B__VIMAX, oldVimax, vimax, !oldVimaxESet ) );
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
                CimPackage.EXC_ST6B__VIMAX, oldVimax, VIMAX_EDEFAULT, oldVimaxESet ) );
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
                CimPackage.EXC_ST6B__VIMIN, oldVimin, vimin, !oldViminESet ) );
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
                CimPackage.EXC_ST6B__VIMIN, oldVimin, VIMIN_EDEFAULT, oldViminESet ) );
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
    public Boolean getVmult() {
        return vmult;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmult( Boolean newVmult ) {
        Boolean oldVmult = vmult;
        vmult = newVmult;
        boolean oldVmultESet = vmultESet;
        vmultESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.EXC_ST6B__VMULT, oldVmult, vmult, !oldVmultESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmult() {
        Boolean oldVmult = vmult;
        boolean oldVmultESet = vmultESet;
        vmult = VMULT_EDEFAULT;
        vmultESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.EXC_ST6B__VMULT, oldVmult, VMULT_EDEFAULT, oldVmultESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmult() {
        return vmultESet;
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
                CimPackage.EXC_ST6B__VRMAX, oldVrmax, vrmax, !oldVrmaxESet ) );
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
                CimPackage.EXC_ST6B__VRMAX, oldVrmax, VRMAX_EDEFAULT, oldVrmaxESet ) );
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
                CimPackage.EXC_ST6B__VRMIN, oldVrmin, vrmin, !oldVrminESet ) );
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
                CimPackage.EXC_ST6B__VRMIN, oldVrmin, VRMIN_EDEFAULT, oldVrminESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ST6B__XC, oldXc, xc, !oldXcESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ST6B__XC,
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
        case CimPackage.EXC_ST6B__ILR:
            return getIlr();
        case CimPackage.EXC_ST6B__K1:
            return getK1();
        case CimPackage.EXC_ST6B__KCL:
            return getKcl();
        case CimPackage.EXC_ST6B__KFF:
            return getKff();
        case CimPackage.EXC_ST6B__KG:
            return getKg();
        case CimPackage.EXC_ST6B__KIA:
            return getKia();
        case CimPackage.EXC_ST6B__KLR:
            return getKlr();
        case CimPackage.EXC_ST6B__KM:
            return getKm();
        case CimPackage.EXC_ST6B__KPA:
            return getKpa();
        case CimPackage.EXC_ST6B__KVD:
            return getKvd();
        case CimPackage.EXC_ST6B__OELIN:
            return getOelin();
        case CimPackage.EXC_ST6B__TG:
            return getTg();
        case CimPackage.EXC_ST6B__TS:
            return getTs();
        case CimPackage.EXC_ST6B__TVD:
            return getTvd();
        case CimPackage.EXC_ST6B__VAMAX:
            return getVamax();
        case CimPackage.EXC_ST6B__VAMIN:
            return getVamin();
        case CimPackage.EXC_ST6B__VILIM:
            return getVilim();
        case CimPackage.EXC_ST6B__VIMAX:
            return getVimax();
        case CimPackage.EXC_ST6B__VIMIN:
            return getVimin();
        case CimPackage.EXC_ST6B__VMULT:
            return getVmult();
        case CimPackage.EXC_ST6B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_ST6B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_ST6B__XC:
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
        case CimPackage.EXC_ST6B__ILR:
            setIlr( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__K1:
            setK1( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST6B__KCL:
            setKcl( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KFF:
            setKff( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KG:
            setKg( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KIA:
            setKia( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KLR:
            setKlr( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KM:
            setKm( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KPA:
            setKpa( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__KVD:
            setKvd( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__OELIN:
            setOelin( ( ExcST6BOELselectorKind ) newValue );
            return;
        case CimPackage.EXC_ST6B__TG:
            setTg( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__TS:
            setTs( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__TVD:
            setTvd( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VAMAX:
            setVamax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VAMIN:
            setVamin( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VILIM:
            setVilim( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST6B__VIMAX:
            setVimax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VIMIN:
            setVimin( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VMULT:
            setVmult( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_ST6B__VRMAX:
            setVrmax( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__VRMIN:
            setVrmin( ( Float ) newValue );
            return;
        case CimPackage.EXC_ST6B__XC:
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
        case CimPackage.EXC_ST6B__ILR:
            unsetIlr();
            return;
        case CimPackage.EXC_ST6B__K1:
            unsetK1();
            return;
        case CimPackage.EXC_ST6B__KCL:
            unsetKcl();
            return;
        case CimPackage.EXC_ST6B__KFF:
            unsetKff();
            return;
        case CimPackage.EXC_ST6B__KG:
            unsetKg();
            return;
        case CimPackage.EXC_ST6B__KIA:
            unsetKia();
            return;
        case CimPackage.EXC_ST6B__KLR:
            unsetKlr();
            return;
        case CimPackage.EXC_ST6B__KM:
            unsetKm();
            return;
        case CimPackage.EXC_ST6B__KPA:
            unsetKpa();
            return;
        case CimPackage.EXC_ST6B__KVD:
            unsetKvd();
            return;
        case CimPackage.EXC_ST6B__OELIN:
            unsetOelin();
            return;
        case CimPackage.EXC_ST6B__TG:
            unsetTg();
            return;
        case CimPackage.EXC_ST6B__TS:
            unsetTs();
            return;
        case CimPackage.EXC_ST6B__TVD:
            unsetTvd();
            return;
        case CimPackage.EXC_ST6B__VAMAX:
            unsetVamax();
            return;
        case CimPackage.EXC_ST6B__VAMIN:
            unsetVamin();
            return;
        case CimPackage.EXC_ST6B__VILIM:
            unsetVilim();
            return;
        case CimPackage.EXC_ST6B__VIMAX:
            unsetVimax();
            return;
        case CimPackage.EXC_ST6B__VIMIN:
            unsetVimin();
            return;
        case CimPackage.EXC_ST6B__VMULT:
            unsetVmult();
            return;
        case CimPackage.EXC_ST6B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_ST6B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_ST6B__XC:
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
        case CimPackage.EXC_ST6B__ILR:
            return isSetIlr();
        case CimPackage.EXC_ST6B__K1:
            return isSetK1();
        case CimPackage.EXC_ST6B__KCL:
            return isSetKcl();
        case CimPackage.EXC_ST6B__KFF:
            return isSetKff();
        case CimPackage.EXC_ST6B__KG:
            return isSetKg();
        case CimPackage.EXC_ST6B__KIA:
            return isSetKia();
        case CimPackage.EXC_ST6B__KLR:
            return isSetKlr();
        case CimPackage.EXC_ST6B__KM:
            return isSetKm();
        case CimPackage.EXC_ST6B__KPA:
            return isSetKpa();
        case CimPackage.EXC_ST6B__KVD:
            return isSetKvd();
        case CimPackage.EXC_ST6B__OELIN:
            return isSetOelin();
        case CimPackage.EXC_ST6B__TG:
            return isSetTg();
        case CimPackage.EXC_ST6B__TS:
            return isSetTs();
        case CimPackage.EXC_ST6B__TVD:
            return isSetTvd();
        case CimPackage.EXC_ST6B__VAMAX:
            return isSetVamax();
        case CimPackage.EXC_ST6B__VAMIN:
            return isSetVamin();
        case CimPackage.EXC_ST6B__VILIM:
            return isSetVilim();
        case CimPackage.EXC_ST6B__VIMAX:
            return isSetVimax();
        case CimPackage.EXC_ST6B__VIMIN:
            return isSetVimin();
        case CimPackage.EXC_ST6B__VMULT:
            return isSetVmult();
        case CimPackage.EXC_ST6B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_ST6B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_ST6B__XC:
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
        result.append( " (ilr: " );
        if( ilrESet )
            result.append( ilr );
        else
            result.append( "<unset>" );
        result.append( ", k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", kcl: " );
        if( kclESet )
            result.append( kcl );
        else
            result.append( "<unset>" );
        result.append( ", kff: " );
        if( kffESet )
            result.append( kff );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", kia: " );
        if( kiaESet )
            result.append( kia );
        else
            result.append( "<unset>" );
        result.append( ", klr: " );
        if( klrESet )
            result.append( klr );
        else
            result.append( "<unset>" );
        result.append( ", km: " );
        if( kmESet )
            result.append( km );
        else
            result.append( "<unset>" );
        result.append( ", kpa: " );
        if( kpaESet )
            result.append( kpa );
        else
            result.append( "<unset>" );
        result.append( ", kvd: " );
        if( kvdESet )
            result.append( kvd );
        else
            result.append( "<unset>" );
        result.append( ", oelin: " );
        if( oelinESet )
            result.append( oelin );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", ts: " );
        if( tsESet )
            result.append( ts );
        else
            result.append( "<unset>" );
        result.append( ", tvd: " );
        if( tvdESet )
            result.append( tvd );
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
        result.append( ", vilim: " );
        if( vilimESet )
            result.append( vilim );
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
        result.append( ", vmult: " );
        if( vmultESet )
            result.append( vmult );
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

} //ExcST6BImpl
