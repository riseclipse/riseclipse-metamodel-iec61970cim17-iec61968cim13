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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VAdj IEEE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaoff <em>Taoff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaon <em>Taon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE()
 * @model
 * @generated
 */
public interface VAdjIEEE extends VoltageAdjusterDynamics {
    /**
     * Returns the value of the '<em><b>Adjslew</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Adjslew</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Adjslew</em>' attribute.
     * @see #isSetAdjslew()
     * @see #unsetAdjslew()
     * @see #setAdjslew(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Adjslew()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.adjslew' kind='element'"
     * @generated
     */
    Float getAdjslew();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Adjslew</em>' attribute.
     * @see #isSetAdjslew()
     * @see #unsetAdjslew()
     * @see #getAdjslew()
     * @generated
     */
    void setAdjslew( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAdjslew()
     * @see #getAdjslew()
     * @see #setAdjslew(Float)
     * @generated
     */
    void unsetAdjslew();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Adjslew</em>' attribute is set.
     * @see #unsetAdjslew()
     * @see #getAdjslew()
     * @see #setAdjslew(Float)
     * @generated
     */
    boolean isSetAdjslew();

    /**
     * Returns the value of the '<em><b>Taoff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Taoff</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Taoff</em>' attribute.
     * @see #isSetTaoff()
     * @see #unsetTaoff()
     * @see #setTaoff(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Taoff()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.taoff' kind='element'"
     * @generated
     */
    Float getTaoff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Taoff</em>' attribute.
     * @see #isSetTaoff()
     * @see #unsetTaoff()
     * @see #getTaoff()
     * @generated
     */
    void setTaoff( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaoff()
     * @see #getTaoff()
     * @see #setTaoff(Float)
     * @generated
     */
    void unsetTaoff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Taoff</em>' attribute is set.
     * @see #unsetTaoff()
     * @see #getTaoff()
     * @see #setTaoff(Float)
     * @generated
     */
    boolean isSetTaoff();

    /**
     * Returns the value of the '<em><b>Taon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Taon</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Taon</em>' attribute.
     * @see #isSetTaon()
     * @see #unsetTaon()
     * @see #setTaon(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Taon()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.taon' kind='element'"
     * @generated
     */
    Float getTaon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Taon</em>' attribute.
     * @see #isSetTaon()
     * @see #unsetTaon()
     * @see #getTaon()
     * @generated
     */
    void setTaon( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaon()
     * @see #getTaon()
     * @see #setTaon(Float)
     * @generated
     */
    void unsetTaon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Taon</em>' attribute is set.
     * @see #unsetTaon()
     * @see #getTaon()
     * @see #setTaon(Float)
     * @generated
     */
    boolean isSetTaon();

    /**
     * Returns the value of the '<em><b>Vadjf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vadjf</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vadjf</em>' attribute.
     * @see #isSetVadjf()
     * @see #unsetVadjf()
     * @see #setVadjf(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Vadjf()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.vadjf' kind='element'"
     * @generated
     */
    Float getVadjf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjf</em>' attribute.
     * @see #isSetVadjf()
     * @see #unsetVadjf()
     * @see #getVadjf()
     * @generated
     */
    void setVadjf( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjf()
     * @see #getVadjf()
     * @see #setVadjf(Float)
     * @generated
     */
    void unsetVadjf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjf</em>' attribute is set.
     * @see #unsetVadjf()
     * @see #getVadjf()
     * @see #setVadjf(Float)
     * @generated
     */
    boolean isSetVadjf();

    /**
     * Returns the value of the '<em><b>Vadjmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vadjmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vadjmax</em>' attribute.
     * @see #isSetVadjmax()
     * @see #unsetVadjmax()
     * @see #setVadjmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Vadjmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.vadjmax' kind='element'"
     * @generated
     */
    Float getVadjmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjmax</em>' attribute.
     * @see #isSetVadjmax()
     * @see #unsetVadjmax()
     * @see #getVadjmax()
     * @generated
     */
    void setVadjmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjmax()
     * @see #getVadjmax()
     * @see #setVadjmax(Float)
     * @generated
     */
    void unsetVadjmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjmax</em>' attribute is set.
     * @see #unsetVadjmax()
     * @see #getVadjmax()
     * @see #setVadjmax(Float)
     * @generated
     */
    boolean isSetVadjmax();

    /**
     * Returns the value of the '<em><b>Vadjmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Vadjmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Vadjmin</em>' attribute.
     * @see #isSetVadjmin()
     * @see #unsetVadjmin()
     * @see #setVadjmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVAdjIEEE_Vadjmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VAdjIEEE.vadjmin' kind='element'"
     * @generated
     */
    Float getVadjmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjmin</em>' attribute.
     * @see #isSetVadjmin()
     * @see #unsetVadjmin()
     * @see #getVadjmin()
     * @generated
     */
    void setVadjmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjmin()
     * @see #getVadjmin()
     * @see #setVadjmin(Float)
     * @generated
     */
    void unsetVadjmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjmin</em>' attribute is set.
     * @see #unsetVadjmin()
     * @see #getVadjmin()
     * @see #setVadjmin(Float)
     * @generated
     */
    boolean isSetVadjmin();

} // VAdjIEEE
