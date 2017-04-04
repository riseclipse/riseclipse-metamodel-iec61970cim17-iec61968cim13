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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wind Turbine Type3 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindGenType3IEC <em>Wind Gen Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC()
 * @model
 * @generated
 */
public interface WindTurbineType3IEC extends WindTurbineType3or4IEC {
    /**
     * Returns the value of the '<em><b>Wind Aero One Dim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroOneDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Aero One Dim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Aero One Dim IEC</em>' reference.
     * @see #isSetWindAeroOneDimIEC()
     * @see #unsetWindAeroOneDimIEC()
     * @see #setWindAeroOneDimIEC(WindAeroOneDimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindAeroOneDimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroOneDimIEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindAeroOneDimIEC' kind='element'"
     * @generated
     */
    WindAeroOneDimIEC getWindAeroOneDimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Aero One Dim IEC</em>' reference.
     * @see #isSetWindAeroOneDimIEC()
     * @see #unsetWindAeroOneDimIEC()
     * @see #getWindAeroOneDimIEC()
     * @generated
     */
    void setWindAeroOneDimIEC( WindAeroOneDimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindAeroOneDimIEC()
     * @see #getWindAeroOneDimIEC()
     * @see #setWindAeroOneDimIEC(WindAeroOneDimIEC)
     * @generated
     */
    void unsetWindAeroOneDimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroOneDimIEC <em>Wind Aero One Dim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Aero One Dim IEC</em>' reference is set.
     * @see #unsetWindAeroOneDimIEC()
     * @see #getWindAeroOneDimIEC()
     * @see #setWindAeroOneDimIEC(WindAeroOneDimIEC)
     * @generated
     */
    boolean isSetWindAeroOneDimIEC();

    /**
     * Returns the value of the '<em><b>Wind Aero Two Dim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Aero Two Dim IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Aero Two Dim IEC</em>' reference.
     * @see #isSetWindAeroTwoDimIEC()
     * @see #unsetWindAeroTwoDimIEC()
     * @see #setWindAeroTwoDimIEC(WindAeroTwoDimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindAeroTwoDimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindAeroTwoDimIEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindAeroTwoDimIEC' kind='element'"
     * @generated
     */
    WindAeroTwoDimIEC getWindAeroTwoDimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Aero Two Dim IEC</em>' reference.
     * @see #isSetWindAeroTwoDimIEC()
     * @see #unsetWindAeroTwoDimIEC()
     * @see #getWindAeroTwoDimIEC()
     * @generated
     */
    void setWindAeroTwoDimIEC( WindAeroTwoDimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindAeroTwoDimIEC()
     * @see #getWindAeroTwoDimIEC()
     * @see #setWindAeroTwoDimIEC(WindAeroTwoDimIEC)
     * @generated
     */
    void unsetWindAeroTwoDimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindAeroTwoDimIEC <em>Wind Aero Two Dim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Aero Two Dim IEC</em>' reference is set.
     * @see #unsetWindAeroTwoDimIEC()
     * @see #getWindAeroTwoDimIEC()
     * @see #setWindAeroTwoDimIEC(WindAeroTwoDimIEC)
     * @generated
     */
    boolean isSetWindAeroTwoDimIEC();

    /**
     * Returns the value of the '<em><b>Wind Mech IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Mech IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindMechIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindMechIEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindMechIEC' kind='element'"
     * @generated
     */
    WindMechIEC getWindMechIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Mech IEC</em>' reference.
     * @see #isSetWindMechIEC()
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @generated
     */
    void setWindMechIEC( WindMechIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    void unsetWindMechIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindMechIEC <em>Wind Mech IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Mech IEC</em>' reference is set.
     * @see #unsetWindMechIEC()
     * @see #getWindMechIEC()
     * @see #setWindMechIEC(WindMechIEC)
     * @generated
     */
    boolean isSetWindMechIEC();

    /**
     * Returns the value of the '<em><b>Wind Gen Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Gen Type3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Gen Type3 IEC</em>' reference.
     * @see #isSetWindGenType3IEC()
     * @see #unsetWindGenType3IEC()
     * @see #setWindGenType3IEC(WindGenType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindGenType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindGenType3IEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindGenType3IEC' kind='element'"
     * @generated
     */
    WindGenType3IEC getWindGenType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindGenType3IEC <em>Wind Gen Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Type3 IEC</em>' reference.
     * @see #isSetWindGenType3IEC()
     * @see #unsetWindGenType3IEC()
     * @see #getWindGenType3IEC()
     * @generated
     */
    void setWindGenType3IEC( WindGenType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindGenType3IEC <em>Wind Gen Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenType3IEC()
     * @see #getWindGenType3IEC()
     * @see #setWindGenType3IEC(WindGenType3IEC)
     * @generated
     */
    void unsetWindGenType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindGenType3IEC <em>Wind Gen Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Type3 IEC</em>' reference is set.
     * @see #unsetWindGenType3IEC()
     * @see #getWindGenType3IEC()
     * @see #setWindGenType3IEC(WindGenType3IEC)
     * @generated
     */
    boolean isSetWindGenType3IEC();

    /**
     * Returns the value of the '<em><b>Wind Cont Pitch Angle IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont Pitch Angle IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont Pitch Angle IEC</em>' reference.
     * @see #isSetWindContPitchAngleIEC()
     * @see #unsetWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindContPitchAngleIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPitchAngleIEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindContPitchAngleIEC' kind='element'"
     * @generated
     */
    WindContPitchAngleIEC getWindContPitchAngleIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Pitch Angle IEC</em>' reference.
     * @see #isSetWindContPitchAngleIEC()
     * @see #unsetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @generated
     */
    void setWindContPitchAngleIEC( WindContPitchAngleIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @generated
     */
    void unsetWindContPitchAngleIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPitchAngleIEC <em>Wind Cont Pitch Angle IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Pitch Angle IEC</em>' reference is set.
     * @see #unsetWindContPitchAngleIEC()
     * @see #getWindContPitchAngleIEC()
     * @see #setWindContPitchAngleIEC(WindContPitchAngleIEC)
     * @generated
     */
    boolean isSetWindContPitchAngleIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont PType3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wind Cont PType3 IEC</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWindTurbineType3IEC_WindContPType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC#getWindTurbineType3IEC
     * @model opposite="WindTurbineType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WindTurbineType3IEC.WindContPType3IEC' kind='element'"
     * @generated
     */
    WindContPType3IEC getWindContPType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @generated
     */
    void setWindContPType3IEC( WindContPType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    void unsetWindContPType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType3 IEC</em>' reference is set.
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    boolean isSetWindContPType3IEC();

} // WindTurbineType3IEC
