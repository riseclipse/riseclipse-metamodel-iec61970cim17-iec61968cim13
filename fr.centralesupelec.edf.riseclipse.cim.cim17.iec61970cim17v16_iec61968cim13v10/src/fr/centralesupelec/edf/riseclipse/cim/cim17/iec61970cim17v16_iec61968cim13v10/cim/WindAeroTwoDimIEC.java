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
 * A representation of the model object '<em><b>Wind Aero Two Dim IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC()
 * @model
 * @generated
 */
public interface WindAeroTwoDimIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Dpomega</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpomega</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #setDpomega(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Dpomega()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.dpomega' kind='element'"
     * @generated
     */
    Float getDpomega();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpomega</em>' attribute.
     * @see #isSetDpomega()
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @generated
     */
    void setDpomega( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Float)
     * @generated
     */
    void unsetDpomega();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpomega <em>Dpomega</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpomega</em>' attribute is set.
     * @see #unsetDpomega()
     * @see #getDpomega()
     * @see #setDpomega(Float)
     * @generated
     */
    boolean isSetDpomega();

    /**
     * Returns the value of the '<em><b>Dptheta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dptheta</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #setDptheta(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Dptheta()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.dptheta' kind='element'"
     * @generated
     */
    Float getDptheta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dptheta</em>' attribute.
     * @see #isSetDptheta()
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @generated
     */
    void setDptheta( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Float)
     * @generated
     */
    void unsetDptheta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDptheta <em>Dptheta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dptheta</em>' attribute is set.
     * @see #unsetDptheta()
     * @see #getDptheta()
     * @see #setDptheta(Float)
     * @generated
     */
    boolean isSetDptheta();

    /**
     * Returns the value of the '<em><b>Dpv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dpv1</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dpv1</em>' attribute.
     * @see #isSetDpv1()
     * @see #unsetDpv1()
     * @see #setDpv1(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Dpv1()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.dpv1' kind='element'"
     * @generated
     */
    Float getDpv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpv1</em>' attribute.
     * @see #isSetDpv1()
     * @see #unsetDpv1()
     * @see #getDpv1()
     * @generated
     */
    void setDpv1( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpv1()
     * @see #getDpv1()
     * @see #setDpv1(Float)
     * @generated
     */
    void unsetDpv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getDpv1 <em>Dpv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpv1</em>' attribute is set.
     * @see #unsetDpv1()
     * @see #getDpv1()
     * @see #setDpv1(Float)
     * @generated
     */
    boolean isSetDpv1();

    /**
     * Returns the value of the '<em><b>Omegazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Omegazero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #setOmegazero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Omegazero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.omegazero' kind='element'"
     * @generated
     */
    Float getOmegazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegazero</em>' attribute.
     * @see #isSetOmegazero()
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @generated
     */
    void setOmegazero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Float)
     * @generated
     */
    void unsetOmegazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getOmegazero <em>Omegazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegazero</em>' attribute is set.
     * @see #unsetOmegazero()
     * @see #getOmegazero()
     * @see #setOmegazero(Float)
     * @generated
     */
    boolean isSetOmegazero();

    /**
     * Returns the value of the '<em><b>Pavail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pavail</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #setPavail(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Pavail()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.pavail' kind='element'"
     * @generated
     */
    Float getPavail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pavail</em>' attribute.
     * @see #isSetPavail()
     * @see #unsetPavail()
     * @see #getPavail()
     * @generated
     */
    void setPavail( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPavail()
     * @see #getPavail()
     * @see #setPavail(Float)
     * @generated
     */
    void unsetPavail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getPavail <em>Pavail</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pavail</em>' attribute is set.
     * @see #unsetPavail()
     * @see #getPavail()
     * @see #setPavail(Float)
     * @generated
     */
    boolean isSetPavail();

    /**
     * Returns the value of the '<em><b>Thetav2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetav2</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetav2</em>' attribute.
     * @see #isSetThetav2()
     * @see #unsetThetav2()
     * @see #setThetav2(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Thetav2()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.thetav2' kind='element'"
     * @generated
     */
    Float getThetav2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetav2</em>' attribute.
     * @see #isSetThetav2()
     * @see #unsetThetav2()
     * @see #getThetav2()
     * @generated
     */
    void setThetav2( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetav2()
     * @see #getThetav2()
     * @see #setThetav2(Float)
     * @generated
     */
    void unsetThetav2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetav2 <em>Thetav2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetav2</em>' attribute is set.
     * @see #unsetThetav2()
     * @see #getThetav2()
     * @see #setThetav2(Float)
     * @generated
     */
    boolean isSetThetav2();

    /**
     * Returns the value of the '<em><b>Thetazero</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Thetazero</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #setThetazero(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_Thetazero()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.thetazero' kind='element'"
     * @generated
     */
    Float getThetazero();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetazero</em>' attribute.
     * @see #isSetThetazero()
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @generated
     */
    void setThetazero( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Float)
     * @generated
     */
    void unsetThetazero();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getThetazero <em>Thetazero</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetazero</em>' attribute is set.
     * @see #unsetThetazero()
     * @see #getThetazero()
     * @see #setThetazero(Float)
     * @generated
     */
    boolean isSetThetazero();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Turbine Type3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindAeroTwoDimIEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC
     * @model opposite="WindAeroTwoDimIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindAeroTwoDimIEC.WindTurbineType3IEC' kind='element'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

} // WindAeroTwoDimIEC
