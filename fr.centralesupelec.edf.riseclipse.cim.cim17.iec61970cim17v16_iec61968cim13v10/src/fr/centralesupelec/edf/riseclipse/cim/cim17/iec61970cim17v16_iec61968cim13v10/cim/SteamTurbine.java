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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Steam Turbine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine()
 * @model
 * @generated
 */
public interface SteamTurbine extends PrimeMover {
    /**
     * Returns the value of the '<em><b>Crossover TC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crossover TC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crossover TC</em>' attribute.
     * @see #isSetCrossoverTC()
     * @see #unsetCrossoverTC()
     * @see #setCrossoverTC(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_CrossoverTC()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.crossoverTC' kind='element'"
     * @generated
     */
    Float getCrossoverTC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crossover TC</em>' attribute.
     * @see #isSetCrossoverTC()
     * @see #unsetCrossoverTC()
     * @see #getCrossoverTC()
     * @generated
     */
    void setCrossoverTC( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrossoverTC()
     * @see #getCrossoverTC()
     * @see #setCrossoverTC(Float)
     * @generated
     */
    void unsetCrossoverTC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getCrossoverTC <em>Crossover TC</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crossover TC</em>' attribute is set.
     * @see #unsetCrossoverTC()
     * @see #getCrossoverTC()
     * @see #setCrossoverTC(Float)
     * @generated
     */
    boolean isSetCrossoverTC();

    /**
     * Returns the value of the '<em><b>Reheater1 TC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reheater1 TC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reheater1 TC</em>' attribute.
     * @see #isSetReheater1TC()
     * @see #unsetReheater1TC()
     * @see #setReheater1TC(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Reheater1TC()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.reheater1TC' kind='element'"
     * @generated
     */
    Float getReheater1TC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reheater1 TC</em>' attribute.
     * @see #isSetReheater1TC()
     * @see #unsetReheater1TC()
     * @see #getReheater1TC()
     * @generated
     */
    void setReheater1TC( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReheater1TC()
     * @see #getReheater1TC()
     * @see #setReheater1TC(Float)
     * @generated
     */
    void unsetReheater1TC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater1TC <em>Reheater1 TC</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reheater1 TC</em>' attribute is set.
     * @see #unsetReheater1TC()
     * @see #getReheater1TC()
     * @see #setReheater1TC(Float)
     * @generated
     */
    boolean isSetReheater1TC();

    /**
     * Returns the value of the '<em><b>Reheater2 TC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reheater2 TC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reheater2 TC</em>' attribute.
     * @see #isSetReheater2TC()
     * @see #unsetReheater2TC()
     * @see #setReheater2TC(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Reheater2TC()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.reheater2TC' kind='element'"
     * @generated
     */
    Float getReheater2TC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reheater2 TC</em>' attribute.
     * @see #isSetReheater2TC()
     * @see #unsetReheater2TC()
     * @see #getReheater2TC()
     * @generated
     */
    void setReheater2TC( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReheater2TC()
     * @see #getReheater2TC()
     * @see #setReheater2TC(Float)
     * @generated
     */
    void unsetReheater2TC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getReheater2TC <em>Reheater2 TC</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reheater2 TC</em>' attribute is set.
     * @see #unsetReheater2TC()
     * @see #getReheater2TC()
     * @see #setReheater2TC(Float)
     * @generated
     */
    boolean isSetReheater2TC();

    /**
     * Returns the value of the '<em><b>Shaft1 Power HP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft1 Power HP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft1 Power HP</em>' attribute.
     * @see #isSetShaft1PowerHP()
     * @see #unsetShaft1PowerHP()
     * @see #setShaft1PowerHP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft1PowerHP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft1PowerHP' kind='element'"
     * @generated
     */
    Float getShaft1PowerHP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft1 Power HP</em>' attribute.
     * @see #isSetShaft1PowerHP()
     * @see #unsetShaft1PowerHP()
     * @see #getShaft1PowerHP()
     * @generated
     */
    void setShaft1PowerHP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft1PowerHP()
     * @see #getShaft1PowerHP()
     * @see #setShaft1PowerHP(Float)
     * @generated
     */
    void unsetShaft1PowerHP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerHP <em>Shaft1 Power HP</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft1 Power HP</em>' attribute is set.
     * @see #unsetShaft1PowerHP()
     * @see #getShaft1PowerHP()
     * @see #setShaft1PowerHP(Float)
     * @generated
     */
    boolean isSetShaft1PowerHP();

    /**
     * Returns the value of the '<em><b>Shaft1 Power IP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft1 Power IP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft1 Power IP</em>' attribute.
     * @see #isSetShaft1PowerIP()
     * @see #unsetShaft1PowerIP()
     * @see #setShaft1PowerIP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft1PowerIP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft1PowerIP' kind='element'"
     * @generated
     */
    Float getShaft1PowerIP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft1 Power IP</em>' attribute.
     * @see #isSetShaft1PowerIP()
     * @see #unsetShaft1PowerIP()
     * @see #getShaft1PowerIP()
     * @generated
     */
    void setShaft1PowerIP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft1PowerIP()
     * @see #getShaft1PowerIP()
     * @see #setShaft1PowerIP(Float)
     * @generated
     */
    void unsetShaft1PowerIP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerIP <em>Shaft1 Power IP</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft1 Power IP</em>' attribute is set.
     * @see #unsetShaft1PowerIP()
     * @see #getShaft1PowerIP()
     * @see #setShaft1PowerIP(Float)
     * @generated
     */
    boolean isSetShaft1PowerIP();

    /**
     * Returns the value of the '<em><b>Shaft1 Power LP1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft1 Power LP1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft1 Power LP1</em>' attribute.
     * @see #isSetShaft1PowerLP1()
     * @see #unsetShaft1PowerLP1()
     * @see #setShaft1PowerLP1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft1PowerLP1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft1PowerLP1' kind='element'"
     * @generated
     */
    Float getShaft1PowerLP1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft1 Power LP1</em>' attribute.
     * @see #isSetShaft1PowerLP1()
     * @see #unsetShaft1PowerLP1()
     * @see #getShaft1PowerLP1()
     * @generated
     */
    void setShaft1PowerLP1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft1PowerLP1()
     * @see #getShaft1PowerLP1()
     * @see #setShaft1PowerLP1(Float)
     * @generated
     */
    void unsetShaft1PowerLP1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft1 Power LP1</em>' attribute is set.
     * @see #unsetShaft1PowerLP1()
     * @see #getShaft1PowerLP1()
     * @see #setShaft1PowerLP1(Float)
     * @generated
     */
    boolean isSetShaft1PowerLP1();

    /**
     * Returns the value of the '<em><b>Shaft1 Power LP2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft1 Power LP2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft1 Power LP2</em>' attribute.
     * @see #isSetShaft1PowerLP2()
     * @see #unsetShaft1PowerLP2()
     * @see #setShaft1PowerLP2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft1PowerLP2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft1PowerLP2' kind='element'"
     * @generated
     */
    Float getShaft1PowerLP2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft1 Power LP2</em>' attribute.
     * @see #isSetShaft1PowerLP2()
     * @see #unsetShaft1PowerLP2()
     * @see #getShaft1PowerLP2()
     * @generated
     */
    void setShaft1PowerLP2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft1PowerLP2()
     * @see #getShaft1PowerLP2()
     * @see #setShaft1PowerLP2(Float)
     * @generated
     */
    void unsetShaft1PowerLP2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft1 Power LP2</em>' attribute is set.
     * @see #unsetShaft1PowerLP2()
     * @see #getShaft1PowerLP2()
     * @see #setShaft1PowerLP2(Float)
     * @generated
     */
    boolean isSetShaft1PowerLP2();

    /**
     * Returns the value of the '<em><b>Shaft2 Power HP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft2 Power HP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft2 Power HP</em>' attribute.
     * @see #isSetShaft2PowerHP()
     * @see #unsetShaft2PowerHP()
     * @see #setShaft2PowerHP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft2PowerHP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft2PowerHP' kind='element'"
     * @generated
     */
    Float getShaft2PowerHP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft2 Power HP</em>' attribute.
     * @see #isSetShaft2PowerHP()
     * @see #unsetShaft2PowerHP()
     * @see #getShaft2PowerHP()
     * @generated
     */
    void setShaft2PowerHP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft2PowerHP()
     * @see #getShaft2PowerHP()
     * @see #setShaft2PowerHP(Float)
     * @generated
     */
    void unsetShaft2PowerHP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerHP <em>Shaft2 Power HP</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft2 Power HP</em>' attribute is set.
     * @see #unsetShaft2PowerHP()
     * @see #getShaft2PowerHP()
     * @see #setShaft2PowerHP(Float)
     * @generated
     */
    boolean isSetShaft2PowerHP();

    /**
     * Returns the value of the '<em><b>Shaft2 Power IP</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft2 Power IP</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft2 Power IP</em>' attribute.
     * @see #isSetShaft2PowerIP()
     * @see #unsetShaft2PowerIP()
     * @see #setShaft2PowerIP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft2PowerIP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft2PowerIP' kind='element'"
     * @generated
     */
    Float getShaft2PowerIP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft2 Power IP</em>' attribute.
     * @see #isSetShaft2PowerIP()
     * @see #unsetShaft2PowerIP()
     * @see #getShaft2PowerIP()
     * @generated
     */
    void setShaft2PowerIP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft2PowerIP()
     * @see #getShaft2PowerIP()
     * @see #setShaft2PowerIP(Float)
     * @generated
     */
    void unsetShaft2PowerIP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerIP <em>Shaft2 Power IP</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft2 Power IP</em>' attribute is set.
     * @see #unsetShaft2PowerIP()
     * @see #getShaft2PowerIP()
     * @see #setShaft2PowerIP(Float)
     * @generated
     */
    boolean isSetShaft2PowerIP();

    /**
     * Returns the value of the '<em><b>Shaft2 Power LP1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft2 Power LP1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft2 Power LP1</em>' attribute.
     * @see #isSetShaft2PowerLP1()
     * @see #unsetShaft2PowerLP1()
     * @see #setShaft2PowerLP1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft2PowerLP1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft2PowerLP1' kind='element'"
     * @generated
     */
    Float getShaft2PowerLP1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft2 Power LP1</em>' attribute.
     * @see #isSetShaft2PowerLP1()
     * @see #unsetShaft2PowerLP1()
     * @see #getShaft2PowerLP1()
     * @generated
     */
    void setShaft2PowerLP1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft2PowerLP1()
     * @see #getShaft2PowerLP1()
     * @see #setShaft2PowerLP1(Float)
     * @generated
     */
    void unsetShaft2PowerLP1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft2 Power LP1</em>' attribute is set.
     * @see #unsetShaft2PowerLP1()
     * @see #getShaft2PowerLP1()
     * @see #setShaft2PowerLP1(Float)
     * @generated
     */
    boolean isSetShaft2PowerLP1();

    /**
     * Returns the value of the '<em><b>Shaft2 Power LP2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Shaft2 Power LP2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Shaft2 Power LP2</em>' attribute.
     * @see #isSetShaft2PowerLP2()
     * @see #unsetShaft2PowerLP2()
     * @see #setShaft2PowerLP2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_Shaft2PowerLP2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.shaft2PowerLP2' kind='element'"
     * @generated
     */
    Float getShaft2PowerLP2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Shaft2 Power LP2</em>' attribute.
     * @see #isSetShaft2PowerLP2()
     * @see #unsetShaft2PowerLP2()
     * @see #getShaft2PowerLP2()
     * @generated
     */
    void setShaft2PowerLP2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShaft2PowerLP2()
     * @see #getShaft2PowerLP2()
     * @see #setShaft2PowerLP2(Float)
     * @generated
     */
    void unsetShaft2PowerLP2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Shaft2 Power LP2</em>' attribute is set.
     * @see #unsetShaft2PowerLP2()
     * @see #getShaft2PowerLP2()
     * @see #setShaft2PowerLP2(Float)
     * @generated
     */
    boolean isSetShaft2PowerLP2();

    /**
     * Returns the value of the '<em><b>Steam Chest TC</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Chest TC</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Chest TC</em>' attribute.
     * @see #isSetSteamChestTC()
     * @see #unsetSteamChestTC()
     * @see #setSteamChestTC(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_SteamChestTC()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.steamChestTC' kind='element'"
     * @generated
     */
    Float getSteamChestTC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Steam Chest TC</em>' attribute.
     * @see #isSetSteamChestTC()
     * @see #unsetSteamChestTC()
     * @see #getSteamChestTC()
     * @generated
     */
    void setSteamChestTC( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamChestTC()
     * @see #getSteamChestTC()
     * @see #setSteamChestTC(Float)
     * @generated
     */
    void unsetSteamChestTC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamChestTC <em>Steam Chest TC</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Chest TC</em>' attribute is set.
     * @see #unsetSteamChestTC()
     * @see #getSteamChestTC()
     * @see #setSteamChestTC(Float)
     * @generated
     */
    boolean isSetSteamChestTC();

    /**
     * Returns the value of the '<em><b>Steam Supplys</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamTurbines <em>Steam Turbines</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Steam Supplys</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Steam Supplys</em>' reference list.
     * @see #isSetSteamSupplys()
     * @see #unsetSteamSupplys()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSteamTurbine_SteamSupplys()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply#getSteamTurbines
     * @model opposite="SteamTurbines" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SteamTurbine.SteamSupplys' kind='element'"
     * @generated
     */
    EList< SteamSupply > getSteamSupplys();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSteamSupplys()
     * @see #getSteamSupplys()
     * @generated
     */
    void unsetSteamSupplys();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine#getSteamSupplys <em>Steam Supplys</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Steam Supplys</em>' reference list is set.
     * @see #unsetSteamSupplys()
     * @see #getSteamSupplys()
     * @generated
     */
    boolean isSetSteamSupplys();

} // SteamTurbine
