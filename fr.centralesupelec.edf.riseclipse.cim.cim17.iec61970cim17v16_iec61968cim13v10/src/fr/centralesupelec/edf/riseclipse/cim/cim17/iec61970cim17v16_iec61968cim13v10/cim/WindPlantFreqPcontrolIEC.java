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
 * A representation of the model object '<em><b>Wind Plant Freq Pcontrol IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC()
 * @model
 * @generated
 */
public interface WindPlantFreqPcontrolIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #setDprefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.dprefmax' kind='element'"
     * @generated
     */
    Float getDprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @generated
     */
    void setDprefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    void unsetDprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmax</em>' attribute is set.
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Float)
     * @generated
     */
    boolean isSetDprefmax();

    /**
     * Returns the value of the '<em><b>Dprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dprefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #setDprefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.dprefmin' kind='element'"
     * @generated
     */
    Float getDprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @generated
     */
    void setDprefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    void unsetDprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmin</em>' attribute is set.
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Float)
     * @generated
     */
    boolean isSetDprefmin();

    /**
     * Returns the value of the '<em><b>Dpwprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpwprefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpwprefmax</em>' attribute.
     * @see #isSetDpwprefmax()
     * @see #unsetDpwprefmax()
     * @see #setDpwprefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dpwprefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.dpwprefmax' kind='element'"
     * @generated
     */
    Float getDpwprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpwprefmax</em>' attribute.
     * @see #isSetDpwprefmax()
     * @see #unsetDpwprefmax()
     * @see #getDpwprefmax()
     * @generated
     */
    void setDpwprefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpwprefmax()
     * @see #getDpwprefmax()
     * @see #setDpwprefmax(Float)
     * @generated
     */
    void unsetDpwprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpwprefmax</em>' attribute is set.
     * @see #unsetDpwprefmax()
     * @see #getDpwprefmax()
     * @see #setDpwprefmax(Float)
     * @generated
     */
    boolean isSetDpwprefmax();

    /**
     * Returns the value of the '<em><b>Dpwprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpwprefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpwprefmin</em>' attribute.
     * @see #isSetDpwprefmin()
     * @see #unsetDpwprefmin()
     * @see #setDpwprefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dpwprefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.dpwprefmin' kind='element'"
     * @generated
     */
    Float getDpwprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpwprefmin</em>' attribute.
     * @see #isSetDpwprefmin()
     * @see #unsetDpwprefmin()
     * @see #getDpwprefmin()
     * @generated
     */
    void setDpwprefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpwprefmin()
     * @see #getDpwprefmin()
     * @see #setDpwprefmin(Float)
     * @generated
     */
    void unsetDpwprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpwprefmin</em>' attribute is set.
     * @see #unsetDpwprefmin()
     * @see #getDpwprefmin()
     * @see #setDpwprefmin(Float)
     * @generated
     */
    boolean isSetDpwprefmin();

    /**
     * Returns the value of the '<em><b>Kiwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiwpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #setKiwpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.kiwpp' kind='element'"
     * @generated
     */
    Float getKiwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @generated
     */
    void setKiwpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Float)
     * @generated
     */
    void unsetKiwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpp</em>' attribute is set.
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Float)
     * @generated
     */
    boolean isSetKiwpp();

    /**
     * Returns the value of the '<em><b>Kiwppmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiwppmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiwppmax</em>' attribute.
     * @see #isSetKiwppmax()
     * @see #unsetKiwppmax()
     * @see #setKiwppmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwppmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.kiwppmax' kind='element'"
     * @generated
     */
    Float getKiwppmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwppmax</em>' attribute.
     * @see #isSetKiwppmax()
     * @see #unsetKiwppmax()
     * @see #getKiwppmax()
     * @generated
     */
    void setKiwppmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwppmax()
     * @see #getKiwppmax()
     * @see #setKiwppmax(Float)
     * @generated
     */
    void unsetKiwppmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwppmax</em>' attribute is set.
     * @see #unsetKiwppmax()
     * @see #getKiwppmax()
     * @see #setKiwppmax(Float)
     * @generated
     */
    boolean isSetKiwppmax();

    /**
     * Returns the value of the '<em><b>Kiwppmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kiwppmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kiwppmin</em>' attribute.
     * @see #isSetKiwppmin()
     * @see #unsetKiwppmin()
     * @see #setKiwppmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwppmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.kiwppmin' kind='element'"
     * @generated
     */
    Float getKiwppmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwppmin</em>' attribute.
     * @see #isSetKiwppmin()
     * @see #unsetKiwppmin()
     * @see #getKiwppmin()
     * @generated
     */
    void setKiwppmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwppmin()
     * @see #getKiwppmin()
     * @see #setKiwppmin(Float)
     * @generated
     */
    void unsetKiwppmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwppmin</em>' attribute is set.
     * @see #unsetKiwppmin()
     * @see #getKiwppmin()
     * @see #setKiwppmin(Float)
     * @generated
     */
    boolean isSetKiwppmin();

    /**
     * Returns the value of the '<em><b>Kpwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kpwpp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #setKpwpp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kpwpp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.kpwpp' kind='element'"
     * @generated
     */
    Float getKpwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @generated
     */
    void setKpwpp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Float)
     * @generated
     */
    void unsetKpwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpwpp</em>' attribute is set.
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Float)
     * @generated
     */
    boolean isSetKpwpp();

    /**
     * Returns the value of the '<em><b>Kwppref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kwppref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kwppref</em>' attribute.
     * @see #isSetKwppref()
     * @see #unsetKwppref()
     * @see #setKwppref(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kwppref()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.kwppref' kind='element'"
     * @generated
     */
    Float getKwppref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kwppref</em>' attribute.
     * @see #isSetKwppref()
     * @see #unsetKwppref()
     * @see #getKwppref()
     * @generated
     */
    void setKwppref( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKwppref()
     * @see #getKwppref()
     * @see #setKwppref(Float)
     * @generated
     */
    void unsetKwppref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kwppref</em>' attribute is set.
     * @see #unsetKwppref()
     * @see #getKwppref()
     * @see #setKwppref(Float)
     * @generated
     */
    boolean isSetKwppref();

    /**
     * Returns the value of the '<em><b>Prefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefmax</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #setPrefmax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.prefmax' kind='element'"
     * @generated
     */
    Float getPrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @generated
     */
    void setPrefmax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Float)
     * @generated
     */
    void unsetPrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmax</em>' attribute is set.
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Float)
     * @generated
     */
    boolean isSetPrefmax();

    /**
     * Returns the value of the '<em><b>Prefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefmin</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #setPrefmin(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmin()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.prefmin' kind='element'"
     * @generated
     */
    Float getPrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @generated
     */
    void setPrefmin( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Float)
     * @generated
     */
    void unsetPrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmin</em>' attribute is set.
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Float)
     * @generated
     */
    boolean isSetPrefmin();

    /**
     * Returns the value of the '<em><b>Tpft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpft</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #setTpft(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpft()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.tpft' kind='element'"
     * @generated
     */
    Float getTpft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #getTpft()
     * @generated
     */
    void setTpft( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpft()
     * @see #getTpft()
     * @see #setTpft(Float)
     * @generated
     */
    void unsetTpft();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpft</em>' attribute is set.
     * @see #unsetTpft()
     * @see #getTpft()
     * @see #setTpft(Float)
     * @generated
     */
    boolean isSetTpft();

    /**
     * Returns the value of the '<em><b>Tpfv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tpfv</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #setTpfv(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpfv()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.tpfv' kind='element'"
     * @generated
     */
    Float getTpfv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @generated
     */
    void setTpfv( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Float)
     * @generated
     */
    void unsetTpfv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfv</em>' attribute is set.
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Float)
     * @generated
     */
    boolean isSetTpfv();

    /**
     * Returns the value of the '<em><b>Twpffiltp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twpffiltp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twpffiltp</em>' attribute.
     * @see #isSetTwpffiltp()
     * @see #unsetTwpffiltp()
     * @see #setTwpffiltp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twpffiltp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.twpffiltp' kind='element'"
     * @generated
     */
    Float getTwpffiltp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpffiltp</em>' attribute.
     * @see #isSetTwpffiltp()
     * @see #unsetTwpffiltp()
     * @see #getTwpffiltp()
     * @generated
     */
    void setTwpffiltp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpffiltp()
     * @see #getTwpffiltp()
     * @see #setTwpffiltp(Float)
     * @generated
     */
    void unsetTwpffiltp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpffiltp</em>' attribute is set.
     * @see #unsetTwpffiltp()
     * @see #getTwpffiltp()
     * @see #setTwpffiltp(Float)
     * @generated
     */
    boolean isSetTwpffiltp();

    /**
     * Returns the value of the '<em><b>Twppfiltp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Twppfiltp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Twppfiltp</em>' attribute.
     * @see #isSetTwppfiltp()
     * @see #unsetTwppfiltp()
     * @see #setTwppfiltp(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twppfiltp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.twppfiltp' kind='element'"
     * @generated
     */
    Float getTwppfiltp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twppfiltp</em>' attribute.
     * @see #isSetTwppfiltp()
     * @see #unsetTwppfiltp()
     * @see #getTwppfiltp()
     * @generated
     */
    void setTwppfiltp( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwppfiltp()
     * @see #getTwppfiltp()
     * @see #setTwppfiltp(Float)
     * @generated
     */
    void unsetTwppfiltp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twppfiltp</em>' attribute is set.
     * @see #unsetTwppfiltp()
     * @see #getTwppfiltp()
     * @see #setTwppfiltp(Float)
     * @generated
     */
    boolean isSetTwppfiltp();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Dynamics Lookup Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.WindDynamicsLookupTable' kind='element'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Wind Plant IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Plant IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindPlantIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindPlantFreqPcontrolIEC.WindPlantIEC' kind='element'"
     * @generated
     */
    WindPlantIEC getWindPlantIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @generated
     */
    void setWindPlantIEC( WindPlantIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    void unsetWindPlantIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant IEC</em>' reference is set.
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    boolean isSetWindPlantIEC();

} // WindPlantFreqPcontrolIEC
