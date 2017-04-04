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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCityCode <em>City Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getDialOut <em>Dial Out</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getExtension <em>Extension</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getInternationalPrefix <em>International Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getItuPhone <em>Itu Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber()
 * @model
 * @generated
 */
public interface TelephoneNumber extends EObject {
    /**
     * Returns the value of the '<em><b>Area Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Area Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Area Code</em>' attribute.
     * @see #isSetAreaCode()
     * @see #unsetAreaCode()
     * @see #setAreaCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_AreaCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.areaCode' kind='element'"
     * @generated
     */
    String getAreaCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Area Code</em>' attribute.
     * @see #isSetAreaCode()
     * @see #unsetAreaCode()
     * @see #getAreaCode()
     * @generated
     */
    void setAreaCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAreaCode()
     * @see #getAreaCode()
     * @see #setAreaCode(String)
     * @generated
     */
    void unsetAreaCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getAreaCode <em>Area Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Area Code</em>' attribute is set.
     * @see #unsetAreaCode()
     * @see #getAreaCode()
     * @see #setAreaCode(String)
     * @generated
     */
    boolean isSetAreaCode();

    /**
     * Returns the value of the '<em><b>City Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>City Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>City Code</em>' attribute.
     * @see #isSetCityCode()
     * @see #unsetCityCode()
     * @see #setCityCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_CityCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.cityCode' kind='element'"
     * @generated
     */
    String getCityCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>City Code</em>' attribute.
     * @see #isSetCityCode()
     * @see #unsetCityCode()
     * @see #getCityCode()
     * @generated
     */
    void setCityCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCityCode()
     * @see #getCityCode()
     * @see #setCityCode(String)
     * @generated
     */
    void unsetCityCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCityCode <em>City Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>City Code</em>' attribute is set.
     * @see #unsetCityCode()
     * @see #getCityCode()
     * @see #setCityCode(String)
     * @generated
     */
    boolean isSetCityCode();

    /**
     * Returns the value of the '<em><b>Country Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Country Code</em>' attribute.
     * @see #isSetCountryCode()
     * @see #unsetCountryCode()
     * @see #setCountryCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_CountryCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.countryCode' kind='element'"
     * @generated
     */
    String getCountryCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Country Code</em>' attribute.
     * @see #isSetCountryCode()
     * @see #unsetCountryCode()
     * @see #getCountryCode()
     * @generated
     */
    void setCountryCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCountryCode()
     * @see #getCountryCode()
     * @see #setCountryCode(String)
     * @generated
     */
    void unsetCountryCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getCountryCode <em>Country Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Country Code</em>' attribute is set.
     * @see #unsetCountryCode()
     * @see #getCountryCode()
     * @see #setCountryCode(String)
     * @generated
     */
    boolean isSetCountryCode();

    /**
     * Returns the value of the '<em><b>Dial Out</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dial Out</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dial Out</em>' attribute.
     * @see #isSetDialOut()
     * @see #unsetDialOut()
     * @see #setDialOut(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_DialOut()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.dialOut' kind='element'"
     * @generated
     */
    String getDialOut();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getDialOut <em>Dial Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dial Out</em>' attribute.
     * @see #isSetDialOut()
     * @see #unsetDialOut()
     * @see #getDialOut()
     * @generated
     */
    void setDialOut( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getDialOut <em>Dial Out</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDialOut()
     * @see #getDialOut()
     * @see #setDialOut(String)
     * @generated
     */
    void unsetDialOut();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getDialOut <em>Dial Out</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dial Out</em>' attribute is set.
     * @see #unsetDialOut()
     * @see #getDialOut()
     * @see #setDialOut(String)
     * @generated
     */
    boolean isSetDialOut();

    /**
     * Returns the value of the '<em><b>Extension</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Extension</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Extension</em>' attribute.
     * @see #isSetExtension()
     * @see #unsetExtension()
     * @see #setExtension(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_Extension()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.extension' kind='element'"
     * @generated
     */
    String getExtension();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Extension</em>' attribute.
     * @see #isSetExtension()
     * @see #unsetExtension()
     * @see #getExtension()
     * @generated
     */
    void setExtension( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExtension()
     * @see #getExtension()
     * @see #setExtension(String)
     * @generated
     */
    void unsetExtension();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getExtension <em>Extension</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Extension</em>' attribute is set.
     * @see #unsetExtension()
     * @see #getExtension()
     * @see #setExtension(String)
     * @generated
     */
    boolean isSetExtension();

    /**
     * Returns the value of the '<em><b>International Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>International Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>International Prefix</em>' attribute.
     * @see #isSetInternationalPrefix()
     * @see #unsetInternationalPrefix()
     * @see #setInternationalPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_InternationalPrefix()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.internationalPrefix' kind='element'"
     * @generated
     */
    String getInternationalPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getInternationalPrefix <em>International Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>International Prefix</em>' attribute.
     * @see #isSetInternationalPrefix()
     * @see #unsetInternationalPrefix()
     * @see #getInternationalPrefix()
     * @generated
     */
    void setInternationalPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getInternationalPrefix <em>International Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInternationalPrefix()
     * @see #getInternationalPrefix()
     * @see #setInternationalPrefix(String)
     * @generated
     */
    void unsetInternationalPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getInternationalPrefix <em>International Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>International Prefix</em>' attribute is set.
     * @see #unsetInternationalPrefix()
     * @see #getInternationalPrefix()
     * @see #setInternationalPrefix(String)
     * @generated
     */
    boolean isSetInternationalPrefix();

    /**
     * Returns the value of the '<em><b>Itu Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Itu Phone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Itu Phone</em>' attribute.
     * @see #isSetItuPhone()
     * @see #unsetItuPhone()
     * @see #setItuPhone(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_ItuPhone()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.ituPhone' kind='element'"
     * @generated
     */
    String getItuPhone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getItuPhone <em>Itu Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Itu Phone</em>' attribute.
     * @see #isSetItuPhone()
     * @see #unsetItuPhone()
     * @see #getItuPhone()
     * @generated
     */
    void setItuPhone( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getItuPhone <em>Itu Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetItuPhone()
     * @see #getItuPhone()
     * @see #setItuPhone(String)
     * @generated
     */
    void unsetItuPhone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getItuPhone <em>Itu Phone</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Itu Phone</em>' attribute is set.
     * @see #unsetItuPhone()
     * @see #getItuPhone()
     * @see #setItuPhone(String)
     * @generated
     */
    boolean isSetItuPhone();

    /**
     * Returns the value of the '<em><b>Local Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Number</em>' attribute.
     * @see #isSetLocalNumber()
     * @see #unsetLocalNumber()
     * @see #setLocalNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTelephoneNumber_LocalNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TelephoneNumber.localNumber' kind='element'"
     * @generated
     */
    String getLocalNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Number</em>' attribute.
     * @see #isSetLocalNumber()
     * @see #unsetLocalNumber()
     * @see #getLocalNumber()
     * @generated
     */
    void setLocalNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocalNumber()
     * @see #getLocalNumber()
     * @see #setLocalNumber(String)
     * @generated
     */
    void unsetLocalNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TelephoneNumber#getLocalNumber <em>Local Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Local Number</em>' attribute is set.
     * @see #unsetLocalNumber()
     * @see #getLocalNumber()
     * @see #setLocalNumber(String)
     * @generated
     */
    boolean isSetLocalNumber();

} // TelephoneNumber
