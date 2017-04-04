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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PssIEEE4B;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss IEEE4B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getBwh1 <em>Bwh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getBwh2 <em>Bwh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getBwl1 <em>Bwl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getBwl2 <em>Bwl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKh <em>Kh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKh1 <em>Kh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKh11 <em>Kh11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKh17 <em>Kh17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKh2 <em>Kh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKi1 <em>Ki1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKi11 <em>Ki11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKi17 <em>Ki17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKi2 <em>Ki2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKl <em>Kl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKl1 <em>Kl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKl11 <em>Kl11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKl17 <em>Kl17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getKl2 <em>Kl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getOmeganh1 <em>Omeganh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getOmeganh2 <em>Omeganh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getOmeganl1 <em>Omeganl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getOmeganl2 <em>Omeganl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh1 <em>Th1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh10 <em>Th10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh11 <em>Th11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh12 <em>Th12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh2 <em>Th2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh3 <em>Th3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh4 <em>Th4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh5 <em>Th5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh6 <em>Th6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh7 <em>Th7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh8 <em>Th8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTh9 <em>Th9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi1 <em>Ti1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi10 <em>Ti10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi11 <em>Ti11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi12 <em>Ti12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi2 <em>Ti2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi3 <em>Ti3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi4 <em>Ti4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi5 <em>Ti5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi6 <em>Ti6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi7 <em>Ti7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi8 <em>Ti8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTi9 <em>Ti9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl10 <em>Tl10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl11 <em>Tl11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl12 <em>Tl12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl3 <em>Tl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl4 <em>Tl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl5 <em>Tl5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl6 <em>Tl6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl7 <em>Tl7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl8 <em>Tl8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getTl9 <em>Tl9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVhmax <em>Vhmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVhmin <em>Vhmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVimin <em>Vimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVlmax <em>Vlmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVlmin <em>Vlmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PssIEEE4BImpl#getVstmin <em>Vstmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssIEEE4BImpl extends PowerSystemStabilizerDynamicsImpl implements PssIEEE4B {
    /**
     * The default value of the '{@link #getBwh1() <em>Bwh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwh1()
     * @generated
     * @ordered
     */
    protected static final Float BWH1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBwh1() <em>Bwh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwh1()
     * @generated
     * @ordered
     */
    protected Float bwh1 = BWH1_EDEFAULT;

    /**
     * This is true if the Bwh1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bwh1ESet;

    /**
     * The default value of the '{@link #getBwh2() <em>Bwh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwh2()
     * @generated
     * @ordered
     */
    protected static final Float BWH2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBwh2() <em>Bwh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwh2()
     * @generated
     * @ordered
     */
    protected Float bwh2 = BWH2_EDEFAULT;

    /**
     * This is true if the Bwh2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bwh2ESet;

    /**
     * The default value of the '{@link #getBwl1() <em>Bwl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwl1()
     * @generated
     * @ordered
     */
    protected static final Float BWL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBwl1() <em>Bwl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwl1()
     * @generated
     * @ordered
     */
    protected Float bwl1 = BWL1_EDEFAULT;

    /**
     * This is true if the Bwl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bwl1ESet;

    /**
     * The default value of the '{@link #getBwl2() <em>Bwl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwl2()
     * @generated
     * @ordered
     */
    protected static final Float BWL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBwl2() <em>Bwl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBwl2()
     * @generated
     * @ordered
     */
    protected Float bwl2 = BWL2_EDEFAULT;

    /**
     * This is true if the Bwl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bwl2ESet;

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
     * The default value of the '{@link #getKh1() <em>Kh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh1()
     * @generated
     * @ordered
     */
    protected static final Float KH1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKh1() <em>Kh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh1()
     * @generated
     * @ordered
     */
    protected Float kh1 = KH1_EDEFAULT;

    /**
     * This is true if the Kh1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kh1ESet;

    /**
     * The default value of the '{@link #getKh11() <em>Kh11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh11()
     * @generated
     * @ordered
     */
    protected static final Float KH11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKh11() <em>Kh11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh11()
     * @generated
     * @ordered
     */
    protected Float kh11 = KH11_EDEFAULT;

    /**
     * This is true if the Kh11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kh11ESet;

    /**
     * The default value of the '{@link #getKh17() <em>Kh17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh17()
     * @generated
     * @ordered
     */
    protected static final Float KH17_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKh17() <em>Kh17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh17()
     * @generated
     * @ordered
     */
    protected Float kh17 = KH17_EDEFAULT;

    /**
     * This is true if the Kh17 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kh17ESet;

    /**
     * The default value of the '{@link #getKh2() <em>Kh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh2()
     * @generated
     * @ordered
     */
    protected static final Float KH2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKh2() <em>Kh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKh2()
     * @generated
     * @ordered
     */
    protected Float kh2 = KH2_EDEFAULT;

    /**
     * This is true if the Kh2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kh2ESet;

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
     * The default value of the '{@link #getKi1() <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi1()
     * @generated
     * @ordered
     */
    protected static final Float KI1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi1() <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi1()
     * @generated
     * @ordered
     */
    protected Float ki1 = KI1_EDEFAULT;

    /**
     * This is true if the Ki1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki1ESet;

    /**
     * The default value of the '{@link #getKi11() <em>Ki11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi11()
     * @generated
     * @ordered
     */
    protected static final Float KI11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi11() <em>Ki11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi11()
     * @generated
     * @ordered
     */
    protected Float ki11 = KI11_EDEFAULT;

    /**
     * This is true if the Ki11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki11ESet;

    /**
     * The default value of the '{@link #getKi17() <em>Ki17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi17()
     * @generated
     * @ordered
     */
    protected static final Float KI17_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi17() <em>Ki17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi17()
     * @generated
     * @ordered
     */
    protected Float ki17 = KI17_EDEFAULT;

    /**
     * This is true if the Ki17 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki17ESet;

    /**
     * The default value of the '{@link #getKi2() <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi2()
     * @generated
     * @ordered
     */
    protected static final Float KI2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi2() <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi2()
     * @generated
     * @ordered
     */
    protected Float ki2 = KI2_EDEFAULT;

    /**
     * This is true if the Ki2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki2ESet;

    /**
     * The default value of the '{@link #getKl() <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl()
     * @generated
     * @ordered
     */
    protected static final Float KL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKl() <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl()
     * @generated
     * @ordered
     */
    protected Float kl = KL_EDEFAULT;

    /**
     * This is true if the Kl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klESet;

    /**
     * The default value of the '{@link #getKl1() <em>Kl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl1()
     * @generated
     * @ordered
     */
    protected static final Float KL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKl1() <em>Kl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl1()
     * @generated
     * @ordered
     */
    protected Float kl1 = KL1_EDEFAULT;

    /**
     * This is true if the Kl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kl1ESet;

    /**
     * The default value of the '{@link #getKl11() <em>Kl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl11()
     * @generated
     * @ordered
     */
    protected static final Float KL11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKl11() <em>Kl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl11()
     * @generated
     * @ordered
     */
    protected Float kl11 = KL11_EDEFAULT;

    /**
     * This is true if the Kl11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kl11ESet;

    /**
     * The default value of the '{@link #getKl17() <em>Kl17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl17()
     * @generated
     * @ordered
     */
    protected static final Float KL17_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKl17() <em>Kl17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl17()
     * @generated
     * @ordered
     */
    protected Float kl17 = KL17_EDEFAULT;

    /**
     * This is true if the Kl17 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kl17ESet;

    /**
     * The default value of the '{@link #getKl2() <em>Kl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl2()
     * @generated
     * @ordered
     */
    protected static final Float KL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKl2() <em>Kl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKl2()
     * @generated
     * @ordered
     */
    protected Float kl2 = KL2_EDEFAULT;

    /**
     * This is true if the Kl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kl2ESet;

    /**
     * The default value of the '{@link #getOmeganh1() <em>Omeganh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganh1()
     * @generated
     * @ordered
     */
    protected static final Float OMEGANH1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmeganh1() <em>Omeganh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganh1()
     * @generated
     * @ordered
     */
    protected Float omeganh1 = OMEGANH1_EDEFAULT;

    /**
     * This is true if the Omeganh1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omeganh1ESet;

    /**
     * The default value of the '{@link #getOmeganh2() <em>Omeganh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganh2()
     * @generated
     * @ordered
     */
    protected static final Float OMEGANH2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmeganh2() <em>Omeganh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganh2()
     * @generated
     * @ordered
     */
    protected Float omeganh2 = OMEGANH2_EDEFAULT;

    /**
     * This is true if the Omeganh2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omeganh2ESet;

    /**
     * The default value of the '{@link #getOmeganl1() <em>Omeganl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganl1()
     * @generated
     * @ordered
     */
    protected static final Float OMEGANL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmeganl1() <em>Omeganl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganl1()
     * @generated
     * @ordered
     */
    protected Float omeganl1 = OMEGANL1_EDEFAULT;

    /**
     * This is true if the Omeganl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omeganl1ESet;

    /**
     * The default value of the '{@link #getOmeganl2() <em>Omeganl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganl2()
     * @generated
     * @ordered
     */
    protected static final Float OMEGANL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmeganl2() <em>Omeganl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmeganl2()
     * @generated
     * @ordered
     */
    protected Float omeganl2 = OMEGANL2_EDEFAULT;

    /**
     * This is true if the Omeganl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omeganl2ESet;

    /**
     * The default value of the '{@link #getTh1() <em>Th1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh1()
     * @generated
     * @ordered
     */
    protected static final Float TH1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh1() <em>Th1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh1()
     * @generated
     * @ordered
     */
    protected Float th1 = TH1_EDEFAULT;

    /**
     * This is true if the Th1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th1ESet;

    /**
     * The default value of the '{@link #getTh10() <em>Th10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh10()
     * @generated
     * @ordered
     */
    protected static final Float TH10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh10() <em>Th10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh10()
     * @generated
     * @ordered
     */
    protected Float th10 = TH10_EDEFAULT;

    /**
     * This is true if the Th10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th10ESet;

    /**
     * The default value of the '{@link #getTh11() <em>Th11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh11()
     * @generated
     * @ordered
     */
    protected static final Float TH11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh11() <em>Th11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh11()
     * @generated
     * @ordered
     */
    protected Float th11 = TH11_EDEFAULT;

    /**
     * This is true if the Th11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th11ESet;

    /**
     * The default value of the '{@link #getTh12() <em>Th12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh12()
     * @generated
     * @ordered
     */
    protected static final Float TH12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh12() <em>Th12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh12()
     * @generated
     * @ordered
     */
    protected Float th12 = TH12_EDEFAULT;

    /**
     * This is true if the Th12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th12ESet;

    /**
     * The default value of the '{@link #getTh2() <em>Th2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh2()
     * @generated
     * @ordered
     */
    protected static final Float TH2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh2() <em>Th2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh2()
     * @generated
     * @ordered
     */
    protected Float th2 = TH2_EDEFAULT;

    /**
     * This is true if the Th2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th2ESet;

    /**
     * The default value of the '{@link #getTh3() <em>Th3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh3()
     * @generated
     * @ordered
     */
    protected static final Float TH3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh3() <em>Th3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh3()
     * @generated
     * @ordered
     */
    protected Float th3 = TH3_EDEFAULT;

    /**
     * This is true if the Th3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th3ESet;

    /**
     * The default value of the '{@link #getTh4() <em>Th4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh4()
     * @generated
     * @ordered
     */
    protected static final Float TH4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh4() <em>Th4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh4()
     * @generated
     * @ordered
     */
    protected Float th4 = TH4_EDEFAULT;

    /**
     * This is true if the Th4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th4ESet;

    /**
     * The default value of the '{@link #getTh5() <em>Th5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh5()
     * @generated
     * @ordered
     */
    protected static final Float TH5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh5() <em>Th5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh5()
     * @generated
     * @ordered
     */
    protected Float th5 = TH5_EDEFAULT;

    /**
     * This is true if the Th5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th5ESet;

    /**
     * The default value of the '{@link #getTh6() <em>Th6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh6()
     * @generated
     * @ordered
     */
    protected static final Float TH6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh6() <em>Th6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh6()
     * @generated
     * @ordered
     */
    protected Float th6 = TH6_EDEFAULT;

    /**
     * This is true if the Th6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th6ESet;

    /**
     * The default value of the '{@link #getTh7() <em>Th7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh7()
     * @generated
     * @ordered
     */
    protected static final Float TH7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh7() <em>Th7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh7()
     * @generated
     * @ordered
     */
    protected Float th7 = TH7_EDEFAULT;

    /**
     * This is true if the Th7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th7ESet;

    /**
     * The default value of the '{@link #getTh8() <em>Th8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh8()
     * @generated
     * @ordered
     */
    protected static final Float TH8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh8() <em>Th8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh8()
     * @generated
     * @ordered
     */
    protected Float th8 = TH8_EDEFAULT;

    /**
     * This is true if the Th8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th8ESet;

    /**
     * The default value of the '{@link #getTh9() <em>Th9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh9()
     * @generated
     * @ordered
     */
    protected static final Float TH9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTh9() <em>Th9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTh9()
     * @generated
     * @ordered
     */
    protected Float th9 = TH9_EDEFAULT;

    /**
     * This is true if the Th9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean th9ESet;

    /**
     * The default value of the '{@link #getTi1() <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi1()
     * @generated
     * @ordered
     */
    protected static final Float TI1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi1() <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi1()
     * @generated
     * @ordered
     */
    protected Float ti1 = TI1_EDEFAULT;

    /**
     * This is true if the Ti1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti1ESet;

    /**
     * The default value of the '{@link #getTi10() <em>Ti10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi10()
     * @generated
     * @ordered
     */
    protected static final Float TI10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi10() <em>Ti10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi10()
     * @generated
     * @ordered
     */
    protected Float ti10 = TI10_EDEFAULT;

    /**
     * This is true if the Ti10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti10ESet;

    /**
     * The default value of the '{@link #getTi11() <em>Ti11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi11()
     * @generated
     * @ordered
     */
    protected static final Float TI11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi11() <em>Ti11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi11()
     * @generated
     * @ordered
     */
    protected Float ti11 = TI11_EDEFAULT;

    /**
     * This is true if the Ti11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti11ESet;

    /**
     * The default value of the '{@link #getTi12() <em>Ti12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi12()
     * @generated
     * @ordered
     */
    protected static final Float TI12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi12() <em>Ti12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi12()
     * @generated
     * @ordered
     */
    protected Float ti12 = TI12_EDEFAULT;

    /**
     * This is true if the Ti12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti12ESet;

    /**
     * The default value of the '{@link #getTi2() <em>Ti2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi2()
     * @generated
     * @ordered
     */
    protected static final Float TI2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi2() <em>Ti2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi2()
     * @generated
     * @ordered
     */
    protected Float ti2 = TI2_EDEFAULT;

    /**
     * This is true if the Ti2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti2ESet;

    /**
     * The default value of the '{@link #getTi3() <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi3()
     * @generated
     * @ordered
     */
    protected static final Float TI3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi3() <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi3()
     * @generated
     * @ordered
     */
    protected Float ti3 = TI3_EDEFAULT;

    /**
     * This is true if the Ti3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti3ESet;

    /**
     * The default value of the '{@link #getTi4() <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi4()
     * @generated
     * @ordered
     */
    protected static final Float TI4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi4() <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi4()
     * @generated
     * @ordered
     */
    protected Float ti4 = TI4_EDEFAULT;

    /**
     * This is true if the Ti4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti4ESet;

    /**
     * The default value of the '{@link #getTi5() <em>Ti5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi5()
     * @generated
     * @ordered
     */
    protected static final Float TI5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi5() <em>Ti5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi5()
     * @generated
     * @ordered
     */
    protected Float ti5 = TI5_EDEFAULT;

    /**
     * This is true if the Ti5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti5ESet;

    /**
     * The default value of the '{@link #getTi6() <em>Ti6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi6()
     * @generated
     * @ordered
     */
    protected static final Float TI6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi6() <em>Ti6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi6()
     * @generated
     * @ordered
     */
    protected Float ti6 = TI6_EDEFAULT;

    /**
     * This is true if the Ti6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti6ESet;

    /**
     * The default value of the '{@link #getTi7() <em>Ti7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi7()
     * @generated
     * @ordered
     */
    protected static final Float TI7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi7() <em>Ti7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi7()
     * @generated
     * @ordered
     */
    protected Float ti7 = TI7_EDEFAULT;

    /**
     * This is true if the Ti7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti7ESet;

    /**
     * The default value of the '{@link #getTi8() <em>Ti8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi8()
     * @generated
     * @ordered
     */
    protected static final Float TI8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi8() <em>Ti8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi8()
     * @generated
     * @ordered
     */
    protected Float ti8 = TI8_EDEFAULT;

    /**
     * This is true if the Ti8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti8ESet;

    /**
     * The default value of the '{@link #getTi9() <em>Ti9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi9()
     * @generated
     * @ordered
     */
    protected static final Float TI9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi9() <em>Ti9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi9()
     * @generated
     * @ordered
     */
    protected Float ti9 = TI9_EDEFAULT;

    /**
     * This is true if the Ti9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ti9ESet;

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
     * The default value of the '{@link #getTl10() <em>Tl10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl10()
     * @generated
     * @ordered
     */
    protected static final Float TL10_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl10() <em>Tl10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl10()
     * @generated
     * @ordered
     */
    protected Float tl10 = TL10_EDEFAULT;

    /**
     * This is true if the Tl10 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl10ESet;

    /**
     * The default value of the '{@link #getTl11() <em>Tl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl11()
     * @generated
     * @ordered
     */
    protected static final Float TL11_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl11() <em>Tl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl11()
     * @generated
     * @ordered
     */
    protected Float tl11 = TL11_EDEFAULT;

    /**
     * This is true if the Tl11 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl11ESet;

    /**
     * The default value of the '{@link #getTl12() <em>Tl12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl12()
     * @generated
     * @ordered
     */
    protected static final Float TL12_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl12() <em>Tl12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl12()
     * @generated
     * @ordered
     */
    protected Float tl12 = TL12_EDEFAULT;

    /**
     * This is true if the Tl12 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl12ESet;

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
     * The default value of the '{@link #getTl3() <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl3()
     * @generated
     * @ordered
     */
    protected static final Float TL3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl3() <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl3()
     * @generated
     * @ordered
     */
    protected Float tl3 = TL3_EDEFAULT;

    /**
     * This is true if the Tl3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl3ESet;

    /**
     * The default value of the '{@link #getTl4() <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl4()
     * @generated
     * @ordered
     */
    protected static final Float TL4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl4() <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl4()
     * @generated
     * @ordered
     */
    protected Float tl4 = TL4_EDEFAULT;

    /**
     * This is true if the Tl4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl4ESet;

    /**
     * The default value of the '{@link #getTl5() <em>Tl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl5()
     * @generated
     * @ordered
     */
    protected static final Float TL5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl5() <em>Tl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl5()
     * @generated
     * @ordered
     */
    protected Float tl5 = TL5_EDEFAULT;

    /**
     * This is true if the Tl5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl5ESet;

    /**
     * The default value of the '{@link #getTl6() <em>Tl6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl6()
     * @generated
     * @ordered
     */
    protected static final Float TL6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl6() <em>Tl6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl6()
     * @generated
     * @ordered
     */
    protected Float tl6 = TL6_EDEFAULT;

    /**
     * This is true if the Tl6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl6ESet;

    /**
     * The default value of the '{@link #getTl7() <em>Tl7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl7()
     * @generated
     * @ordered
     */
    protected static final Float TL7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl7() <em>Tl7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl7()
     * @generated
     * @ordered
     */
    protected Float tl7 = TL7_EDEFAULT;

    /**
     * This is true if the Tl7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl7ESet;

    /**
     * The default value of the '{@link #getTl8() <em>Tl8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl8()
     * @generated
     * @ordered
     */
    protected static final Float TL8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl8() <em>Tl8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl8()
     * @generated
     * @ordered
     */
    protected Float tl8 = TL8_EDEFAULT;

    /**
     * This is true if the Tl8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl8ESet;

    /**
     * The default value of the '{@link #getTl9() <em>Tl9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl9()
     * @generated
     * @ordered
     */
    protected static final Float TL9_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl9() <em>Tl9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl9()
     * @generated
     * @ordered
     */
    protected Float tl9 = TL9_EDEFAULT;

    /**
     * This is true if the Tl9 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl9ESet;

    /**
     * The default value of the '{@link #getVhmax() <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVhmax()
     * @generated
     * @ordered
     */
    protected static final Float VHMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVhmax() <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVhmax()
     * @generated
     * @ordered
     */
    protected Float vhmax = VHMAX_EDEFAULT;

    /**
     * This is true if the Vhmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vhmaxESet;

    /**
     * The default value of the '{@link #getVhmin() <em>Vhmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVhmin()
     * @generated
     * @ordered
     */
    protected static final Float VHMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVhmin() <em>Vhmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVhmin()
     * @generated
     * @ordered
     */
    protected Float vhmin = VHMIN_EDEFAULT;

    /**
     * This is true if the Vhmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vhminESet;

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
     * The default value of the '{@link #getVlmax() <em>Vlmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlmax()
     * @generated
     * @ordered
     */
    protected static final Float VLMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlmax() <em>Vlmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlmax()
     * @generated
     * @ordered
     */
    protected Float vlmax = VLMAX_EDEFAULT;

    /**
     * This is true if the Vlmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vlmaxESet;

    /**
     * The default value of the '{@link #getVlmin() <em>Vlmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlmin()
     * @generated
     * @ordered
     */
    protected static final Float VLMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlmin() <em>Vlmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlmin()
     * @generated
     * @ordered
     */
    protected Float vlmin = VLMIN_EDEFAULT;

    /**
     * This is true if the Vlmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vlminESet;

    /**
     * The default value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected static final Float VSTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected Float vstmax = VSTMAX_EDEFAULT;

    /**
     * This is true if the Vstmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstmaxESet;

    /**
     * The default value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected static final Float VSTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected Float vstmin = VSTMIN_EDEFAULT;

    /**
     * This is true if the Vstmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssIEEE4BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssIEEE4B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBwh1() {
        return bwh1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBwh1( Float newBwh1 ) {
        Float oldBwh1 = bwh1;
        bwh1 = newBwh1;
        boolean oldBwh1ESet = bwh1ESet;
        bwh1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__BWH1, oldBwh1, bwh1, !oldBwh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBwh1() {
        Float oldBwh1 = bwh1;
        boolean oldBwh1ESet = bwh1ESet;
        bwh1 = BWH1_EDEFAULT;
        bwh1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__BWH1, oldBwh1, BWH1_EDEFAULT, oldBwh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBwh1() {
        return bwh1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBwh2() {
        return bwh2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBwh2( Float newBwh2 ) {
        Float oldBwh2 = bwh2;
        bwh2 = newBwh2;
        boolean oldBwh2ESet = bwh2ESet;
        bwh2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__BWH2, oldBwh2, bwh2, !oldBwh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBwh2() {
        Float oldBwh2 = bwh2;
        boolean oldBwh2ESet = bwh2ESet;
        bwh2 = BWH2_EDEFAULT;
        bwh2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__BWH2, oldBwh2, BWH2_EDEFAULT, oldBwh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBwh2() {
        return bwh2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBwl1() {
        return bwl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBwl1( Float newBwl1 ) {
        Float oldBwl1 = bwl1;
        bwl1 = newBwl1;
        boolean oldBwl1ESet = bwl1ESet;
        bwl1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__BWL1, oldBwl1, bwl1, !oldBwl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBwl1() {
        Float oldBwl1 = bwl1;
        boolean oldBwl1ESet = bwl1ESet;
        bwl1 = BWL1_EDEFAULT;
        bwl1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__BWL1, oldBwl1, BWL1_EDEFAULT, oldBwl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBwl1() {
        return bwl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBwl2() {
        return bwl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBwl2( Float newBwl2 ) {
        Float oldBwl2 = bwl2;
        bwl2 = newBwl2;
        boolean oldBwl2ESet = bwl2ESet;
        bwl2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__BWL2, oldBwl2, bwl2, !oldBwl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBwl2() {
        Float oldBwl2 = bwl2;
        boolean oldBwl2ESet = bwl2ESet;
        bwl2 = BWL2_EDEFAULT;
        bwl2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__BWL2, oldBwl2, BWL2_EDEFAULT, oldBwl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBwl2() {
        return bwl2ESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KH, oldKh, kh, !oldKhESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KH, oldKh, KH_EDEFAULT, oldKhESet ) );
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
    public Float getKh1() {
        return kh1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKh1( Float newKh1 ) {
        Float oldKh1 = kh1;
        kh1 = newKh1;
        boolean oldKh1ESet = kh1ESet;
        kh1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KH1, oldKh1, kh1, !oldKh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKh1() {
        Float oldKh1 = kh1;
        boolean oldKh1ESet = kh1ESet;
        kh1 = KH1_EDEFAULT;
        kh1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KH1, oldKh1, KH1_EDEFAULT, oldKh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKh1() {
        return kh1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKh11() {
        return kh11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKh11( Float newKh11 ) {
        Float oldKh11 = kh11;
        kh11 = newKh11;
        boolean oldKh11ESet = kh11ESet;
        kh11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KH11, oldKh11, kh11, !oldKh11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKh11() {
        Float oldKh11 = kh11;
        boolean oldKh11ESet = kh11ESet;
        kh11 = KH11_EDEFAULT;
        kh11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KH11, oldKh11, KH11_EDEFAULT, oldKh11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKh11() {
        return kh11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKh17() {
        return kh17;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKh17( Float newKh17 ) {
        Float oldKh17 = kh17;
        kh17 = newKh17;
        boolean oldKh17ESet = kh17ESet;
        kh17ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KH17, oldKh17, kh17, !oldKh17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKh17() {
        Float oldKh17 = kh17;
        boolean oldKh17ESet = kh17ESet;
        kh17 = KH17_EDEFAULT;
        kh17ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KH17, oldKh17, KH17_EDEFAULT, oldKh17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKh17() {
        return kh17ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKh2() {
        return kh2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKh2( Float newKh2 ) {
        Float oldKh2 = kh2;
        kh2 = newKh2;
        boolean oldKh2ESet = kh2ESet;
        kh2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KH2, oldKh2, kh2, !oldKh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKh2() {
        Float oldKh2 = kh2;
        boolean oldKh2ESet = kh2ESet;
        kh2 = KH2_EDEFAULT;
        kh2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KH2, oldKh2, KH2_EDEFAULT, oldKh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKh2() {
        return kh2ESet;
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
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KI, oldKi, ki, !oldKiESet ) );
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
                CimPackage.PSS_IEEE4B__KI, oldKi, KI_EDEFAULT, oldKiESet ) );
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
    public Float getKi1() {
        return ki1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi1( Float newKi1 ) {
        Float oldKi1 = ki1;
        ki1 = newKi1;
        boolean oldKi1ESet = ki1ESet;
        ki1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KI1, oldKi1, ki1, !oldKi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi1() {
        Float oldKi1 = ki1;
        boolean oldKi1ESet = ki1ESet;
        ki1 = KI1_EDEFAULT;
        ki1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KI1, oldKi1, KI1_EDEFAULT, oldKi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi1() {
        return ki1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi11() {
        return ki11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi11( Float newKi11 ) {
        Float oldKi11 = ki11;
        ki11 = newKi11;
        boolean oldKi11ESet = ki11ESet;
        ki11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KI11, oldKi11, ki11, !oldKi11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi11() {
        Float oldKi11 = ki11;
        boolean oldKi11ESet = ki11ESet;
        ki11 = KI11_EDEFAULT;
        ki11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KI11, oldKi11, KI11_EDEFAULT, oldKi11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi11() {
        return ki11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi17() {
        return ki17;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi17( Float newKi17 ) {
        Float oldKi17 = ki17;
        ki17 = newKi17;
        boolean oldKi17ESet = ki17ESet;
        ki17ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KI17, oldKi17, ki17, !oldKi17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi17() {
        Float oldKi17 = ki17;
        boolean oldKi17ESet = ki17ESet;
        ki17 = KI17_EDEFAULT;
        ki17ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KI17, oldKi17, KI17_EDEFAULT, oldKi17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi17() {
        return ki17ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKi2() {
        return ki2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi2( Float newKi2 ) {
        Float oldKi2 = ki2;
        ki2 = newKi2;
        boolean oldKi2ESet = ki2ESet;
        ki2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KI2, oldKi2, ki2, !oldKi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi2() {
        Float oldKi2 = ki2;
        boolean oldKi2ESet = ki2ESet;
        ki2 = KI2_EDEFAULT;
        ki2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KI2, oldKi2, KI2_EDEFAULT, oldKi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi2() {
        return ki2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKl() {
        return kl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKl( Float newKl ) {
        Float oldKl = kl;
        kl = newKl;
        boolean oldKlESet = klESet;
        klESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KL, oldKl, kl, !oldKlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKl() {
        Float oldKl = kl;
        boolean oldKlESet = klESet;
        kl = KL_EDEFAULT;
        klESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KL, oldKl, KL_EDEFAULT, oldKlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKl() {
        return klESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKl1() {
        return kl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKl1( Float newKl1 ) {
        Float oldKl1 = kl1;
        kl1 = newKl1;
        boolean oldKl1ESet = kl1ESet;
        kl1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KL1, oldKl1, kl1, !oldKl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKl1() {
        Float oldKl1 = kl1;
        boolean oldKl1ESet = kl1ESet;
        kl1 = KL1_EDEFAULT;
        kl1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KL1, oldKl1, KL1_EDEFAULT, oldKl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKl1() {
        return kl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKl11() {
        return kl11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKl11( Float newKl11 ) {
        Float oldKl11 = kl11;
        kl11 = newKl11;
        boolean oldKl11ESet = kl11ESet;
        kl11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KL11, oldKl11, kl11, !oldKl11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKl11() {
        Float oldKl11 = kl11;
        boolean oldKl11ESet = kl11ESet;
        kl11 = KL11_EDEFAULT;
        kl11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KL11, oldKl11, KL11_EDEFAULT, oldKl11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKl11() {
        return kl11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKl17() {
        return kl17;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKl17( Float newKl17 ) {
        Float oldKl17 = kl17;
        kl17 = newKl17;
        boolean oldKl17ESet = kl17ESet;
        kl17ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__KL17, oldKl17, kl17, !oldKl17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKl17() {
        Float oldKl17 = kl17;
        boolean oldKl17ESet = kl17ESet;
        kl17 = KL17_EDEFAULT;
        kl17ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KL17, oldKl17, KL17_EDEFAULT, oldKl17ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKl17() {
        return kl17ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKl2() {
        return kl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKl2( Float newKl2 ) {
        Float oldKl2 = kl2;
        kl2 = newKl2;
        boolean oldKl2ESet = kl2ESet;
        kl2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__KL2, oldKl2, kl2, !oldKl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKl2() {
        Float oldKl2 = kl2;
        boolean oldKl2ESet = kl2ESet;
        kl2 = KL2_EDEFAULT;
        kl2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__KL2, oldKl2, KL2_EDEFAULT, oldKl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKl2() {
        return kl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmeganh1() {
        return omeganh1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmeganh1( Float newOmeganh1 ) {
        Float oldOmeganh1 = omeganh1;
        omeganh1 = newOmeganh1;
        boolean oldOmeganh1ESet = omeganh1ESet;
        omeganh1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__OMEGANH1, oldOmeganh1, omeganh1, !oldOmeganh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmeganh1() {
        Float oldOmeganh1 = omeganh1;
        boolean oldOmeganh1ESet = omeganh1ESet;
        omeganh1 = OMEGANH1_EDEFAULT;
        omeganh1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__OMEGANH1, oldOmeganh1, OMEGANH1_EDEFAULT, oldOmeganh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmeganh1() {
        return omeganh1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmeganh2() {
        return omeganh2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmeganh2( Float newOmeganh2 ) {
        Float oldOmeganh2 = omeganh2;
        omeganh2 = newOmeganh2;
        boolean oldOmeganh2ESet = omeganh2ESet;
        omeganh2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__OMEGANH2, oldOmeganh2, omeganh2, !oldOmeganh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmeganh2() {
        Float oldOmeganh2 = omeganh2;
        boolean oldOmeganh2ESet = omeganh2ESet;
        omeganh2 = OMEGANH2_EDEFAULT;
        omeganh2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__OMEGANH2, oldOmeganh2, OMEGANH2_EDEFAULT, oldOmeganh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmeganh2() {
        return omeganh2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmeganl1() {
        return omeganl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmeganl1( Float newOmeganl1 ) {
        Float oldOmeganl1 = omeganl1;
        omeganl1 = newOmeganl1;
        boolean oldOmeganl1ESet = omeganl1ESet;
        omeganl1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__OMEGANL1, oldOmeganl1, omeganl1, !oldOmeganl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmeganl1() {
        Float oldOmeganl1 = omeganl1;
        boolean oldOmeganl1ESet = omeganl1ESet;
        omeganl1 = OMEGANL1_EDEFAULT;
        omeganl1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__OMEGANL1, oldOmeganl1, OMEGANL1_EDEFAULT, oldOmeganl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmeganl1() {
        return omeganl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmeganl2() {
        return omeganl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmeganl2( Float newOmeganl2 ) {
        Float oldOmeganl2 = omeganl2;
        omeganl2 = newOmeganl2;
        boolean oldOmeganl2ESet = omeganl2ESet;
        omeganl2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__OMEGANL2, oldOmeganl2, omeganl2, !oldOmeganl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmeganl2() {
        Float oldOmeganl2 = omeganl2;
        boolean oldOmeganl2ESet = omeganl2ESet;
        omeganl2 = OMEGANL2_EDEFAULT;
        omeganl2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__OMEGANL2, oldOmeganl2, OMEGANL2_EDEFAULT, oldOmeganl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmeganl2() {
        return omeganl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh1() {
        return th1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh1( Float newTh1 ) {
        Float oldTh1 = th1;
        th1 = newTh1;
        boolean oldTh1ESet = th1ESet;
        th1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH1, oldTh1, th1, !oldTh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh1() {
        Float oldTh1 = th1;
        boolean oldTh1ESet = th1ESet;
        th1 = TH1_EDEFAULT;
        th1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH1, oldTh1, TH1_EDEFAULT, oldTh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh1() {
        return th1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh10() {
        return th10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh10( Float newTh10 ) {
        Float oldTh10 = th10;
        th10 = newTh10;
        boolean oldTh10ESet = th10ESet;
        th10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TH10, oldTh10, th10, !oldTh10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh10() {
        Float oldTh10 = th10;
        boolean oldTh10ESet = th10ESet;
        th10 = TH10_EDEFAULT;
        th10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH10, oldTh10, TH10_EDEFAULT, oldTh10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh10() {
        return th10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh11() {
        return th11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh11( Float newTh11 ) {
        Float oldTh11 = th11;
        th11 = newTh11;
        boolean oldTh11ESet = th11ESet;
        th11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TH11, oldTh11, th11, !oldTh11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh11() {
        Float oldTh11 = th11;
        boolean oldTh11ESet = th11ESet;
        th11 = TH11_EDEFAULT;
        th11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH11, oldTh11, TH11_EDEFAULT, oldTh11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh11() {
        return th11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh12() {
        return th12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh12( Float newTh12 ) {
        Float oldTh12 = th12;
        th12 = newTh12;
        boolean oldTh12ESet = th12ESet;
        th12ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TH12, oldTh12, th12, !oldTh12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh12() {
        Float oldTh12 = th12;
        boolean oldTh12ESet = th12ESet;
        th12 = TH12_EDEFAULT;
        th12ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH12, oldTh12, TH12_EDEFAULT, oldTh12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh12() {
        return th12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh2() {
        return th2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh2( Float newTh2 ) {
        Float oldTh2 = th2;
        th2 = newTh2;
        boolean oldTh2ESet = th2ESet;
        th2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH2, oldTh2, th2, !oldTh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh2() {
        Float oldTh2 = th2;
        boolean oldTh2ESet = th2ESet;
        th2 = TH2_EDEFAULT;
        th2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH2, oldTh2, TH2_EDEFAULT, oldTh2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh2() {
        return th2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh3() {
        return th3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh3( Float newTh3 ) {
        Float oldTh3 = th3;
        th3 = newTh3;
        boolean oldTh3ESet = th3ESet;
        th3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH3, oldTh3, th3, !oldTh3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh3() {
        Float oldTh3 = th3;
        boolean oldTh3ESet = th3ESet;
        th3 = TH3_EDEFAULT;
        th3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH3, oldTh3, TH3_EDEFAULT, oldTh3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh3() {
        return th3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh4() {
        return th4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh4( Float newTh4 ) {
        Float oldTh4 = th4;
        th4 = newTh4;
        boolean oldTh4ESet = th4ESet;
        th4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH4, oldTh4, th4, !oldTh4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh4() {
        Float oldTh4 = th4;
        boolean oldTh4ESet = th4ESet;
        th4 = TH4_EDEFAULT;
        th4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH4, oldTh4, TH4_EDEFAULT, oldTh4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh4() {
        return th4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh5() {
        return th5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh5( Float newTh5 ) {
        Float oldTh5 = th5;
        th5 = newTh5;
        boolean oldTh5ESet = th5ESet;
        th5ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH5, oldTh5, th5, !oldTh5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh5() {
        Float oldTh5 = th5;
        boolean oldTh5ESet = th5ESet;
        th5 = TH5_EDEFAULT;
        th5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH5, oldTh5, TH5_EDEFAULT, oldTh5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh5() {
        return th5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh6() {
        return th6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh6( Float newTh6 ) {
        Float oldTh6 = th6;
        th6 = newTh6;
        boolean oldTh6ESet = th6ESet;
        th6ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH6, oldTh6, th6, !oldTh6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh6() {
        Float oldTh6 = th6;
        boolean oldTh6ESet = th6ESet;
        th6 = TH6_EDEFAULT;
        th6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH6, oldTh6, TH6_EDEFAULT, oldTh6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh6() {
        return th6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh7() {
        return th7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh7( Float newTh7 ) {
        Float oldTh7 = th7;
        th7 = newTh7;
        boolean oldTh7ESet = th7ESet;
        th7ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH7, oldTh7, th7, !oldTh7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh7() {
        Float oldTh7 = th7;
        boolean oldTh7ESet = th7ESet;
        th7 = TH7_EDEFAULT;
        th7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH7, oldTh7, TH7_EDEFAULT, oldTh7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh7() {
        return th7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh8() {
        return th8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh8( Float newTh8 ) {
        Float oldTh8 = th8;
        th8 = newTh8;
        boolean oldTh8ESet = th8ESet;
        th8ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH8, oldTh8, th8, !oldTh8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh8() {
        Float oldTh8 = th8;
        boolean oldTh8ESet = th8ESet;
        th8 = TH8_EDEFAULT;
        th8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH8, oldTh8, TH8_EDEFAULT, oldTh8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh8() {
        return th8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTh9() {
        return th9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTh9( Float newTh9 ) {
        Float oldTh9 = th9;
        th9 = newTh9;
        boolean oldTh9ESet = th9ESet;
        th9ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TH9, oldTh9, th9, !oldTh9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTh9() {
        Float oldTh9 = th9;
        boolean oldTh9ESet = th9ESet;
        th9 = TH9_EDEFAULT;
        th9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TH9, oldTh9, TH9_EDEFAULT, oldTh9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTh9() {
        return th9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi1() {
        return ti1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi1( Float newTi1 ) {
        Float oldTi1 = ti1;
        ti1 = newTi1;
        boolean oldTi1ESet = ti1ESet;
        ti1ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI1, oldTi1, ti1, !oldTi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi1() {
        Float oldTi1 = ti1;
        boolean oldTi1ESet = ti1ESet;
        ti1 = TI1_EDEFAULT;
        ti1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI1, oldTi1, TI1_EDEFAULT, oldTi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi1() {
        return ti1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi10() {
        return ti10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi10( Float newTi10 ) {
        Float oldTi10 = ti10;
        ti10 = newTi10;
        boolean oldTi10ESet = ti10ESet;
        ti10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TI10, oldTi10, ti10, !oldTi10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi10() {
        Float oldTi10 = ti10;
        boolean oldTi10ESet = ti10ESet;
        ti10 = TI10_EDEFAULT;
        ti10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI10, oldTi10, TI10_EDEFAULT, oldTi10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi10() {
        return ti10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi11() {
        return ti11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi11( Float newTi11 ) {
        Float oldTi11 = ti11;
        ti11 = newTi11;
        boolean oldTi11ESet = ti11ESet;
        ti11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TI11, oldTi11, ti11, !oldTi11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi11() {
        Float oldTi11 = ti11;
        boolean oldTi11ESet = ti11ESet;
        ti11 = TI11_EDEFAULT;
        ti11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI11, oldTi11, TI11_EDEFAULT, oldTi11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi11() {
        return ti11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi12() {
        return ti12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi12( Float newTi12 ) {
        Float oldTi12 = ti12;
        ti12 = newTi12;
        boolean oldTi12ESet = ti12ESet;
        ti12ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TI12, oldTi12, ti12, !oldTi12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi12() {
        Float oldTi12 = ti12;
        boolean oldTi12ESet = ti12ESet;
        ti12 = TI12_EDEFAULT;
        ti12ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI12, oldTi12, TI12_EDEFAULT, oldTi12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi12() {
        return ti12ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi2() {
        return ti2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi2( Float newTi2 ) {
        Float oldTi2 = ti2;
        ti2 = newTi2;
        boolean oldTi2ESet = ti2ESet;
        ti2ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI2, oldTi2, ti2, !oldTi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi2() {
        Float oldTi2 = ti2;
        boolean oldTi2ESet = ti2ESet;
        ti2 = TI2_EDEFAULT;
        ti2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI2, oldTi2, TI2_EDEFAULT, oldTi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi2() {
        return ti2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi3() {
        return ti3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi3( Float newTi3 ) {
        Float oldTi3 = ti3;
        ti3 = newTi3;
        boolean oldTi3ESet = ti3ESet;
        ti3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI3, oldTi3, ti3, !oldTi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi3() {
        Float oldTi3 = ti3;
        boolean oldTi3ESet = ti3ESet;
        ti3 = TI3_EDEFAULT;
        ti3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI3, oldTi3, TI3_EDEFAULT, oldTi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi3() {
        return ti3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi4() {
        return ti4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi4( Float newTi4 ) {
        Float oldTi4 = ti4;
        ti4 = newTi4;
        boolean oldTi4ESet = ti4ESet;
        ti4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI4, oldTi4, ti4, !oldTi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi4() {
        Float oldTi4 = ti4;
        boolean oldTi4ESet = ti4ESet;
        ti4 = TI4_EDEFAULT;
        ti4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI4, oldTi4, TI4_EDEFAULT, oldTi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi4() {
        return ti4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi5() {
        return ti5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi5( Float newTi5 ) {
        Float oldTi5 = ti5;
        ti5 = newTi5;
        boolean oldTi5ESet = ti5ESet;
        ti5ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI5, oldTi5, ti5, !oldTi5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi5() {
        Float oldTi5 = ti5;
        boolean oldTi5ESet = ti5ESet;
        ti5 = TI5_EDEFAULT;
        ti5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI5, oldTi5, TI5_EDEFAULT, oldTi5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi5() {
        return ti5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi6() {
        return ti6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi6( Float newTi6 ) {
        Float oldTi6 = ti6;
        ti6 = newTi6;
        boolean oldTi6ESet = ti6ESet;
        ti6ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI6, oldTi6, ti6, !oldTi6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi6() {
        Float oldTi6 = ti6;
        boolean oldTi6ESet = ti6ESet;
        ti6 = TI6_EDEFAULT;
        ti6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI6, oldTi6, TI6_EDEFAULT, oldTi6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi6() {
        return ti6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi7() {
        return ti7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi7( Float newTi7 ) {
        Float oldTi7 = ti7;
        ti7 = newTi7;
        boolean oldTi7ESet = ti7ESet;
        ti7ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI7, oldTi7, ti7, !oldTi7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi7() {
        Float oldTi7 = ti7;
        boolean oldTi7ESet = ti7ESet;
        ti7 = TI7_EDEFAULT;
        ti7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI7, oldTi7, TI7_EDEFAULT, oldTi7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi7() {
        return ti7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi8() {
        return ti8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi8( Float newTi8 ) {
        Float oldTi8 = ti8;
        ti8 = newTi8;
        boolean oldTi8ESet = ti8ESet;
        ti8ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI8, oldTi8, ti8, !oldTi8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi8() {
        Float oldTi8 = ti8;
        boolean oldTi8ESet = ti8ESet;
        ti8 = TI8_EDEFAULT;
        ti8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI8, oldTi8, TI8_EDEFAULT, oldTi8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi8() {
        return ti8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTi9() {
        return ti9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi9( Float newTi9 ) {
        Float oldTi9 = ti9;
        ti9 = newTi9;
        boolean oldTi9ESet = ti9ESet;
        ti9ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TI9, oldTi9, ti9, !oldTi9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi9() {
        Float oldTi9 = ti9;
        boolean oldTi9ESet = ti9ESet;
        ti9 = TI9_EDEFAULT;
        ti9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TI9, oldTi9, TI9_EDEFAULT, oldTi9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi9() {
        return ti9ESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL1, oldTl1, tl1, !oldTl1ESet ) );
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
                CimPackage.PSS_IEEE4B__TL1, oldTl1, TL1_EDEFAULT, oldTl1ESet ) );
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
    public Float getTl10() {
        return tl10;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl10( Float newTl10 ) {
        Float oldTl10 = tl10;
        tl10 = newTl10;
        boolean oldTl10ESet = tl10ESet;
        tl10ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TL10, oldTl10, tl10, !oldTl10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl10() {
        Float oldTl10 = tl10;
        boolean oldTl10ESet = tl10ESet;
        tl10 = TL10_EDEFAULT;
        tl10ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL10, oldTl10, TL10_EDEFAULT, oldTl10ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl10() {
        return tl10ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl11() {
        return tl11;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl11( Float newTl11 ) {
        Float oldTl11 = tl11;
        tl11 = newTl11;
        boolean oldTl11ESet = tl11ESet;
        tl11ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TL11, oldTl11, tl11, !oldTl11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl11() {
        Float oldTl11 = tl11;
        boolean oldTl11ESet = tl11ESet;
        tl11 = TL11_EDEFAULT;
        tl11ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL11, oldTl11, TL11_EDEFAULT, oldTl11ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl11() {
        return tl11ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl12() {
        return tl12;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl12( Float newTl12 ) {
        Float oldTl12 = tl12;
        tl12 = newTl12;
        boolean oldTl12ESet = tl12ESet;
        tl12ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__TL12, oldTl12, tl12, !oldTl12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl12() {
        Float oldTl12 = tl12;
        boolean oldTl12ESet = tl12ESet;
        tl12 = TL12_EDEFAULT;
        tl12ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL12, oldTl12, TL12_EDEFAULT, oldTl12ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl12() {
        return tl12ESet;
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
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL2, oldTl2, tl2, !oldTl2ESet ) );
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
                CimPackage.PSS_IEEE4B__TL2, oldTl2, TL2_EDEFAULT, oldTl2ESet ) );
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
    public Float getTl3() {
        return tl3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl3( Float newTl3 ) {
        Float oldTl3 = tl3;
        tl3 = newTl3;
        boolean oldTl3ESet = tl3ESet;
        tl3ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL3, oldTl3, tl3, !oldTl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl3() {
        Float oldTl3 = tl3;
        boolean oldTl3ESet = tl3ESet;
        tl3 = TL3_EDEFAULT;
        tl3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL3, oldTl3, TL3_EDEFAULT, oldTl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl3() {
        return tl3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl4() {
        return tl4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl4( Float newTl4 ) {
        Float oldTl4 = tl4;
        tl4 = newTl4;
        boolean oldTl4ESet = tl4ESet;
        tl4ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL4, oldTl4, tl4, !oldTl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl4() {
        Float oldTl4 = tl4;
        boolean oldTl4ESet = tl4ESet;
        tl4 = TL4_EDEFAULT;
        tl4ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL4, oldTl4, TL4_EDEFAULT, oldTl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl4() {
        return tl4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl5() {
        return tl5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl5( Float newTl5 ) {
        Float oldTl5 = tl5;
        tl5 = newTl5;
        boolean oldTl5ESet = tl5ESet;
        tl5ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL5, oldTl5, tl5, !oldTl5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl5() {
        Float oldTl5 = tl5;
        boolean oldTl5ESet = tl5ESet;
        tl5 = TL5_EDEFAULT;
        tl5ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL5, oldTl5, TL5_EDEFAULT, oldTl5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl5() {
        return tl5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl6() {
        return tl6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl6( Float newTl6 ) {
        Float oldTl6 = tl6;
        tl6 = newTl6;
        boolean oldTl6ESet = tl6ESet;
        tl6ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL6, oldTl6, tl6, !oldTl6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl6() {
        Float oldTl6 = tl6;
        boolean oldTl6ESet = tl6ESet;
        tl6 = TL6_EDEFAULT;
        tl6ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL6, oldTl6, TL6_EDEFAULT, oldTl6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl6() {
        return tl6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl7() {
        return tl7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl7( Float newTl7 ) {
        Float oldTl7 = tl7;
        tl7 = newTl7;
        boolean oldTl7ESet = tl7ESet;
        tl7ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL7, oldTl7, tl7, !oldTl7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl7() {
        Float oldTl7 = tl7;
        boolean oldTl7ESet = tl7ESet;
        tl7 = TL7_EDEFAULT;
        tl7ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL7, oldTl7, TL7_EDEFAULT, oldTl7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl7() {
        return tl7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl8() {
        return tl8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl8( Float newTl8 ) {
        Float oldTl8 = tl8;
        tl8 = newTl8;
        boolean oldTl8ESet = tl8ESet;
        tl8ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL8, oldTl8, tl8, !oldTl8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl8() {
        Float oldTl8 = tl8;
        boolean oldTl8ESet = tl8ESet;
        tl8 = TL8_EDEFAULT;
        tl8ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL8, oldTl8, TL8_EDEFAULT, oldTl8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl8() {
        return tl8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTl9() {
        return tl9;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl9( Float newTl9 ) {
        Float oldTl9 = tl9;
        tl9 = newTl9;
        boolean oldTl9ESet = tl9ESet;
        tl9ESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE4B__TL9, oldTl9, tl9, !oldTl9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl9() {
        Float oldTl9 = tl9;
        boolean oldTl9ESet = tl9ESet;
        tl9 = TL9_EDEFAULT;
        tl9ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__TL9, oldTl9, TL9_EDEFAULT, oldTl9ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl9() {
        return tl9ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVhmax() {
        return vhmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVhmax( Float newVhmax ) {
        Float oldVhmax = vhmax;
        vhmax = newVhmax;
        boolean oldVhmaxESet = vhmaxESet;
        vhmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VHMAX, oldVhmax, vhmax, !oldVhmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVhmax() {
        Float oldVhmax = vhmax;
        boolean oldVhmaxESet = vhmaxESet;
        vhmax = VHMAX_EDEFAULT;
        vhmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VHMAX, oldVhmax, VHMAX_EDEFAULT, oldVhmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVhmax() {
        return vhmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVhmin() {
        return vhmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVhmin( Float newVhmin ) {
        Float oldVhmin = vhmin;
        vhmin = newVhmin;
        boolean oldVhminESet = vhminESet;
        vhminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VHMIN, oldVhmin, vhmin, !oldVhminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVhmin() {
        Float oldVhmin = vhmin;
        boolean oldVhminESet = vhminESet;
        vhmin = VHMIN_EDEFAULT;
        vhminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VHMIN, oldVhmin, VHMIN_EDEFAULT, oldVhminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVhmin() {
        return vhminESet;
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
                CimPackage.PSS_IEEE4B__VIMAX, oldVimax, vimax, !oldVimaxESet ) );
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
                CimPackage.PSS_IEEE4B__VIMAX, oldVimax, VIMAX_EDEFAULT, oldVimaxESet ) );
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
                CimPackage.PSS_IEEE4B__VIMIN, oldVimin, vimin, !oldViminESet ) );
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
                CimPackage.PSS_IEEE4B__VIMIN, oldVimin, VIMIN_EDEFAULT, oldViminESet ) );
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
    public Float getVlmax() {
        return vlmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlmax( Float newVlmax ) {
        Float oldVlmax = vlmax;
        vlmax = newVlmax;
        boolean oldVlmaxESet = vlmaxESet;
        vlmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VLMAX, oldVlmax, vlmax, !oldVlmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVlmax() {
        Float oldVlmax = vlmax;
        boolean oldVlmaxESet = vlmaxESet;
        vlmax = VLMAX_EDEFAULT;
        vlmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VLMAX, oldVlmax, VLMAX_EDEFAULT, oldVlmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVlmax() {
        return vlmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVlmin() {
        return vlmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlmin( Float newVlmin ) {
        Float oldVlmin = vlmin;
        vlmin = newVlmin;
        boolean oldVlminESet = vlminESet;
        vlminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VLMIN, oldVlmin, vlmin, !oldVlminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVlmin() {
        Float oldVlmin = vlmin;
        boolean oldVlminESet = vlminESet;
        vlmin = VLMIN_EDEFAULT;
        vlminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VLMIN, oldVlmin, VLMIN_EDEFAULT, oldVlminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVlmin() {
        return vlminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVstmax() {
        return vstmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmax( Float newVstmax ) {
        Float oldVstmax = vstmax;
        vstmax = newVstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VSTMAX, oldVstmax, vstmax, !oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmax() {
        Float oldVstmax = vstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmax = VSTMAX_EDEFAULT;
        vstmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VSTMAX, oldVstmax, VSTMAX_EDEFAULT, oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmax() {
        return vstmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVstmin() {
        return vstmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmin( Float newVstmin ) {
        Float oldVstmin = vstmin;
        vstmin = newVstmin;
        boolean oldVstminESet = vstminESet;
        vstminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PSS_IEEE4B__VSTMIN, oldVstmin, vstmin, !oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmin() {
        Float oldVstmin = vstmin;
        boolean oldVstminESet = vstminESet;
        vstmin = VSTMIN_EDEFAULT;
        vstminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PSS_IEEE4B__VSTMIN, oldVstmin, VSTMIN_EDEFAULT, oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmin() {
        return vstminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE4B__BWH1:
            return getBwh1();
        case CimPackage.PSS_IEEE4B__BWH2:
            return getBwh2();
        case CimPackage.PSS_IEEE4B__BWL1:
            return getBwl1();
        case CimPackage.PSS_IEEE4B__BWL2:
            return getBwl2();
        case CimPackage.PSS_IEEE4B__KH:
            return getKh();
        case CimPackage.PSS_IEEE4B__KH1:
            return getKh1();
        case CimPackage.PSS_IEEE4B__KH11:
            return getKh11();
        case CimPackage.PSS_IEEE4B__KH17:
            return getKh17();
        case CimPackage.PSS_IEEE4B__KH2:
            return getKh2();
        case CimPackage.PSS_IEEE4B__KI:
            return getKi();
        case CimPackage.PSS_IEEE4B__KI1:
            return getKi1();
        case CimPackage.PSS_IEEE4B__KI11:
            return getKi11();
        case CimPackage.PSS_IEEE4B__KI17:
            return getKi17();
        case CimPackage.PSS_IEEE4B__KI2:
            return getKi2();
        case CimPackage.PSS_IEEE4B__KL:
            return getKl();
        case CimPackage.PSS_IEEE4B__KL1:
            return getKl1();
        case CimPackage.PSS_IEEE4B__KL11:
            return getKl11();
        case CimPackage.PSS_IEEE4B__KL17:
            return getKl17();
        case CimPackage.PSS_IEEE4B__KL2:
            return getKl2();
        case CimPackage.PSS_IEEE4B__OMEGANH1:
            return getOmeganh1();
        case CimPackage.PSS_IEEE4B__OMEGANH2:
            return getOmeganh2();
        case CimPackage.PSS_IEEE4B__OMEGANL1:
            return getOmeganl1();
        case CimPackage.PSS_IEEE4B__OMEGANL2:
            return getOmeganl2();
        case CimPackage.PSS_IEEE4B__TH1:
            return getTh1();
        case CimPackage.PSS_IEEE4B__TH10:
            return getTh10();
        case CimPackage.PSS_IEEE4B__TH11:
            return getTh11();
        case CimPackage.PSS_IEEE4B__TH12:
            return getTh12();
        case CimPackage.PSS_IEEE4B__TH2:
            return getTh2();
        case CimPackage.PSS_IEEE4B__TH3:
            return getTh3();
        case CimPackage.PSS_IEEE4B__TH4:
            return getTh4();
        case CimPackage.PSS_IEEE4B__TH5:
            return getTh5();
        case CimPackage.PSS_IEEE4B__TH6:
            return getTh6();
        case CimPackage.PSS_IEEE4B__TH7:
            return getTh7();
        case CimPackage.PSS_IEEE4B__TH8:
            return getTh8();
        case CimPackage.PSS_IEEE4B__TH9:
            return getTh9();
        case CimPackage.PSS_IEEE4B__TI1:
            return getTi1();
        case CimPackage.PSS_IEEE4B__TI10:
            return getTi10();
        case CimPackage.PSS_IEEE4B__TI11:
            return getTi11();
        case CimPackage.PSS_IEEE4B__TI12:
            return getTi12();
        case CimPackage.PSS_IEEE4B__TI2:
            return getTi2();
        case CimPackage.PSS_IEEE4B__TI3:
            return getTi3();
        case CimPackage.PSS_IEEE4B__TI4:
            return getTi4();
        case CimPackage.PSS_IEEE4B__TI5:
            return getTi5();
        case CimPackage.PSS_IEEE4B__TI6:
            return getTi6();
        case CimPackage.PSS_IEEE4B__TI7:
            return getTi7();
        case CimPackage.PSS_IEEE4B__TI8:
            return getTi8();
        case CimPackage.PSS_IEEE4B__TI9:
            return getTi9();
        case CimPackage.PSS_IEEE4B__TL1:
            return getTl1();
        case CimPackage.PSS_IEEE4B__TL10:
            return getTl10();
        case CimPackage.PSS_IEEE4B__TL11:
            return getTl11();
        case CimPackage.PSS_IEEE4B__TL12:
            return getTl12();
        case CimPackage.PSS_IEEE4B__TL2:
            return getTl2();
        case CimPackage.PSS_IEEE4B__TL3:
            return getTl3();
        case CimPackage.PSS_IEEE4B__TL4:
            return getTl4();
        case CimPackage.PSS_IEEE4B__TL5:
            return getTl5();
        case CimPackage.PSS_IEEE4B__TL6:
            return getTl6();
        case CimPackage.PSS_IEEE4B__TL7:
            return getTl7();
        case CimPackage.PSS_IEEE4B__TL8:
            return getTl8();
        case CimPackage.PSS_IEEE4B__TL9:
            return getTl9();
        case CimPackage.PSS_IEEE4B__VHMAX:
            return getVhmax();
        case CimPackage.PSS_IEEE4B__VHMIN:
            return getVhmin();
        case CimPackage.PSS_IEEE4B__VIMAX:
            return getVimax();
        case CimPackage.PSS_IEEE4B__VIMIN:
            return getVimin();
        case CimPackage.PSS_IEEE4B__VLMAX:
            return getVlmax();
        case CimPackage.PSS_IEEE4B__VLMIN:
            return getVlmin();
        case CimPackage.PSS_IEEE4B__VSTMAX:
            return getVstmax();
        case CimPackage.PSS_IEEE4B__VSTMIN:
            return getVstmin();
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
        case CimPackage.PSS_IEEE4B__BWH1:
            setBwh1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__BWH2:
            setBwh2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__BWL1:
            setBwl1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__BWL2:
            setBwl2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KH:
            setKh( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KH1:
            setKh1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KH11:
            setKh11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KH17:
            setKh17( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KH2:
            setKh2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KI:
            setKi( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KI1:
            setKi1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KI11:
            setKi11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KI17:
            setKi17( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KI2:
            setKi2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KL:
            setKl( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KL1:
            setKl1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KL11:
            setKl11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KL17:
            setKl17( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__KL2:
            setKl2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__OMEGANH1:
            setOmeganh1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__OMEGANH2:
            setOmeganh2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__OMEGANL1:
            setOmeganl1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__OMEGANL2:
            setOmeganl2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH1:
            setTh1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH10:
            setTh10( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH11:
            setTh11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH12:
            setTh12( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH2:
            setTh2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH3:
            setTh3( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH4:
            setTh4( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH5:
            setTh5( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH6:
            setTh6( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH7:
            setTh7( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH8:
            setTh8( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TH9:
            setTh9( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI1:
            setTi1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI10:
            setTi10( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI11:
            setTi11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI12:
            setTi12( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI2:
            setTi2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI3:
            setTi3( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI4:
            setTi4( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI5:
            setTi5( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI6:
            setTi6( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI7:
            setTi7( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI8:
            setTi8( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TI9:
            setTi9( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL1:
            setTl1( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL10:
            setTl10( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL11:
            setTl11( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL12:
            setTl12( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL2:
            setTl2( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL3:
            setTl3( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL4:
            setTl4( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL5:
            setTl5( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL6:
            setTl6( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL7:
            setTl7( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL8:
            setTl8( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__TL9:
            setTl9( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VHMAX:
            setVhmax( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VHMIN:
            setVhmin( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VIMAX:
            setVimax( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VIMIN:
            setVimin( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VLMAX:
            setVlmax( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VLMIN:
            setVlmin( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VSTMAX:
            setVstmax( ( Float ) newValue );
            return;
        case CimPackage.PSS_IEEE4B__VSTMIN:
            setVstmin( ( Float ) newValue );
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
        case CimPackage.PSS_IEEE4B__BWH1:
            unsetBwh1();
            return;
        case CimPackage.PSS_IEEE4B__BWH2:
            unsetBwh2();
            return;
        case CimPackage.PSS_IEEE4B__BWL1:
            unsetBwl1();
            return;
        case CimPackage.PSS_IEEE4B__BWL2:
            unsetBwl2();
            return;
        case CimPackage.PSS_IEEE4B__KH:
            unsetKh();
            return;
        case CimPackage.PSS_IEEE4B__KH1:
            unsetKh1();
            return;
        case CimPackage.PSS_IEEE4B__KH11:
            unsetKh11();
            return;
        case CimPackage.PSS_IEEE4B__KH17:
            unsetKh17();
            return;
        case CimPackage.PSS_IEEE4B__KH2:
            unsetKh2();
            return;
        case CimPackage.PSS_IEEE4B__KI:
            unsetKi();
            return;
        case CimPackage.PSS_IEEE4B__KI1:
            unsetKi1();
            return;
        case CimPackage.PSS_IEEE4B__KI11:
            unsetKi11();
            return;
        case CimPackage.PSS_IEEE4B__KI17:
            unsetKi17();
            return;
        case CimPackage.PSS_IEEE4B__KI2:
            unsetKi2();
            return;
        case CimPackage.PSS_IEEE4B__KL:
            unsetKl();
            return;
        case CimPackage.PSS_IEEE4B__KL1:
            unsetKl1();
            return;
        case CimPackage.PSS_IEEE4B__KL11:
            unsetKl11();
            return;
        case CimPackage.PSS_IEEE4B__KL17:
            unsetKl17();
            return;
        case CimPackage.PSS_IEEE4B__KL2:
            unsetKl2();
            return;
        case CimPackage.PSS_IEEE4B__OMEGANH1:
            unsetOmeganh1();
            return;
        case CimPackage.PSS_IEEE4B__OMEGANH2:
            unsetOmeganh2();
            return;
        case CimPackage.PSS_IEEE4B__OMEGANL1:
            unsetOmeganl1();
            return;
        case CimPackage.PSS_IEEE4B__OMEGANL2:
            unsetOmeganl2();
            return;
        case CimPackage.PSS_IEEE4B__TH1:
            unsetTh1();
            return;
        case CimPackage.PSS_IEEE4B__TH10:
            unsetTh10();
            return;
        case CimPackage.PSS_IEEE4B__TH11:
            unsetTh11();
            return;
        case CimPackage.PSS_IEEE4B__TH12:
            unsetTh12();
            return;
        case CimPackage.PSS_IEEE4B__TH2:
            unsetTh2();
            return;
        case CimPackage.PSS_IEEE4B__TH3:
            unsetTh3();
            return;
        case CimPackage.PSS_IEEE4B__TH4:
            unsetTh4();
            return;
        case CimPackage.PSS_IEEE4B__TH5:
            unsetTh5();
            return;
        case CimPackage.PSS_IEEE4B__TH6:
            unsetTh6();
            return;
        case CimPackage.PSS_IEEE4B__TH7:
            unsetTh7();
            return;
        case CimPackage.PSS_IEEE4B__TH8:
            unsetTh8();
            return;
        case CimPackage.PSS_IEEE4B__TH9:
            unsetTh9();
            return;
        case CimPackage.PSS_IEEE4B__TI1:
            unsetTi1();
            return;
        case CimPackage.PSS_IEEE4B__TI10:
            unsetTi10();
            return;
        case CimPackage.PSS_IEEE4B__TI11:
            unsetTi11();
            return;
        case CimPackage.PSS_IEEE4B__TI12:
            unsetTi12();
            return;
        case CimPackage.PSS_IEEE4B__TI2:
            unsetTi2();
            return;
        case CimPackage.PSS_IEEE4B__TI3:
            unsetTi3();
            return;
        case CimPackage.PSS_IEEE4B__TI4:
            unsetTi4();
            return;
        case CimPackage.PSS_IEEE4B__TI5:
            unsetTi5();
            return;
        case CimPackage.PSS_IEEE4B__TI6:
            unsetTi6();
            return;
        case CimPackage.PSS_IEEE4B__TI7:
            unsetTi7();
            return;
        case CimPackage.PSS_IEEE4B__TI8:
            unsetTi8();
            return;
        case CimPackage.PSS_IEEE4B__TI9:
            unsetTi9();
            return;
        case CimPackage.PSS_IEEE4B__TL1:
            unsetTl1();
            return;
        case CimPackage.PSS_IEEE4B__TL10:
            unsetTl10();
            return;
        case CimPackage.PSS_IEEE4B__TL11:
            unsetTl11();
            return;
        case CimPackage.PSS_IEEE4B__TL12:
            unsetTl12();
            return;
        case CimPackage.PSS_IEEE4B__TL2:
            unsetTl2();
            return;
        case CimPackage.PSS_IEEE4B__TL3:
            unsetTl3();
            return;
        case CimPackage.PSS_IEEE4B__TL4:
            unsetTl4();
            return;
        case CimPackage.PSS_IEEE4B__TL5:
            unsetTl5();
            return;
        case CimPackage.PSS_IEEE4B__TL6:
            unsetTl6();
            return;
        case CimPackage.PSS_IEEE4B__TL7:
            unsetTl7();
            return;
        case CimPackage.PSS_IEEE4B__TL8:
            unsetTl8();
            return;
        case CimPackage.PSS_IEEE4B__TL9:
            unsetTl9();
            return;
        case CimPackage.PSS_IEEE4B__VHMAX:
            unsetVhmax();
            return;
        case CimPackage.PSS_IEEE4B__VHMIN:
            unsetVhmin();
            return;
        case CimPackage.PSS_IEEE4B__VIMAX:
            unsetVimax();
            return;
        case CimPackage.PSS_IEEE4B__VIMIN:
            unsetVimin();
            return;
        case CimPackage.PSS_IEEE4B__VLMAX:
            unsetVlmax();
            return;
        case CimPackage.PSS_IEEE4B__VLMIN:
            unsetVlmin();
            return;
        case CimPackage.PSS_IEEE4B__VSTMAX:
            unsetVstmax();
            return;
        case CimPackage.PSS_IEEE4B__VSTMIN:
            unsetVstmin();
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
        case CimPackage.PSS_IEEE4B__BWH1:
            return isSetBwh1();
        case CimPackage.PSS_IEEE4B__BWH2:
            return isSetBwh2();
        case CimPackage.PSS_IEEE4B__BWL1:
            return isSetBwl1();
        case CimPackage.PSS_IEEE4B__BWL2:
            return isSetBwl2();
        case CimPackage.PSS_IEEE4B__KH:
            return isSetKh();
        case CimPackage.PSS_IEEE4B__KH1:
            return isSetKh1();
        case CimPackage.PSS_IEEE4B__KH11:
            return isSetKh11();
        case CimPackage.PSS_IEEE4B__KH17:
            return isSetKh17();
        case CimPackage.PSS_IEEE4B__KH2:
            return isSetKh2();
        case CimPackage.PSS_IEEE4B__KI:
            return isSetKi();
        case CimPackage.PSS_IEEE4B__KI1:
            return isSetKi1();
        case CimPackage.PSS_IEEE4B__KI11:
            return isSetKi11();
        case CimPackage.PSS_IEEE4B__KI17:
            return isSetKi17();
        case CimPackage.PSS_IEEE4B__KI2:
            return isSetKi2();
        case CimPackage.PSS_IEEE4B__KL:
            return isSetKl();
        case CimPackage.PSS_IEEE4B__KL1:
            return isSetKl1();
        case CimPackage.PSS_IEEE4B__KL11:
            return isSetKl11();
        case CimPackage.PSS_IEEE4B__KL17:
            return isSetKl17();
        case CimPackage.PSS_IEEE4B__KL2:
            return isSetKl2();
        case CimPackage.PSS_IEEE4B__OMEGANH1:
            return isSetOmeganh1();
        case CimPackage.PSS_IEEE4B__OMEGANH2:
            return isSetOmeganh2();
        case CimPackage.PSS_IEEE4B__OMEGANL1:
            return isSetOmeganl1();
        case CimPackage.PSS_IEEE4B__OMEGANL2:
            return isSetOmeganl2();
        case CimPackage.PSS_IEEE4B__TH1:
            return isSetTh1();
        case CimPackage.PSS_IEEE4B__TH10:
            return isSetTh10();
        case CimPackage.PSS_IEEE4B__TH11:
            return isSetTh11();
        case CimPackage.PSS_IEEE4B__TH12:
            return isSetTh12();
        case CimPackage.PSS_IEEE4B__TH2:
            return isSetTh2();
        case CimPackage.PSS_IEEE4B__TH3:
            return isSetTh3();
        case CimPackage.PSS_IEEE4B__TH4:
            return isSetTh4();
        case CimPackage.PSS_IEEE4B__TH5:
            return isSetTh5();
        case CimPackage.PSS_IEEE4B__TH6:
            return isSetTh6();
        case CimPackage.PSS_IEEE4B__TH7:
            return isSetTh7();
        case CimPackage.PSS_IEEE4B__TH8:
            return isSetTh8();
        case CimPackage.PSS_IEEE4B__TH9:
            return isSetTh9();
        case CimPackage.PSS_IEEE4B__TI1:
            return isSetTi1();
        case CimPackage.PSS_IEEE4B__TI10:
            return isSetTi10();
        case CimPackage.PSS_IEEE4B__TI11:
            return isSetTi11();
        case CimPackage.PSS_IEEE4B__TI12:
            return isSetTi12();
        case CimPackage.PSS_IEEE4B__TI2:
            return isSetTi2();
        case CimPackage.PSS_IEEE4B__TI3:
            return isSetTi3();
        case CimPackage.PSS_IEEE4B__TI4:
            return isSetTi4();
        case CimPackage.PSS_IEEE4B__TI5:
            return isSetTi5();
        case CimPackage.PSS_IEEE4B__TI6:
            return isSetTi6();
        case CimPackage.PSS_IEEE4B__TI7:
            return isSetTi7();
        case CimPackage.PSS_IEEE4B__TI8:
            return isSetTi8();
        case CimPackage.PSS_IEEE4B__TI9:
            return isSetTi9();
        case CimPackage.PSS_IEEE4B__TL1:
            return isSetTl1();
        case CimPackage.PSS_IEEE4B__TL10:
            return isSetTl10();
        case CimPackage.PSS_IEEE4B__TL11:
            return isSetTl11();
        case CimPackage.PSS_IEEE4B__TL12:
            return isSetTl12();
        case CimPackage.PSS_IEEE4B__TL2:
            return isSetTl2();
        case CimPackage.PSS_IEEE4B__TL3:
            return isSetTl3();
        case CimPackage.PSS_IEEE4B__TL4:
            return isSetTl4();
        case CimPackage.PSS_IEEE4B__TL5:
            return isSetTl5();
        case CimPackage.PSS_IEEE4B__TL6:
            return isSetTl6();
        case CimPackage.PSS_IEEE4B__TL7:
            return isSetTl7();
        case CimPackage.PSS_IEEE4B__TL8:
            return isSetTl8();
        case CimPackage.PSS_IEEE4B__TL9:
            return isSetTl9();
        case CimPackage.PSS_IEEE4B__VHMAX:
            return isSetVhmax();
        case CimPackage.PSS_IEEE4B__VHMIN:
            return isSetVhmin();
        case CimPackage.PSS_IEEE4B__VIMAX:
            return isSetVimax();
        case CimPackage.PSS_IEEE4B__VIMIN:
            return isSetVimin();
        case CimPackage.PSS_IEEE4B__VLMAX:
            return isSetVlmax();
        case CimPackage.PSS_IEEE4B__VLMIN:
            return isSetVlmin();
        case CimPackage.PSS_IEEE4B__VSTMAX:
            return isSetVstmax();
        case CimPackage.PSS_IEEE4B__VSTMIN:
            return isSetVstmin();
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
        result.append( " (bwh1: " );
        if( bwh1ESet )
            result.append( bwh1 );
        else
            result.append( "<unset>" );
        result.append( ", bwh2: " );
        if( bwh2ESet )
            result.append( bwh2 );
        else
            result.append( "<unset>" );
        result.append( ", bwl1: " );
        if( bwl1ESet )
            result.append( bwl1 );
        else
            result.append( "<unset>" );
        result.append( ", bwl2: " );
        if( bwl2ESet )
            result.append( bwl2 );
        else
            result.append( "<unset>" );
        result.append( ", kh: " );
        if( khESet )
            result.append( kh );
        else
            result.append( "<unset>" );
        result.append( ", kh1: " );
        if( kh1ESet )
            result.append( kh1 );
        else
            result.append( "<unset>" );
        result.append( ", kh11: " );
        if( kh11ESet )
            result.append( kh11 );
        else
            result.append( "<unset>" );
        result.append( ", kh17: " );
        if( kh17ESet )
            result.append( kh17 );
        else
            result.append( "<unset>" );
        result.append( ", kh2: " );
        if( kh2ESet )
            result.append( kh2 );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", ki1: " );
        if( ki1ESet )
            result.append( ki1 );
        else
            result.append( "<unset>" );
        result.append( ", ki11: " );
        if( ki11ESet )
            result.append( ki11 );
        else
            result.append( "<unset>" );
        result.append( ", ki17: " );
        if( ki17ESet )
            result.append( ki17 );
        else
            result.append( "<unset>" );
        result.append( ", ki2: " );
        if( ki2ESet )
            result.append( ki2 );
        else
            result.append( "<unset>" );
        result.append( ", kl: " );
        if( klESet )
            result.append( kl );
        else
            result.append( "<unset>" );
        result.append( ", kl1: " );
        if( kl1ESet )
            result.append( kl1 );
        else
            result.append( "<unset>" );
        result.append( ", kl11: " );
        if( kl11ESet )
            result.append( kl11 );
        else
            result.append( "<unset>" );
        result.append( ", kl17: " );
        if( kl17ESet )
            result.append( kl17 );
        else
            result.append( "<unset>" );
        result.append( ", kl2: " );
        if( kl2ESet )
            result.append( kl2 );
        else
            result.append( "<unset>" );
        result.append( ", omeganh1: " );
        if( omeganh1ESet )
            result.append( omeganh1 );
        else
            result.append( "<unset>" );
        result.append( ", omeganh2: " );
        if( omeganh2ESet )
            result.append( omeganh2 );
        else
            result.append( "<unset>" );
        result.append( ", omeganl1: " );
        if( omeganl1ESet )
            result.append( omeganl1 );
        else
            result.append( "<unset>" );
        result.append( ", omeganl2: " );
        if( omeganl2ESet )
            result.append( omeganl2 );
        else
            result.append( "<unset>" );
        result.append( ", th1: " );
        if( th1ESet )
            result.append( th1 );
        else
            result.append( "<unset>" );
        result.append( ", th10: " );
        if( th10ESet )
            result.append( th10 );
        else
            result.append( "<unset>" );
        result.append( ", th11: " );
        if( th11ESet )
            result.append( th11 );
        else
            result.append( "<unset>" );
        result.append( ", th12: " );
        if( th12ESet )
            result.append( th12 );
        else
            result.append( "<unset>" );
        result.append( ", th2: " );
        if( th2ESet )
            result.append( th2 );
        else
            result.append( "<unset>" );
        result.append( ", th3: " );
        if( th3ESet )
            result.append( th3 );
        else
            result.append( "<unset>" );
        result.append( ", th4: " );
        if( th4ESet )
            result.append( th4 );
        else
            result.append( "<unset>" );
        result.append( ", th5: " );
        if( th5ESet )
            result.append( th5 );
        else
            result.append( "<unset>" );
        result.append( ", th6: " );
        if( th6ESet )
            result.append( th6 );
        else
            result.append( "<unset>" );
        result.append( ", th7: " );
        if( th7ESet )
            result.append( th7 );
        else
            result.append( "<unset>" );
        result.append( ", th8: " );
        if( th8ESet )
            result.append( th8 );
        else
            result.append( "<unset>" );
        result.append( ", th9: " );
        if( th9ESet )
            result.append( th9 );
        else
            result.append( "<unset>" );
        result.append( ", ti1: " );
        if( ti1ESet )
            result.append( ti1 );
        else
            result.append( "<unset>" );
        result.append( ", ti10: " );
        if( ti10ESet )
            result.append( ti10 );
        else
            result.append( "<unset>" );
        result.append( ", ti11: " );
        if( ti11ESet )
            result.append( ti11 );
        else
            result.append( "<unset>" );
        result.append( ", ti12: " );
        if( ti12ESet )
            result.append( ti12 );
        else
            result.append( "<unset>" );
        result.append( ", ti2: " );
        if( ti2ESet )
            result.append( ti2 );
        else
            result.append( "<unset>" );
        result.append( ", ti3: " );
        if( ti3ESet )
            result.append( ti3 );
        else
            result.append( "<unset>" );
        result.append( ", ti4: " );
        if( ti4ESet )
            result.append( ti4 );
        else
            result.append( "<unset>" );
        result.append( ", ti5: " );
        if( ti5ESet )
            result.append( ti5 );
        else
            result.append( "<unset>" );
        result.append( ", ti6: " );
        if( ti6ESet )
            result.append( ti6 );
        else
            result.append( "<unset>" );
        result.append( ", ti7: " );
        if( ti7ESet )
            result.append( ti7 );
        else
            result.append( "<unset>" );
        result.append( ", ti8: " );
        if( ti8ESet )
            result.append( ti8 );
        else
            result.append( "<unset>" );
        result.append( ", ti9: " );
        if( ti9ESet )
            result.append( ti9 );
        else
            result.append( "<unset>" );
        result.append( ", tl1: " );
        if( tl1ESet )
            result.append( tl1 );
        else
            result.append( "<unset>" );
        result.append( ", tl10: " );
        if( tl10ESet )
            result.append( tl10 );
        else
            result.append( "<unset>" );
        result.append( ", tl11: " );
        if( tl11ESet )
            result.append( tl11 );
        else
            result.append( "<unset>" );
        result.append( ", tl12: " );
        if( tl12ESet )
            result.append( tl12 );
        else
            result.append( "<unset>" );
        result.append( ", tl2: " );
        if( tl2ESet )
            result.append( tl2 );
        else
            result.append( "<unset>" );
        result.append( ", tl3: " );
        if( tl3ESet )
            result.append( tl3 );
        else
            result.append( "<unset>" );
        result.append( ", tl4: " );
        if( tl4ESet )
            result.append( tl4 );
        else
            result.append( "<unset>" );
        result.append( ", tl5: " );
        if( tl5ESet )
            result.append( tl5 );
        else
            result.append( "<unset>" );
        result.append( ", tl6: " );
        if( tl6ESet )
            result.append( tl6 );
        else
            result.append( "<unset>" );
        result.append( ", tl7: " );
        if( tl7ESet )
            result.append( tl7 );
        else
            result.append( "<unset>" );
        result.append( ", tl8: " );
        if( tl8ESet )
            result.append( tl8 );
        else
            result.append( "<unset>" );
        result.append( ", tl9: " );
        if( tl9ESet )
            result.append( tl9 );
        else
            result.append( "<unset>" );
        result.append( ", vhmax: " );
        if( vhmaxESet )
            result.append( vhmax );
        else
            result.append( "<unset>" );
        result.append( ", vhmin: " );
        if( vhminESet )
            result.append( vhmin );
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
        result.append( ", vlmax: " );
        if( vlmaxESet )
            result.append( vlmax );
        else
            result.append( "<unset>" );
        result.append( ", vlmin: " );
        if( vlminESet )
            result.append( vlmin );
        else
            result.append( "<unset>" );
        result.append( ", vstmax: " );
        if( vstmaxESet )
            result.append( vstmax );
        else
            result.append( "<unset>" );
        result.append( ", vstmin: " );
        if( vstminESet )
            result.append( vstmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssIEEE4BImpl
