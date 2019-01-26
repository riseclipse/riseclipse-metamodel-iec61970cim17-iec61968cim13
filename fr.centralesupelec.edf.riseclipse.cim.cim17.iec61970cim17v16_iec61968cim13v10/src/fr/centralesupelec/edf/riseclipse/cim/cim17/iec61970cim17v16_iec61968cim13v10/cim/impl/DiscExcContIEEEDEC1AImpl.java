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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscExcContIEEEDEC1A;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disc Exc Cont IEEEDEC1A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getEsc <em>Esc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getKan <em>Kan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getKetl <em>Ketl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getTan <em>Tan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getTw5 <em>Tw5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVanmax <em>Vanmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVomax <em>Vomax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVomin <em>Vomin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVsmax <em>Vsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVsmin <em>Vsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVtc <em>Vtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVtlmt <em>Vtlmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVtm <em>Vtm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DiscExcContIEEEDEC1AImpl#getVtn <em>Vtn</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscExcContIEEEDEC1AImpl extends DiscontinuousExcitationControlDynamicsImpl
        implements DiscExcContIEEEDEC1A {
    /**
     * The default value of the '{@link #getEsc() <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsc()
     * @generated
     * @ordered
     */
    protected static final Float ESC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEsc() <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsc()
     * @generated
     * @ordered
     */
    protected Float esc = ESC_EDEFAULT;

    /**
     * This is true if the Esc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean escESet;

    /**
     * The default value of the '{@link #getKan() <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKan()
     * @generated
     * @ordered
     */
    protected static final Float KAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKan() <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKan()
     * @generated
     * @ordered
     */
    protected Float kan = KAN_EDEFAULT;

    /**
     * This is true if the Kan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kanESet;

    /**
     * The default value of the '{@link #getKetl() <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetl()
     * @generated
     * @ordered
     */
    protected static final Float KETL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKetl() <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetl()
     * @generated
     * @ordered
     */
    protected Float ketl = KETL_EDEFAULT;

    /**
     * This is true if the Ketl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ketlESet;

    /**
     * The default value of the '{@link #getTan() <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTan()
     * @generated
     * @ordered
     */
    protected static final Float TAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTan() <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTan()
     * @generated
     * @ordered
     */
    protected Float tan = TAN_EDEFAULT;

    /**
     * This is true if the Tan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tanESet;

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
     * The default value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected static final Float TL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected Float tl1 = TL1_EDEFAULT;

    /**
     * This is true if the Tl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl1ESet;

    /**
     * The default value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected static final Float TL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected Float tl2 = TL2_EDEFAULT;

    /**
     * This is true if the Tl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl2ESet;

    /**
     * The default value of the '{@link #getTw5() <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw5()
     * @generated
     * @ordered
     */
    protected static final Float TW5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw5() <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw5()
     * @generated
     * @ordered
     */
    protected Float tw5 = TW5_EDEFAULT;

    /**
     * This is true if the Tw5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw5ESet;

    /**
     * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected static final Float VAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected Float val = VAL_EDEFAULT;

    /**
     * This is true if the Val attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valESet;

    /**
     * The default value of the '{@link #getVanmax() <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVanmax()
     * @generated
     * @ordered
     */
    protected static final Float VANMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVanmax() <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVanmax()
     * @generated
     * @ordered
     */
    protected Float vanmax = VANMAX_EDEFAULT;

    /**
     * This is true if the Vanmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vanmaxESet;

    /**
     * The default value of the '{@link #getVomax() <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomax()
     * @generated
     * @ordered
     */
    protected static final Float VOMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVomax() <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomax()
     * @generated
     * @ordered
     */
    protected Float vomax = VOMAX_EDEFAULT;

    /**
     * This is true if the Vomax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vomaxESet;

    /**
     * The default value of the '{@link #getVomin() <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomin()
     * @generated
     * @ordered
     */
    protected static final Float VOMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVomin() <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomin()
     * @generated
     * @ordered
     */
    protected Float vomin = VOMIN_EDEFAULT;

    /**
     * This is true if the Vomin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vominESet;

    /**
     * The default value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected static final Float VSMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected Float vsmax = VSMAX_EDEFAULT;

    /**
     * This is true if the Vsmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsmaxESet;

    /**
     * The default value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected static final Float VSMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected Float vsmin = VSMIN_EDEFAULT;

    /**
     * This is true if the Vsmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsminESet;

    /**
     * The default value of the '{@link #getVtc() <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtc()
     * @generated
     * @ordered
     */
    protected static final Float VTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtc() <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtc()
     * @generated
     * @ordered
     */
    protected Float vtc = VTC_EDEFAULT;

    /**
     * This is true if the Vtc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtcESet;

    /**
     * The default value of the '{@link #getVtlmt() <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtlmt()
     * @generated
     * @ordered
     */
    protected static final Float VTLMT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtlmt() <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtlmt()
     * @generated
     * @ordered
     */
    protected Float vtlmt = VTLMT_EDEFAULT;

    /**
     * This is true if the Vtlmt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtlmtESet;

    /**
     * The default value of the '{@link #getVtm() <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtm()
     * @generated
     * @ordered
     */
    protected static final Float VTM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtm() <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtm()
     * @generated
     * @ordered
     */
    protected Float vtm = VTM_EDEFAULT;

    /**
     * This is true if the Vtm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtmESet;

    /**
     * The default value of the '{@link #getVtn() <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtn()
     * @generated
     * @ordered
     */
    protected static final Float VTN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtn() <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtn()
     * @generated
     * @ordered
     */
    protected Float vtn = VTN_EDEFAULT;

    /**
     * This is true if the Vtn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtnESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscExcContIEEEDEC1AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEsc() {
        return esc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEsc( Float newEsc ) {
        Float oldEsc = esc;
        esc = newEsc;
        boolean oldEscESet = escESet;
        escESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC, oldEsc, esc, !oldEscESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEsc() {
        Float oldEsc = esc;
        boolean oldEscESet = escESet;
        esc = ESC_EDEFAULT;
        escESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC, oldEsc, ESC_EDEFAULT, oldEscESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEsc() {
        return escESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKan() {
        return kan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKan( Float newKan ) {
        Float oldKan = kan;
        kan = newKan;
        boolean oldKanESet = kanESet;
        kanESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN, oldKan, kan, !oldKanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKan() {
        Float oldKan = kan;
        boolean oldKanESet = kanESet;
        kan = KAN_EDEFAULT;
        kanESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN, oldKan, KAN_EDEFAULT, oldKanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKan() {
        return kanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKetl() {
        return ketl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKetl( Float newKetl ) {
        Float oldKetl = ketl;
        ketl = newKetl;
        boolean oldKetlESet = ketlESet;
        ketlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL, oldKetl, ketl, !oldKetlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKetl() {
        Float oldKetl = ketl;
        boolean oldKetlESet = ketlESet;
        ketl = KETL_EDEFAULT;
        ketlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL, oldKetl, KETL_EDEFAULT, oldKetlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKetl() {
        return ketlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTan() {
        return tan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTan( Float newTan ) {
        Float oldTan = tan;
        tan = newTan;
        boolean oldTanESet = tanESet;
        tanESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN, oldTan, tan, !oldTanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTan() {
        Float oldTan = tan;
        boolean oldTanESet = tanESet;
        tan = TAN_EDEFAULT;
        tanESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN, oldTan, TAN_EDEFAULT, oldTanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTan() {
        return tanESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD, oldTd, td, !oldTdESet ) );
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
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD, oldTd, TD_EDEFAULT, oldTdESet ) );
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
    public Float getTl1() {
        return tl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl1( Float newTl1 ) {
        Float oldTl1 = tl1;
        tl1 = newTl1;
        boolean oldTl1ESet = tl1ESet;
        tl1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1, oldTl1, tl1, !oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl1() {
        Float oldTl1 = tl1;
        boolean oldTl1ESet = tl1ESet;
        tl1 = TL1_EDEFAULT;
        tl1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1, oldTl1, TL1_EDEFAULT, oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl1() {
        return tl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl2() {
        return tl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl2( Float newTl2 ) {
        Float oldTl2 = tl2;
        tl2 = newTl2;
        boolean oldTl2ESet = tl2ESet;
        tl2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2, oldTl2, tl2, !oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl2() {
        Float oldTl2 = tl2;
        boolean oldTl2ESet = tl2ESet;
        tl2 = TL2_EDEFAULT;
        tl2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2, oldTl2, TL2_EDEFAULT, oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl2() {
        return tl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTw5() {
        return tw5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw5( Float newTw5 ) {
        Float oldTw5 = tw5;
        tw5 = newTw5;
        boolean oldTw5ESet = tw5ESet;
        tw5ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5, oldTw5, tw5, !oldTw5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw5() {
        Float oldTw5 = tw5;
        boolean oldTw5ESet = tw5ESet;
        tw5 = TW5_EDEFAULT;
        tw5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5, oldTw5, TW5_EDEFAULT, oldTw5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw5() {
        return tw5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVal() {
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVal( Float newVal ) {
        Float oldVal = val;
        val = newVal;
        boolean oldValESet = valESet;
        valESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL, oldVal, val, !oldValESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVal() {
        Float oldVal = val;
        boolean oldValESet = valESet;
        val = VAL_EDEFAULT;
        valESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL, oldVal, VAL_EDEFAULT, oldValESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVal() {
        return valESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVanmax() {
        return vanmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVanmax( Float newVanmax ) {
        Float oldVanmax = vanmax;
        vanmax = newVanmax;
        boolean oldVanmaxESet = vanmaxESet;
        vanmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX, oldVanmax, vanmax, !oldVanmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVanmax() {
        Float oldVanmax = vanmax;
        boolean oldVanmaxESet = vanmaxESet;
        vanmax = VANMAX_EDEFAULT;
        vanmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX, oldVanmax, VANMAX_EDEFAULT, oldVanmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVanmax() {
        return vanmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVomax() {
        return vomax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVomax( Float newVomax ) {
        Float oldVomax = vomax;
        vomax = newVomax;
        boolean oldVomaxESet = vomaxESet;
        vomaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX, oldVomax, vomax, !oldVomaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVomax() {
        Float oldVomax = vomax;
        boolean oldVomaxESet = vomaxESet;
        vomax = VOMAX_EDEFAULT;
        vomaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX, oldVomax, VOMAX_EDEFAULT, oldVomaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVomax() {
        return vomaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVomin() {
        return vomin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVomin( Float newVomin ) {
        Float oldVomin = vomin;
        vomin = newVomin;
        boolean oldVominESet = vominESet;
        vominESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN, oldVomin, vomin, !oldVominESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVomin() {
        Float oldVomin = vomin;
        boolean oldVominESet = vominESet;
        vomin = VOMIN_EDEFAULT;
        vominESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN, oldVomin, VOMIN_EDEFAULT, oldVominESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVomin() {
        return vominESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVsmax() {
        return vsmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmax( Float newVsmax ) {
        Float oldVsmax = vsmax;
        vsmax = newVsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX, oldVsmax, vsmax, !oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmax() {
        Float oldVsmax = vsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmax = VSMAX_EDEFAULT;
        vsmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX, oldVsmax, VSMAX_EDEFAULT, oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmax() {
        return vsmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVsmin() {
        return vsmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmin( Float newVsmin ) {
        Float oldVsmin = vsmin;
        vsmin = newVsmin;
        boolean oldVsminESet = vsminESet;
        vsminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN, oldVsmin, vsmin, !oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmin() {
        Float oldVsmin = vsmin;
        boolean oldVsminESet = vsminESet;
        vsmin = VSMIN_EDEFAULT;
        vsminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN, oldVsmin, VSMIN_EDEFAULT, oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmin() {
        return vsminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtc() {
        return vtc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtc( Float newVtc ) {
        Float oldVtc = vtc;
        vtc = newVtc;
        boolean oldVtcESet = vtcESet;
        vtcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC, oldVtc, vtc, !oldVtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtc() {
        Float oldVtc = vtc;
        boolean oldVtcESet = vtcESet;
        vtc = VTC_EDEFAULT;
        vtcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC, oldVtc, VTC_EDEFAULT, oldVtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtc() {
        return vtcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtlmt() {
        return vtlmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtlmt( Float newVtlmt ) {
        Float oldVtlmt = vtlmt;
        vtlmt = newVtlmt;
        boolean oldVtlmtESet = vtlmtESet;
        vtlmtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT, oldVtlmt, vtlmt, !oldVtlmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtlmt() {
        Float oldVtlmt = vtlmt;
        boolean oldVtlmtESet = vtlmtESet;
        vtlmt = VTLMT_EDEFAULT;
        vtlmtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT, oldVtlmt, VTLMT_EDEFAULT, oldVtlmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtlmt() {
        return vtlmtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtm() {
        return vtm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtm( Float newVtm ) {
        Float oldVtm = vtm;
        vtm = newVtm;
        boolean oldVtmESet = vtmESet;
        vtmESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM, oldVtm, vtm, !oldVtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtm() {
        Float oldVtm = vtm;
        boolean oldVtmESet = vtmESet;
        vtm = VTM_EDEFAULT;
        vtmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM, oldVtm, VTM_EDEFAULT, oldVtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtm() {
        return vtmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVtn() {
        return vtn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtn( Float newVtn ) {
        Float oldVtn = vtn;
        vtn = newVtn;
        boolean oldVtnESet = vtnESet;
        vtnESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN, oldVtn, vtn, !oldVtnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtn() {
        Float oldVtn = vtn;
        boolean oldVtnESet = vtnESet;
        vtn = VTN_EDEFAULT;
        vtnESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN, oldVtn, VTN_EDEFAULT, oldVtnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtn() {
        return vtnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            return getEsc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            return getKan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            return getKetl();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            return getTan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            return getTd();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            return getTl1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            return getTl2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            return getTw5();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            return getVal();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            return getVanmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            return getVomax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            return getVomin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            return getVsmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            return getVsmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            return getVtc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            return getVtlmt();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            return getVtm();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            return getVtn();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            setEsc( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            setKan( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            setKetl( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            setTan( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            setTd( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            setTl1( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            setTl2( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            setTw5( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            setVal( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            setVanmax( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            setVomax( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            setVomin( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            setVsmax( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            setVsmin( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            setVtc( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            setVtlmt( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            setVtm( ( Float ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            setVtn( ( Float ) newValue );
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            unsetEsc();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            unsetKan();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            unsetKetl();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            unsetTan();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            unsetTd();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            unsetTl1();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            unsetTl2();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            unsetTw5();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            unsetVal();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            unsetVanmax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            unsetVomax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            unsetVomin();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            unsetVsmax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            unsetVsmin();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            unsetVtc();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            unsetVtlmt();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            unsetVtm();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            unsetVtn();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            return isSetEsc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            return isSetKan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            return isSetKetl();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            return isSetTan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            return isSetTd();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            return isSetTl1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            return isSetTl2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            return isSetTw5();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            return isSetVal();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            return isSetVanmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            return isSetVomax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            return isSetVomin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            return isSetVsmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            return isSetVsmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            return isSetVtc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            return isSetVtlmt();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            return isSetVtm();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            return isSetVtn();
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
        result.append( " (esc: " );
        if( escESet )
            result.append( esc );
        else
            result.append( "<unset>" );
        result.append( ", kan: " );
        if( kanESet )
            result.append( kan );
        else
            result.append( "<unset>" );
        result.append( ", ketl: " );
        if( ketlESet )
            result.append( ketl );
        else
            result.append( "<unset>" );
        result.append( ", tan: " );
        if( tanESet )
            result.append( tan );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tl1: " );
        if( tl1ESet )
            result.append( tl1 );
        else
            result.append( "<unset>" );
        result.append( ", tl2: " );
        if( tl2ESet )
            result.append( tl2 );
        else
            result.append( "<unset>" );
        result.append( ", tw5: " );
        if( tw5ESet )
            result.append( tw5 );
        else
            result.append( "<unset>" );
        result.append( ", val: " );
        if( valESet )
            result.append( val );
        else
            result.append( "<unset>" );
        result.append( ", vanmax: " );
        if( vanmaxESet )
            result.append( vanmax );
        else
            result.append( "<unset>" );
        result.append( ", vomax: " );
        if( vomaxESet )
            result.append( vomax );
        else
            result.append( "<unset>" );
        result.append( ", vomin: " );
        if( vominESet )
            result.append( vomin );
        else
            result.append( "<unset>" );
        result.append( ", vsmax: " );
        if( vsmaxESet )
            result.append( vsmax );
        else
            result.append( "<unset>" );
        result.append( ", vsmin: " );
        if( vsminESet )
            result.append( vsmin );
        else
            result.append( "<unset>" );
        result.append( ", vtc: " );
        if( vtcESet )
            result.append( vtc );
        else
            result.append( "<unset>" );
        result.append( ", vtlmt: " );
        if( vtlmtESet )
            result.append( vtlmt );
        else
            result.append( "<unset>" );
        result.append( ", vtm: " );
        if( vtmESet )
            result.append( vtm );
        else
            result.append( "<unset>" );
        result.append( ", vtn: " );
        if( vtnESet )
            result.append( vtn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiscExcContIEEEDEC1AImpl
