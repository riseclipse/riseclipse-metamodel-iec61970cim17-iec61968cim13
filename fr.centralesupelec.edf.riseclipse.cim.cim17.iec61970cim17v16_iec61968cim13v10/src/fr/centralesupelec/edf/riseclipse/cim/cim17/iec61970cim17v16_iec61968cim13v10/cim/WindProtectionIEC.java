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
 * A representation of the model object '<em><b>Wind Protection IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFover <em>Fover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFunder <em>Funder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getMzc <em>Mzc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getTfma <em>Tfma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUover <em>Uover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUunder <em>Uunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC()
 * @model
 * @generated
 */
public interface WindProtectionIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dfimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dfimax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dfimax</em>' attribute.
     * @see #isSetDfimax()
     * @see #unsetDfimax()
     * @see #setDfimax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Dfimax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.dfimax' kind='element'"
     * @generated
     */
    Float getDfimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dfimax</em>' attribute.
     * @see #isSetDfimax()
     * @see #unsetDfimax()
     * @see #getDfimax()
     * @generated
     */
    void setDfimax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDfimax()
     * @see #getDfimax()
     * @see #setDfimax(Float)
     * @generated
     */
    void unsetDfimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dfimax</em>' attribute is set.
     * @see #unsetDfimax()
     * @see #getDfimax()
     * @see #setDfimax(Float)
     * @generated
     */
    boolean isSetDfimax();

    /**
     * Returns the value of the '<em><b>Fover</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fover</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fover</em>' attribute.
     * @see #isSetFover()
     * @see #unsetFover()
     * @see #setFover(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Fover()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.fover' kind='element'"
     * @generated
     */
    Float getFover();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fover</em>' attribute.
     * @see #isSetFover()
     * @see #unsetFover()
     * @see #getFover()
     * @generated
     */
    void setFover( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFover()
     * @see #getFover()
     * @see #setFover(Float)
     * @generated
     */
    void unsetFover();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fover</em>' attribute is set.
     * @see #unsetFover()
     * @see #getFover()
     * @see #setFover(Float)
     * @generated
     */
    boolean isSetFover();

    /**
     * Returns the value of the '<em><b>Funder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Funder</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Funder</em>' attribute.
     * @see #isSetFunder()
     * @see #unsetFunder()
     * @see #setFunder(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Funder()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.funder' kind='element'"
     * @generated
     */
    Float getFunder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Funder</em>' attribute.
     * @see #isSetFunder()
     * @see #unsetFunder()
     * @see #getFunder()
     * @generated
     */
    void setFunder( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunder()
     * @see #getFunder()
     * @see #setFunder(Float)
     * @generated
     */
    void unsetFunder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Funder</em>' attribute is set.
     * @see #unsetFunder()
     * @see #getFunder()
     * @see #setFunder(Float)
     * @generated
     */
    boolean isSetFunder();

    /**
     * Returns the value of the '<em><b>Mzc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mzc</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mzc</em>' attribute.
     * @see #isSetMzc()
     * @see #unsetMzc()
     * @see #setMzc(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Mzc()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.mzc' kind='element'"
     * @generated
     */
    Boolean getMzc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mzc</em>' attribute.
     * @see #isSetMzc()
     * @see #unsetMzc()
     * @see #getMzc()
     * @generated
     */
    void setMzc( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMzc()
     * @see #getMzc()
     * @see #setMzc(Boolean)
     * @generated
     */
    void unsetMzc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mzc</em>' attribute is set.
     * @see #unsetMzc()
     * @see #getMzc()
     * @see #setMzc(Boolean)
     * @generated
     */
    boolean isSetMzc();

    /**
     * Returns the value of the '<em><b>Tfma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tfma</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tfma</em>' attribute.
     * @see #isSetTfma()
     * @see #unsetTfma()
     * @see #setTfma(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Tfma()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.tfma' kind='element'"
     * @generated
     */
    Float getTfma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfma</em>' attribute.
     * @see #isSetTfma()
     * @see #unsetTfma()
     * @see #getTfma()
     * @generated
     */
    void setTfma( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfma()
     * @see #getTfma()
     * @see #setTfma(Float)
     * @generated
     */
    void unsetTfma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfma</em>' attribute is set.
     * @see #unsetTfma()
     * @see #getTfma()
     * @see #setTfma(Float)
     * @generated
     */
    boolean isSetTfma();

    /**
     * Returns the value of the '<em><b>Uover</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uover</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uover</em>' attribute.
     * @see #isSetUover()
     * @see #unsetUover()
     * @see #setUover(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Uover()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.uover' kind='element'"
     * @generated
     */
    Float getUover();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uover</em>' attribute.
     * @see #isSetUover()
     * @see #unsetUover()
     * @see #getUover()
     * @generated
     */
    void setUover( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUover()
     * @see #getUover()
     * @see #setUover(Float)
     * @generated
     */
    void unsetUover();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uover</em>' attribute is set.
     * @see #unsetUover()
     * @see #getUover()
     * @see #setUover(Float)
     * @generated
     */
    boolean isSetUover();

    /**
     * Returns the value of the '<em><b>Uunder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Uunder</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Uunder</em>' attribute.
     * @see #isSetUunder()
     * @see #unsetUunder()
     * @see #setUunder(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_Uunder()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.uunder' kind='element'"
     * @generated
     */
    Float getUunder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uunder</em>' attribute.
     * @see #isSetUunder()
     * @see #unsetUunder()
     * @see #getUunder()
     * @generated
     */
    void setUunder( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUunder()
     * @see #getUunder()
     * @see #setUunder(Float)
     * @generated
     */
    void unsetUunder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uunder</em>' attribute is set.
     * @see #unsetUunder()
     * @see #getUunder()
     * @see #setUunder(Float)
     * @generated
     */
    boolean isSetUunder();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type3or4 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.WindTurbineType3or4IEC' kind='element'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @generated
     */
    void setWindTurbineType3or4IEC( WindTurbineType3or4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    boolean isSetWindTurbineType3or4IEC();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type1or2 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_WindTurbineType1or2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.WindTurbineType1or2IEC' kind='element'"
     * @generated
     */
    WindTurbineType1or2IEC getWindTurbineType1or2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @generated
     */
    void setWindTurbineType1or2IEC( WindTurbineType1or2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    void unsetWindTurbineType1or2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference is set.
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    boolean isSetWindTurbineType1or2IEC();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindProtectionIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindProtectionIEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

} // WindProtectionIEC
