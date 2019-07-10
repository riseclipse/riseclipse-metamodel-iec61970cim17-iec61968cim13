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
 * A representation of the model object '<em><b>Wind Turbine Type3or4 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQLimIEC <em>Wind Cont QLim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC()
 * @model
 * @generated
 */
public interface WindTurbineType3or4IEC extends WindTurbineType3or4Dynamics {
    /**
     * Returns the value of the '<em><b>Wind Cont Curr Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Curr Lim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WindContCurrLimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WindContCurrLimIEC' kind='element'"
     * @generated
     */
    WindContCurrLimIEC getWindContCurrLimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @generated
     */
    void setWindContCurrLimIEC( WindContCurrLimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    void unsetWindContCurrLimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Curr Lim IEC</em>' reference is set.
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    boolean isSetWindContCurrLimIEC();

    /**
     * Returns the value of the '<em><b>Wind Ref Frame Rot IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Ref Frame Rot IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Ref Frame Rot IEC</em>' reference.
     * @see #isSetWindRefFrameRotIEC()
     * @see #unsetWindRefFrameRotIEC()
     * @see #setWindRefFrameRotIEC(WindRefFrameRotIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WindRefFrameRotIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WindRefFrameRotIEC' kind='element'"
     * @generated
     */
    WindRefFrameRotIEC getWindRefFrameRotIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Ref Frame Rot IEC</em>' reference.
     * @see #isSetWindRefFrameRotIEC()
     * @see #unsetWindRefFrameRotIEC()
     * @see #getWindRefFrameRotIEC()
     * @generated
     */
    void setWindRefFrameRotIEC( WindRefFrameRotIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindRefFrameRotIEC()
     * @see #getWindRefFrameRotIEC()
     * @see #setWindRefFrameRotIEC(WindRefFrameRotIEC)
     * @generated
     */
    void unsetWindRefFrameRotIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Ref Frame Rot IEC</em>' reference is set.
     * @see #unsetWindRefFrameRotIEC()
     * @see #getWindRefFrameRotIEC()
     * @see #setWindRefFrameRotIEC(WindRefFrameRotIEC)
     * @generated
     */
    boolean isSetWindRefFrameRotIEC();

    /**
     * Returns the value of the '<em><b>Wind Protection IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Protection IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WindProtectionIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WindProtectionIEC' kind='element'"
     * @generated
     */
    WindProtectionIEC getWindProtectionIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @generated
     */
    void setWindProtectionIEC( WindProtectionIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    void unsetWindProtectionIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Protection IEC</em>' reference is set.
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    boolean isSetWindProtectionIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont QLim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont QLim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont QLim IEC</em>' reference.
     * @see #isSetWindContQLimIEC()
     * @see #unsetWindContQLimIEC()
     * @see #setWindContQLimIEC(WindContQLimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WindContQLimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQLimIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WindContQLimIEC' kind='element'"
     * @generated
     */
    WindContQLimIEC getWindContQLimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQLimIEC <em>Wind Cont QLim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont QLim IEC</em>' reference.
     * @see #isSetWindContQLimIEC()
     * @see #unsetWindContQLimIEC()
     * @see #getWindContQLimIEC()
     * @generated
     */
    void setWindContQLimIEC( WindContQLimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQLimIEC <em>Wind Cont QLim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContQLimIEC()
     * @see #getWindContQLimIEC()
     * @see #setWindContQLimIEC(WindContQLimIEC)
     * @generated
     */
    void unsetWindContQLimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQLimIEC <em>Wind Cont QLim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont QLim IEC</em>' reference is set.
     * @see #unsetWindContQLimIEC()
     * @see #getWindContQLimIEC()
     * @see #setWindContQLimIEC(WindContQLimIEC)
     * @generated
     */
    boolean isSetWindContQLimIEC();

    /**
     * Returns the value of the '<em><b>WInd Cont QIEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>WInd Cont QIEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>WInd Cont QIEC</em>' reference.
     * @see #isSetWIndContQIEC()
     * @see #unsetWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WIndContQIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WIndContQIEC' kind='element'"
     * @generated
     */
    WindContQIEC getWIndContQIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>WInd Cont QIEC</em>' reference.
     * @see #isSetWIndContQIEC()
     * @see #unsetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @generated
     */
    void setWIndContQIEC( WindContQIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @generated
     */
    void unsetWIndContQIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWIndContQIEC <em>WInd Cont QIEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>WInd Cont QIEC</em>' reference is set.
     * @see #unsetWIndContQIEC()
     * @see #getWIndContQIEC()
     * @see #setWIndContQIEC(WindContQIEC)
     * @generated
     */
    boolean isSetWIndContQIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont QPQU Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQPQULimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont QPQU Lim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont QPQU Lim IEC</em>' reference.
     * @see #isSetWindContQPQULimIEC()
     * @see #unsetWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3or4IEC_WindContQPQULimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContQPQULimIEC#getWindTurbineType3or4IEC
     * @model opposite="WindTurbineType3or4IEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3or4IEC.WindContQPQULimIEC' kind='element'"
     * @generated
     */
    WindContQPQULimIEC getWindContQPQULimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont QPQU Lim IEC</em>' reference.
     * @see #isSetWindContQPQULimIEC()
     * @see #unsetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @generated
     */
    void setWindContQPQULimIEC( WindContQPQULimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @generated
     */
    void unsetWindContQPQULimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont QPQU Lim IEC</em>' reference is set.
     * @see #unsetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @generated
     */
    boolean isSetWindContQPQULimIEC();

} // WindTurbineType3or4IEC
